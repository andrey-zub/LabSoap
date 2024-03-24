package org.donstu;

import org.donstu.client.BookingService;
import org.donstu.client.BookingService_Service;
import org.donstu.client.Place;

import javax.xml.namespace.QName;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class ServiceClient {
    private static final QName FQDN = new QName("https://donstu.org/booking", "BookingService");

    private static URL getWsdlUrl(String urlStr) {
        URL url = null;
        try {
            url = new URL(urlStr);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
        return url;
    }

    public void processFreePlaces(URL url) {
        BookingService_Service svc = new BookingService_Service(url, FQDN);
        BookingService port = svc.getBookingPort();
        List<Place> freePlaces = port.getFreePlaces();
        freePlaces.forEach(place -> System.out.println("Place{" +
                "hall='" + place.getHall() + '\'' +
                ", row=" + place.getRow() +
                ", place=" + place.getPlace() +
                '}'));
    }

    public static void main(String[] args) {
        URL wsdlUrl = getWsdlUrl("http://127.0.0.1:8088/booking?wsdl");
        ServiceClient client = new ServiceClient();
        client.processFreePlaces(wsdlUrl);
    }
}
