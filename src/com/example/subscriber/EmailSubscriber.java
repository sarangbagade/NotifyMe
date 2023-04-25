package com.example.subscriber;

import com.example.repository.IRepository;

public class EmailSubscriber implements ISubscriber {

    private IRepository repository;
    public EmailSubscriber() {

    }

    @Override
    public void update(SubNotificationConfig subNotificationConfig, Object notificationPayload) {

        notifyByEmail(subNotificationConfig.getEmail(), notificationPayload);
    }

    private void notifyByEmail(String email, Object notificationPayload)
    {
        String msg = String.format("sending notification payload to email id : %s", email);
        System.out.println(msg);
    }

}
