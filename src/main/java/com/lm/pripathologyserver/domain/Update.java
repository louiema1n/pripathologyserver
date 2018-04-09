package com.lm.pripathologyserver.domain;

/**
 * @Program: pripathologyserver
 * @Type: Class
 * @Description: apk更新
 * @Author: louiemain
 * @Created: 2018-04-09 10:44
 **/
public class Update {

    private int id;
    private String appname;
    private int serverVersion;
    private boolean lastForce;
    private String updateurl;
    private String upgradeinfo;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAppname() {
        return appname;
    }

    public void setAppname(String appname) {
        this.appname = appname;
    }

    public int getServerVersion() {
        return serverVersion;
    }

    public void setServerVersion(int serverVersion) {
        this.serverVersion = serverVersion;
    }

    public boolean isLastForce() {
        return lastForce;
    }

    public void setLastForce(boolean lastForce) {
        this.lastForce = lastForce;
    }

    public String getUpdateurl() {
        return updateurl;
    }

    public void setUpdateurl(String updateurl) {
        this.updateurl = updateurl;
    }

    public String getUpgradeinfo() {
        return upgradeinfo;
    }

    public void setUpgradeinfo(String upgradeinfo) {
        this.upgradeinfo = upgradeinfo;
    }
}
