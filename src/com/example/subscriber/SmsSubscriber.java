package com.example.subscriber;

public class SmsSubscriber implements ISubscriber{

    @Override
    public void update(SubNotificationConfig subNotificationConfig, Object notificationPayload) {

        notifyBySms(subNotificationConfig.getPhoneNumber(), notificationPayload);
    }

    private void notifyBySms(String phoneNumber, Object notificationPayload)
    {
        System.out.println("sending notification payload to phoneNumber " + phoneNumber);
    }
}
