package com.example.restful.entity;

public class Model {

    private String modelName;
    private String modelNum;

    public Model(String modelName, String modelNum) {
        this.modelName = modelName;
        this.modelNum = modelNum;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getModelNum() {
        return modelNum;
    }

    public void setModelNum(String modelNum) {
        this.modelNum = modelNum;
    }
}
