
package webservices;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "RandomService", targetNamespace = "http://webservices/", wsdlLocation = "http://localhost:8080/RandomService/Random?WSDL")
public class RandomService
    extends Service
{

    private final static URL RANDOMSERVICE_WSDL_LOCATION;
    private final static WebServiceException RANDOMSERVICE_EXCEPTION;
    private final static QName RANDOMSERVICE_QNAME = new QName("http://webservices/", "RandomService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/RandomService/Random?WSDL");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        RANDOMSERVICE_WSDL_LOCATION = url;
        RANDOMSERVICE_EXCEPTION = e;
    }

    public RandomService() {
        super(__getWsdlLocation(), RANDOMSERVICE_QNAME);
    }

    public RandomService(WebServiceFeature... features) {
        super(__getWsdlLocation(), RANDOMSERVICE_QNAME, features);
    }

    public RandomService(URL wsdlLocation) {
        super(wsdlLocation, RANDOMSERVICE_QNAME);
    }

    public RandomService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, RANDOMSERVICE_QNAME, features);
    }

    public RandomService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public RandomService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns Random
     */
    @WebEndpoint(name = "RandomPort")
    public Random getRandomPort() {
        return super.getPort(new QName("http://webservices/", "RandomPort"), Random.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Random
     */
    @WebEndpoint(name = "RandomPort")
    public Random getRandomPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://webservices/", "RandomPort"), Random.class, features);
    }

    private static URL __getWsdlLocation() {
        if (RANDOMSERVICE_EXCEPTION!= null) {
            throw RANDOMSERVICE_EXCEPTION;
        }
        return RANDOMSERVICE_WSDL_LOCATION;
    }

}
