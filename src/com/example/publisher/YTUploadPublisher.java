package com.example.publisher;

import com.example.Utils;
import com.example.repository.IRepository;
import com.example.subscriber.ISubscriber;
import com.example.subscriber.SubNotificationConfig;

import java.util.List;

public class YTUploadPublisher implements IPublisher {

    private IRepository repository;

    public YTUploadPublisher() {

    }

    @Override
    public void notifyObservers(Integer publisherId, Object notificationPayload) {

        // creating notification from template and payload
        List<SubNotificationConfig> subscribers = repository.getSubscriberList(publisherId);
        subscribers.forEach(subscriberData-> {
            subscriberData.getSubscriptionType().forEach(subscriberType -> {
                ISubscriber subscriber = Utils.getSubscriber(subscriberType);
                subscriber.update(subscriberData, notificationPayload);
            });
        });
    }
}
