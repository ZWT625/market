package com.tao.market.pojo;

public class Receive {
    private String uid;//请求用户id
    private String token;//	请求用户token
    private String source;//请求来源


    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    @Override
    public String toString() {
        return "Receive{" +
                "uid='" + uid + '\'' +
                ", token='" + token + '\'' +
                ", source='" + source + '\'' +
                '}';
    }
}
