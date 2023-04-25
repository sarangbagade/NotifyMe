package com.example;

import com.example.publisher.IPublisher;
import com.example.publisher.YTUploadPublisher;

public class NotificationService {

    IPublisher observable;
    public NotificationService()
    {
        this.observable = new YTUploadPublisher();
    }


}
