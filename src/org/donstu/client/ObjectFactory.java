
package org.donstu.client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.donstu.client package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetFreePlacesResponse_QNAME = new QName("https://donstu.org/booking", "getFreePlacesResponse");
    private final static QName _GetFreePlaces_QNAME = new QName("https://donstu.org/booking", "getFreePlaces");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.donstu.client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetFreePlacesResponse }
     * 
     */
    public GetFreePlacesResponse createGetFreePlacesResponse() {
        return new GetFreePlacesResponse();
    }

    /**
     * Create an instance of {@link GetFreePlaces }
     * 
     */
    public GetFreePlaces createGetFreePlaces() {
        return new GetFreePlaces();
    }

    /**
     * Create an instance of {@link Place }
     * 
     */
    public Place createPlace() {
        return new Place();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFreePlacesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://donstu.org/booking", name = "getFreePlacesResponse")
    public JAXBElement<GetFreePlacesResponse> createGetFreePlacesResponse(GetFreePlacesResponse value) {
        return new JAXBElement<GetFreePlacesResponse>(_GetFreePlacesResponse_QNAME, GetFreePlacesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFreePlaces }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://donstu.org/booking", name = "getFreePlaces")
    public JAXBElement<GetFreePlaces> createGetFreePlaces(GetFreePlaces value) {
        return new JAXBElement<GetFreePlaces>(_GetFreePlaces_QNAME, GetFreePlaces.class, null, value);
    }

}
