package org.donstu.service;

import org.donstu.domain.Place;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

import java.util.ArrayList;
import java.util.List;

import static javax.jws.soap.SOAPBinding.ParameterStyle.WRAPPED;
import static javax.jws.soap.SOAPBinding.Style.DOCUMENT;
import static javax.jws.soap.SOAPBinding.Use.LITERAL;

@WebService(serviceName = "BookingService", portName = "BookingPort",
    targetNamespace = "https://donstu.org/booking")
@SOAPBinding(style = DOCUMENT, use = LITERAL, parameterStyle = WRAPPED)
public class BookingService {

    @WebMethod(operationName = "getFreePlaces")
    public List<Place> getFreePlaces() {
        List<Place> result = new ArrayList<>();
        result.add(new Place("Red", 1, 1));
        result.add(new Place("Blue", 1, 2));
        result.add(new Place("Red", 2, 1));
        result.add(new Place("Red", 2, 2));
        result.add(new Place("Green", 1, 1));
        result.add(new Place("Yelow", 1, 2));
        result.add(new Place("Green", 2, 1));
        result.add(new Place("Green", 2, 2));
        return result;
    }
}
