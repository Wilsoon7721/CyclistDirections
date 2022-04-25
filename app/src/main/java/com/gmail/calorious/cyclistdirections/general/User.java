package com.gmail.calorious.cyclistdirections.general;

public class User {
    /*
     * General class for User
     * Each phone should be identified from MAC Address, Settings.Secure#ANDROID_ID, and a random unique identifier generated by the application.
     */
    private long uniqueId;
    private String macAddress;
    private String androidId;

    public User(long uniqueIdentifier) {
        // Obtain other data and update accordingly
    }

    // Create new one
    protected User(long uniqueId, String macAddress, String androidId) {
        this.uniqueId = uniqueId;
        this.macAddress = macAddress;
        this.androidId = androidId;
    }

    public long getUniqueIdentifier() {
        return uniqueId;
    }

    public String getMacAddress() {
        return macAddress;
    }

    protected String getAndroidId() {
        return androidId;
    }
}
