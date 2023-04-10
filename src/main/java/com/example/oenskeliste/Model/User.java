package com.example.oenskeliste.Model;

public class User {

    private int user_id;
    private String user_Name;
    private String password;

    public User() {
    }

    public User(int user_id, String user_Name, String password) {
        this.user_id = user_id;
        this.user_Name = user_Name;
        this.password = password;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getUser_Name() {
        return user_Name;
    }

    public void setUser_Name(String user_Name) {
        this.user_Name = user_Name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
