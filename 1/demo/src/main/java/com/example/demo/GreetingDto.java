package com.example.demo;

public class GreetingDto {
    private String msg;

    public GreetingDto() {}  //for json deserialization

    public GreetingDto(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }



}
