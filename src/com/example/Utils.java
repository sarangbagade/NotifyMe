package com.example;

import com.example.subscriber.EmailSubscriber;
import com.example.subscriber.ISubscriber;
import com.example.subscriber.SmsSubscriber;
import com.example.subscriber.SubscriptionType;

import java.util.HashMap;
import java.util.Map;

public class Utils {

    private static Map<SubscriptionType, ISubscriber> subscriberMap = new HashMap<>();
    static {
        subscriberMap.put(SubscriptionType.SMS, new SmsSubscriber());
        subscriberMap.put(SubscriptionType.EMAIL, new EmailSubscriber());
    }
    public static ISubscriber getSubscriber(SubscriptionType subscriptionType)
    {
        return subscriberMap.get(subscriptionType);
    }
}
