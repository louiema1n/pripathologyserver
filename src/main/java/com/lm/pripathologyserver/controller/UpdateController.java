package com.lm.pripathologyserver.controller;

import com.lm.pripathologyserver.domain.Update;
import com.lm.pripathologyserver.service.UpdateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;

/**
 * @Program: pripathologyserver
 * @Type: Class
 * @Description: update
 * @Author: louiemain
 * @Created: 2018-04-09 10:56
 **/
@Controller
@RequestMapping("/upd")
public class UpdateController {

    @Autowired
    private UpdateService updateService;

    @Value("${apk.path}")
    public String APK_PATH;

    @RequestMapping(value = "/last", method = RequestMethod.GET)
    @ResponseBody
    public Update getLastOne() {
        return this.updateService.getLastOne();
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String addOne(@RequestParam("file") MultipartFile file,
                         @RequestParam("upgradeinfo") String upgradeinfo,
                         @RequestParam("lastForce") boolean lastForce) {
        String filename = file.getOriginalFilename();
        String apkSavePath = "";

        // 存储apk文件
        File dist = new File(APK_PATH + filename);
        if (!dist.getParentFile().exists()) {
            // 不存在，则创建
            dist.getParentFile().mkdirs();
        }
        BufferedOutputStream bos = null;
        try {
            bos = new BufferedOutputStream(new FileOutputStream(dist));
            bos.write(file.getBytes());
            bos.flush();
            bos.close();
            apkSavePath = "/" + filename;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bos != null) {
                try {
                    bos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        // 格式化当前apk版本号
        String  serverVersion = filename.substring(0, filename.lastIndexOf("."));
        serverVersion = serverVersion.substring(0, serverVersion.lastIndexOf("."));
        serverVersion = serverVersion.substring(0, serverVersion.lastIndexOf("."));
        serverVersion = serverVersion.substring(serverVersion.lastIndexOf(".") + 1);

        Update update = new Update();
        update.setUpdateurl(apkSavePath);
        update.setAppname(filename);
        update.setLastForce(lastForce);
        update.setUpgradeinfo(upgradeinfo);
        update.setServerVersion(Integer.parseInt(serverVersion));
        if (this.updateService.addOne(update) > 0) {
            return "redirect:/index";
        }
        return "上传失败";
    }
}
