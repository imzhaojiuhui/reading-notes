package com.zgiot.soft.api.apkmanager.pojo.bean;

import com.zgiot.soft.common.pojo.CommPojo;

/**
 * @author 闫晨
 * @Description
 * @date 2017/11/28 14:21
 * @
 */
public class AppVersion extends CommPojo {
    private Long id;
    private Integer appType;
    private String type;
    private String code;
    private Integer whetherUpdate;
    private String url;
    private String createTime;
    private String note;
    private Integer state;
    private String content;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getAppType() {
        return appType;
    }

    public void setAppType(Integer appType) {
        this.appType = appType;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Integer getWhetherUpdate() {
        return whetherUpdate;
    }

    public void setWhetherUpdate(Integer whetherUpdate) {
        this.whetherUpdate = whetherUpdate;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
