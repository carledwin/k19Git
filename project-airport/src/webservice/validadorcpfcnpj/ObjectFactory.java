
package webservice.validadorcpfcnpj;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the webservice.validadorcpfcnpj package. 
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

    private final static QName _ValidadorCPFCNPJResponse_QNAME = new QName("http://validadorcpfcnpj.webservice/", "validadorCPFCNPJResponse");
    private final static QName _ValidadorCPFCNPJ_QNAME = new QName("http://validadorcpfcnpj.webservice/", "validadorCPFCNPJ");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: webservice.validadorcpfcnpj
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ValidadorCPFCNPJResponse }
     * 
     */
    public ValidadorCPFCNPJResponse createValidadorCPFCNPJResponse() {
        return new ValidadorCPFCNPJResponse();
    }

    /**
     * Create an instance of {@link ValidadorCPFCNPJ_Type }
     * 
     */
    public ValidadorCPFCNPJ_Type createValidadorCPFCNPJ_Type() {
        return new ValidadorCPFCNPJ_Type();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidadorCPFCNPJResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://validadorcpfcnpj.webservice/", name = "validadorCPFCNPJResponse")
    public JAXBElement<ValidadorCPFCNPJResponse> createValidadorCPFCNPJResponse(ValidadorCPFCNPJResponse value) {
        return new JAXBElement<ValidadorCPFCNPJResponse>(_ValidadorCPFCNPJResponse_QNAME, ValidadorCPFCNPJResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidadorCPFCNPJ_Type }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://validadorcpfcnpj.webservice/", name = "validadorCPFCNPJ")
    public JAXBElement<ValidadorCPFCNPJ_Type> createValidadorCPFCNPJ(ValidadorCPFCNPJ_Type value) {
        return new JAXBElement<ValidadorCPFCNPJ_Type>(_ValidadorCPFCNPJ_QNAME, ValidadorCPFCNPJ_Type.class, null, value);
    }

}
