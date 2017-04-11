package com.example.vrushank.multibhashi.Model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by vrushank on 10/4/17.
 */

public class Model {
    @SerializedName("itemId")
    private String itemid;

    @SerializedName("desc")
    private String desc;

    @SerializedName("audio")
    private String audio;

    public Model(String itemid, String desc, String audio) {
        this.itemid = itemid;
        this.desc = desc;
        this.audio = audio;
    }

    public String getItemid() {
        return itemid;
    }

    public void setItemid(String itemid) {
        this.itemid = itemid;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getAudio() {
        return audio;
    }

    public void setAudio(String audio) {
        this.audio = audio;
    }
}
