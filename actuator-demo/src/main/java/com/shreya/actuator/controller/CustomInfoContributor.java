package com.shreya.actuator.controller;

import org.springframework.boot.actuate.info.Info;
import org.springframework.boot.actuate.info.InfoContributor;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class CustomInfoContributor implements InfoContributor {
//    @Override
//    public void contribute(Info.Builder builder) {
//        builder.withDetail("project", Map.of(
//                "name", "Foodease - Food Order Booking System",
//                "version", "1.0.0",
//                "developer", "Shreya"
//        ));
//    }

    @Override
    public void contribute(Info.Builder builder) {
        builder.withDetail("project", Map.of(
                "name", "Foodease - Food Order Booking System",
                "version", "1.0.0",
                "developer", "Shreya"
        ));
    }
}
