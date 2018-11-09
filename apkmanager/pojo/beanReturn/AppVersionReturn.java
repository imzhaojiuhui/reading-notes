package com.zgiot.soft.api.apkmanager.pojo.beanReturn;

import java.util.List;
import java.util.Map;

/**
 * @author 闫晨
 * @Description
 * @date 2017/11/28 14:31
 * @
 */
public class AppVersionReturn {
    private Long id;
    private Integer appType;
    private String type;
    private String code;
    private String createTime;
    private Integer whetherUpdate;
    private String url;
    private String note;
    private String content;
    private List<Map> contentList;

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

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public List<Map> getContentList() {
        return contentList;
    }

    public void setContentList(List<Map> contentList) {
        this.contentList = contentList;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }
}
