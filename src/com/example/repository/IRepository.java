package com.example.repository;

import com.example.subscriber.SubNotificationConfig;

import java.util.List;

public interface IRepository {

    void subscribe(Integer publisherId, Integer subscriberId);
    void unsubscribe(Integer publisherId, Integer subscriberId);

    List<SubNotificationConfig> getSubscriberList(Integer publisherId);

    void addSubscriber(SubNotificationConfig subNotificationConfig);
    SubNotificationConfig getSubscriberData(Integer subscriberId);
}
