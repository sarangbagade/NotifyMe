package com.example.subscriber;


import java.util.List;
import java.util.Objects;

public class SubNotificationConfig {

    private String email;
    private String phoneNumber;
    private String iOSDeviceToken;
    private String androidDeviceToken;
    private List<SubscriptionType> subscriptionType;

    public SubNotificationConfig(String email, String phoneNumber, List<SubscriptionType> subscriptionType) {
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.subscriptionType = subscriptionType;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public List<SubscriptionType> getSubscriptionType() {
        return subscriptionType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SubNotificationConfig that = (SubNotificationConfig) o;
        return Objects.equals(email, that.email) && Objects.equals(phoneNumber, that.phoneNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(email, phoneNumber);
    }
}
