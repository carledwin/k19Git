
package webservice.cotadormoeda;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the webservice.cotadormoeda package. 
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

    private final static QName _ConversorDeMoedaParaRealResponse_QNAME = new QName("http://cotadormoeda.webservice/", "conversorDeMoedaParaRealResponse");
    private final static QName _ConversorDeMoedaParaReal_QNAME = new QName("http://cotadormoeda.webservice/", "conversorDeMoedaParaReal");
    private final static QName _ConversorDeRealParaMoedaResponse_QNAME = new QName("http://cotadormoeda.webservice/", "conversorDeRealParaMoedaResponse");
    private final static QName _ConversorDeRealParaMoeda_QNAME = new QName("http://cotadormoeda.webservice/", "conversorDeRealParaMoeda");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: webservice.cotadormoeda
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ConversorDeMoedaParaRealResponse }
     * 
     */
    public ConversorDeMoedaParaRealResponse createConversorDeMoedaParaRealResponse() {
        return new ConversorDeMoedaParaRealResponse();
    }

    /**
     * Create an instance of {@link ConversorDeRealParaMoedaResponse }
     * 
     */
    public ConversorDeRealParaMoedaResponse createConversorDeRealParaMoedaResponse() {
        return new ConversorDeRealParaMoedaResponse();
    }

    /**
     * Create an instance of {@link ConversorDeMoedaParaReal }
     * 
     */
    public ConversorDeMoedaParaReal createConversorDeMoedaParaReal() {
        return new ConversorDeMoedaParaReal();
    }

    /**
     * Create an instance of {@link ConversorDeRealParaMoeda }
     * 
     */
    public ConversorDeRealParaMoeda createConversorDeRealParaMoeda() {
        return new ConversorDeRealParaMoeda();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConversorDeMoedaParaRealResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cotadormoeda.webservice/", name = "conversorDeMoedaParaRealResponse")
    public JAXBElement<ConversorDeMoedaParaRealResponse> createConversorDeMoedaParaRealResponse(ConversorDeMoedaParaRealResponse value) {
        return new JAXBElement<ConversorDeMoedaParaRealResponse>(_ConversorDeMoedaParaRealResponse_QNAME, ConversorDeMoedaParaRealResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConversorDeMoedaParaReal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cotadormoeda.webservice/", name = "conversorDeMoedaParaReal")
    public JAXBElement<ConversorDeMoedaParaReal> createConversorDeMoedaParaReal(ConversorDeMoedaParaReal value) {
        return new JAXBElement<ConversorDeMoedaParaReal>(_ConversorDeMoedaParaReal_QNAME, ConversorDeMoedaParaReal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConversorDeRealParaMoedaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cotadormoeda.webservice/", name = "conversorDeRealParaMoedaResponse")
    public JAXBElement<ConversorDeRealParaMoedaResponse> createConversorDeRealParaMoedaResponse(ConversorDeRealParaMoedaResponse value) {
        return new JAXBElement<ConversorDeRealParaMoedaResponse>(_ConversorDeRealParaMoedaResponse_QNAME, ConversorDeRealParaMoedaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConversorDeRealParaMoeda }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cotadormoeda.webservice/", name = "conversorDeRealParaMoeda")
    public JAXBElement<ConversorDeRealParaMoeda> createConversorDeRealParaMoeda(ConversorDeRealParaMoeda value) {
        return new JAXBElement<ConversorDeRealParaMoeda>(_ConversorDeRealParaMoeda_QNAME, ConversorDeRealParaMoeda.class, null, value);
    }

}
