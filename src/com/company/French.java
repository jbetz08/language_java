package com.company;

public class French {
    private int id;
    private String hello;

    public French(int id, String hello) {
        this.id = id;
        this.hello = hello;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHello() {
        return hello;
    }

    public void setHello(String hello) {
        this.hello = hello;
    }
}
