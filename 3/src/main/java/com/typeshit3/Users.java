package com.typeshit3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


public class Users {
    private String name;

    public Users() {}

    public Users(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
