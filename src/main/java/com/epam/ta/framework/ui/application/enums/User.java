package com.epam.ta.framework.ui.application.enums;

public enum User {
    T_USER("dab", "1q2w3e4r5t", "Dina Abdykasheva"),
    APPROVER("fs", "0", "Galina Fesik");

    private String login;
    private String password ;
    private String fullName;

    User(String login, String password, String fullName) {
        this.login = login;
        this.password = password;
        this.fullName = fullName;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public String getFullName() {
        return fullName;
    }

    @Override
    public String toString() {
        return "User{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", fullName='" + fullName + '\'' +
                '}';
    }
}
