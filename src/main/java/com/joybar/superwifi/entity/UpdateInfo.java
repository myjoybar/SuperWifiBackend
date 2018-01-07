package com.joybar.superwifi.entity;

import java.util.List;

/**
 * Created by joybar on 07/01/18.
 */
public class UpdateInfo {
    private int versionCode;
    private String versionName;
    private String updateTitle;
    private List<String> updateContentList;
    private boolean isForceUpdate;

    public int getVersionCode() {
        return versionCode;
    }

    public void setVersionCode(int versionCode) {
        this.versionCode = versionCode;
    }

    public String getVersionName() {
        return versionName;
    }

    public void setVersionName(String versionName) {
        this.versionName = versionName;
    }

    public String getUpdateTitle() {
        return updateTitle;
    }

    public void setUpdateTitle(String updateTitle) {
        this.updateTitle = updateTitle;
    }

    public List<String> getUpdateContentList() {
        return updateContentList;
    }

    public void setUpdateContentList(List<String> updateContentList) {
        this.updateContentList = updateContentList;
    }

    public boolean isForceUpdate() {
        return isForceUpdate;
    }

    public void setIsForceUpdate(boolean isForceUpdate) {
        this.isForceUpdate = isForceUpdate;
    }

    @Override
    public String toString() {
        return "UpdateInfo{" +
                "versionCode=" + versionCode +
                ", versionName='" + versionName + '\'' +
                ", updateTitle='" + updateTitle + '\'' +
                ", updateContentList=" + updateContentList +
                ", isForceUpdate=" + isForceUpdate +
                '}';
    }
}
