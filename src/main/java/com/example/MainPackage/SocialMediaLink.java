package com.example.MainPackage;

public class SocialMediaLink {
    private String platform;
    private String url;

    public SocialMediaLink(String platform, String url) {
        this.platform = platform;
        this.url = url;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getPlatform() {
        return platform;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }
}