package com.example.subscriber;

public interface ISubscriber {

    void update(SubNotificationConfig subNotificationConfig, Object payloadObject);
}
