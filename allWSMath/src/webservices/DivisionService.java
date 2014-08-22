
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
@WebServiceClient(name = "DivisionService", targetNamespace = "http://webservices/", wsdlLocation = "http://localhost:8080/DivisionService/Division?WSDL")
public class DivisionService
    extends Service
{

    private final static URL DIVISIONSERVICE_WSDL_LOCATION;
    private final static WebServiceException DIVISIONSERVICE_EXCEPTION;
    private final static QName DIVISIONSERVICE_QNAME = new QName("http://webservices/", "DivisionService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/DivisionService/Division?WSDL");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        DIVISIONSERVICE_WSDL_LOCATION = url;
        DIVISIONSERVICE_EXCEPTION = e;
    }

    public DivisionService() {
        super(__getWsdlLocation(), DIVISIONSERVICE_QNAME);
    }

    public DivisionService(WebServiceFeature... features) {
        super(__getWsdlLocation(), DIVISIONSERVICE_QNAME, features);
    }

    public DivisionService(URL wsdlLocation) {
        super(wsdlLocation, DIVISIONSERVICE_QNAME);
    }

    public DivisionService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, DIVISIONSERVICE_QNAME, features);
    }

    public DivisionService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public DivisionService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns Division
     */
    @WebEndpoint(name = "DivisionPort")
    public Division getDivisionPort() {
        return super.getPort(new QName("http://webservices/", "DivisionPort"), Division.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Division
     */
    @WebEndpoint(name = "DivisionPort")
    public Division getDivisionPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://webservices/", "DivisionPort"), Division.class, features);
    }

    private static URL __getWsdlLocation() {
        if (DIVISIONSERVICE_EXCEPTION!= null) {
            throw DIVISIONSERVICE_EXCEPTION;
        }
        return DIVISIONSERVICE_WSDL_LOCATION;
    }

}