
package webservice.cotadorcombustivel;

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
@WebServiceClient(name = "CotadorCombustivelService", targetNamespace = "http://cotadorcombustivel.webservice/", wsdlLocation = "http://localhost:8081/cotadorCombustivelWS?WSDL")
public class CotadorCombustivelService
    extends Service
{

    private final static URL COTADORCOMBUSTIVELSERVICE_WSDL_LOCATION;
    private final static WebServiceException COTADORCOMBUSTIVELSERVICE_EXCEPTION;
    private final static QName COTADORCOMBUSTIVELSERVICE_QNAME = new QName("http://cotadorcombustivel.webservice/", "CotadorCombustivelService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8081/cotadorCombustivelWS?WSDL");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        COTADORCOMBUSTIVELSERVICE_WSDL_LOCATION = url;
        COTADORCOMBUSTIVELSERVICE_EXCEPTION = e;
    }

    public CotadorCombustivelService() {
        super(__getWsdlLocation(), COTADORCOMBUSTIVELSERVICE_QNAME);
    }

    public CotadorCombustivelService(WebServiceFeature... features) {
        super(__getWsdlLocation(), COTADORCOMBUSTIVELSERVICE_QNAME, features);
    }

    public CotadorCombustivelService(URL wsdlLocation) {
        super(wsdlLocation, COTADORCOMBUSTIVELSERVICE_QNAME);
    }

    public CotadorCombustivelService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, COTADORCOMBUSTIVELSERVICE_QNAME, features);
    }

    public CotadorCombustivelService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public CotadorCombustivelService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns CotadorCombustivel
     */
    @WebEndpoint(name = "CotadorCombustivelPort")
    public CotadorCombustivel getCotadorCombustivelPort() {
        return super.getPort(new QName("http://cotadorcombustivel.webservice/", "CotadorCombustivelPort"), CotadorCombustivel.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CotadorCombustivel
     */
    @WebEndpoint(name = "CotadorCombustivelPort")
    public CotadorCombustivel getCotadorCombustivelPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://cotadorcombustivel.webservice/", "CotadorCombustivelPort"), CotadorCombustivel.class, features);
    }

    private static URL __getWsdlLocation() {
        if (COTADORCOMBUSTIVELSERVICE_EXCEPTION!= null) {
            throw COTADORCOMBUSTIVELSERVICE_EXCEPTION;
        }
        return COTADORCOMBUSTIVELSERVICE_WSDL_LOCATION;
    }

}