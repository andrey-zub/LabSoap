package org.donstu;

import org.donstu.service.BookingService;

import javax.xml.ws.Endpoint;

public class ServiceHost {
    public static void main(String[] args) {
        System.out.println("Starting Web service...");
        Endpoint.publish("http://127.0.0.1:8088/booking", new BookingService());
    }
}