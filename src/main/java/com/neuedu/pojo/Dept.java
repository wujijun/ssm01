package com.neuedu.pojo;

import lombok.Data;

@Data
public class Dept {
    private String pname;

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }
}
