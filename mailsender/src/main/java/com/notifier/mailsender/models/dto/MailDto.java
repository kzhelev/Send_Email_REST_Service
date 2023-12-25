package com.notifier.mailsender.models.dto;

public class MailDto {

    private String host;
    private String username;
    private String password;
    private String sendTo;
    private String object;
    private String body;

    public MailDto(String host, String username, String password, String sendTo, String object, String body) {
        this.host = host;
        this.username = username;
        this.password = password;
        this.sendTo = sendTo;
        this.object = object;
        this.body = body;
    }

    public String getSendTo() {
        return sendTo;
    }

    public void setSendTo(String sendTo) {
        this.sendTo = sendTo;
    }

    public String getObject() {
        return object;
    }

    public void setObject(String object) {
        this.object = object;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
