package com.example.vrushank.multibhashi.Model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by vrushank on 10/4/17.
 */

public class ApiResponse {
    @SerializedName("data")
    private List<Model> data;

    public List<Model> getData() {
        return data;
    }

    public void setData(List<Model> data) {
        this.data = data;
    }
}
