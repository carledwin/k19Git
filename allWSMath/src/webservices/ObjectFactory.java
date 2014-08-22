
package webservices;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the webservices package. 
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

    private final static QName _Random_QNAME = new QName("http://webservices/", "random");
    private final static QName _RandomResponse_QNAME = new QName("http://webservices/", "randomResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: webservices
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RandomResponse }
     * 
     */
    public RandomResponse createRandomResponse() {
        return new RandomResponse();
    }

    /**
     * Create an instance of {@link Random_Type }
     * 
     */
    public Random_Type createRandom_Type() {
        return new Random_Type();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Random_Type }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "random")
    public JAXBElement<Random_Type> createRandom(Random_Type value) {
        return new JAXBElement<Random_Type>(_Random_QNAME, Random_Type.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RandomResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "randomResponse")
    public JAXBElement<RandomResponse> createRandomResponse(RandomResponse value) {
        return new JAXBElement<RandomResponse>(_RandomResponse_QNAME, RandomResponse.class, null, value);
    }

}
