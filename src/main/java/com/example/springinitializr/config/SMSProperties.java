package com.example.springinitializr.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@ConfigurationProperties(prefix = "prop")
public class SMSProperties {
    private String accessKeyId;

    private String accessKeySecret;

    private String cronSMS;

    private String cronPin;

    private List<String> phones;

    private List<String> contents;

    public String getAccessKeyId() {
        return accessKeyId;
    }

    public void setAccessKeyId(String accessKeyId) {
        this.accessKeyId = accessKeyId;
    }

    public String getAccessKeySecret() {
        return accessKeySecret;
    }

    public void setAccessKeySecret(String accessKeySecret) {
        this.accessKeySecret = accessKeySecret;
    }

    public String getCronSMS() {
        return cronSMS;
    }

    public void setCronSMS(String cronSMS) {
        this.cronSMS = cronSMS;
    }

    public String getCronPin() {
        return cronPin;
    }

    public void setCronPin(String cronPin) {
        this.cronPin = cronPin;
    }

    public List<String> getPhones() {
        return phones;
    }

    public void setPhones(List<String> phones) {
        this.phones = phones;
    }

    public List<String> getContents() {
        return contents;
    }

    public void setContents(List<String> contents) {
        this.contents = contents;
    }
}