
package webservice.cotadorcombustivel;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the webservice.cotadorcombustivel package. 
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

    private final static QName _CalculoValorGastoCombustivel_QNAME = new QName("http://cotadorcombustivel.webservice/", "calculoValorGastoCombustivel");
    private final static QName _CalculoValorGastoCombustivelResponse_QNAME = new QName("http://cotadorcombustivel.webservice/", "calculoValorGastoCombustivelResponse");
    private final static QName _CotadorDeConbustivelResponse_QNAME = new QName("http://cotadorcombustivel.webservice/", "cotadorDeConbustivelResponse");
    private final static QName _CotadorDeConbustivel_QNAME = new QName("http://cotadorcombustivel.webservice/", "cotadorDeConbustivel");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: webservice.cotadorcombustivel
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CotadorDeConbustivel }
     * 
     */
    public CotadorDeConbustivel createCotadorDeConbustivel() {
        return new CotadorDeConbustivel();
    }

    /**
     * Create an instance of {@link CotadorDeConbustivelResponse }
     * 
     */
    public CotadorDeConbustivelResponse createCotadorDeConbustivelResponse() {
        return new CotadorDeConbustivelResponse();
    }

    /**
     * Create an instance of {@link CalculoValorGastoCombustivel }
     * 
     */
    public CalculoValorGastoCombustivel createCalculoValorGastoCombustivel() {
        return new CalculoValorGastoCombustivel();
    }

    /**
     * Create an instance of {@link CalculoValorGastoCombustivelResponse }
     * 
     */
    public CalculoValorGastoCombustivelResponse createCalculoValorGastoCombustivelResponse() {
        return new CalculoValorGastoCombustivelResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalculoValorGastoCombustivel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cotadorcombustivel.webservice/", name = "calculoValorGastoCombustivel")
    public JAXBElement<CalculoValorGastoCombustivel> createCalculoValorGastoCombustivel(CalculoValorGastoCombustivel value) {
        return new JAXBElement<CalculoValorGastoCombustivel>(_CalculoValorGastoCombustivel_QNAME, CalculoValorGastoCombustivel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalculoValorGastoCombustivelResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cotadorcombustivel.webservice/", name = "calculoValorGastoCombustivelResponse")
    public JAXBElement<CalculoValorGastoCombustivelResponse> createCalculoValorGastoCombustivelResponse(CalculoValorGastoCombustivelResponse value) {
        return new JAXBElement<CalculoValorGastoCombustivelResponse>(_CalculoValorGastoCombustivelResponse_QNAME, CalculoValorGastoCombustivelResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CotadorDeConbustivelResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cotadorcombustivel.webservice/", name = "cotadorDeConbustivelResponse")
    public JAXBElement<CotadorDeConbustivelResponse> createCotadorDeConbustivelResponse(CotadorDeConbustivelResponse value) {
        return new JAXBElement<CotadorDeConbustivelResponse>(_CotadorDeConbustivelResponse_QNAME, CotadorDeConbustivelResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CotadorDeConbustivel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cotadorcombustivel.webservice/", name = "cotadorDeConbustivel")
    public JAXBElement<CotadorDeConbustivel> createCotadorDeConbustivel(CotadorDeConbustivel value) {
        return new JAXBElement<CotadorDeConbustivel>(_CotadorDeConbustivel_QNAME, CotadorDeConbustivel.class, null, value);
    }

}
