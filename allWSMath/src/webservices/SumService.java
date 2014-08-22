
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
@WebServiceClient(name = "SumService", targetNamespace = "http://webservices/", wsdlLocation = "http://localhost:8080/SumService/Sum?WSDL")
public class SumService
    extends Service
{

    private final static URL SUMSERVICE_WSDL_LOCATION;
    private final static WebServiceException SUMSERVICE_EXCEPTION;
    private final static QName SUMSERVICE_QNAME = new QName("http://webservices/", "SumService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/SumService/Sum?WSDL");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        SUMSERVICE_WSDL_LOCATION = url;
        SUMSERVICE_EXCEPTION = e;
    }

    public SumService() {
        super(__getWsdlLocation(), SUMSERVICE_QNAME);
    }

    public SumService(WebServiceFeature... features) {
        super(__getWsdlLocation(), SUMSERVICE_QNAME, features);
    }

    public SumService(URL wsdlLocation) {
        super(wsdlLocation, SUMSERVICE_QNAME);
    }

    public SumService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, SUMSERVICE_QNAME, features);
    }

    public SumService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public SumService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns Sum
     */
    @WebEndpoint(name = "SumPort")
    public Sum getSumPort() {
        return super.getPort(new QName("http://webservices/", "SumPort"), Sum.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Sum
     */
    @WebEndpoint(name = "SumPort")
    public Sum getSumPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://webservices/", "SumPort"), Sum.class, features);
    }

    private static URL __getWsdlLocation() {
        if (SUMSERVICE_EXCEPTION!= null) {
            throw SUMSERVICE_EXCEPTION;
        }
        return SUMSERVICE_WSDL_LOCATION;
    }

}
