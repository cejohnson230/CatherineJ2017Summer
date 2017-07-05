package com.example.catherinejohnson.catherinej2017summer.audio;

import java.io.Serializable;

/**
 * Created by catherinejohnson on 7/5/17.
 */
public class BaseBean implements Serializable {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
