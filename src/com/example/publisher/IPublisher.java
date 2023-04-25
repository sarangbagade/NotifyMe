package com.example.publisher;

import com.example.repository.IRepository;

public interface IPublisher {

    IRepository repository = null;
    default void addSubscriber(Integer publisherId, Integer subscriberId) {

        repository.subscribe(publisherId, subscriberId);
    }

    default void removeSubscriber(Integer publisherId, Integer subscriberId) {

        repository.unsubscribe(publisherId, subscriberId);
    }

    void notifyObservers(Integer publisherId, Object notificationPayload);
}
