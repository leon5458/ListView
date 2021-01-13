package com.hly.listview;

import java.util.HashMap;
import java.util.Map;

public class ListBean {

    private int imgId;
    private String title;
    private String content;
    private String delete;

    public ListBean(int imgId, String title, String content, String delete) {
        this.imgId = imgId;
        this.title = title;
        this.content = content;
        this.delete = delete;

    }

    public String getDelete() {
        return delete;
    }

    public void setDelete(String delete) {
        this.delete = delete;
    }

    public int getImgId() {
        return imgId;
    }

    public void setImgId(int imgId) {
        this.imgId = imgId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
