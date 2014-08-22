
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
@WebServiceClient(name = "SubtractionService", targetNamespace = "http://webservices/", wsdlLocation = "http://localhost:8080/SubtractionService/Subtraction?WSDL")
public class SubtractionService
    extends Service
{

    private final static URL SUBTRACTIONSERVICE_WSDL_LOCATION;
    private final static WebServiceException SUBTRACTIONSERVICE_EXCEPTION;
    private final static QName SUBTRACTIONSERVICE_QNAME = new QName("http://webservices/", "SubtractionService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/SubtractionService/Subtraction?WSDL");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        SUBTRACTIONSERVICE_WSDL_LOCATION = url;
        SUBTRACTIONSERVICE_EXCEPTION = e;
    }

    public SubtractionService() {
        super(__getWsdlLocation(), SUBTRACTIONSERVICE_QNAME);
    }

    public SubtractionService(WebServiceFeature... features) {
        super(__getWsdlLocation(), SUBTRACTIONSERVICE_QNAME, features);
    }

    public SubtractionService(URL wsdlLocation) {
        super(wsdlLocation, SUBTRACTIONSERVICE_QNAME);
    }

    public SubtractionService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, SUBTRACTIONSERVICE_QNAME, features);
    }

    public SubtractionService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public SubtractionService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns Subtraction
     */
    @WebEndpoint(name = "SubtractionPort")
    public Subtraction getSubtractionPort() {
        return super.getPort(new QName("http://webservices/", "SubtractionPort"), Subtraction.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Subtraction
     */
    @WebEndpoint(name = "SubtractionPort")
    public Subtraction getSubtractionPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://webservices/", "SubtractionPort"), Subtraction.class, features);
    }

    private static URL __getWsdlLocation() {
        if (SUBTRACTIONSERVICE_EXCEPTION!= null) {
            throw SUBTRACTIONSERVICE_EXCEPTION;
        }
        return SUBTRACTIONSERVICE_WSDL_LOCATION;
    }

}
