
package calculadordedistanciadoispontosws.calculador;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the calculadordedistanciadoispontosws.calculador package. 
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

    private final static QName _Calculador_QNAME = new QName("http://calculador.calculadorDeDistanciaDoisPontosWS/", "calculador");
    private final static QName _CalculadorResponse_QNAME = new QName("http://calculador.calculadorDeDistanciaDoisPontosWS/", "calculadorResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: calculadordedistanciadoispontosws.calculador
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CalculadorResponse }
     * 
     */
    public CalculadorResponse createCalculadorResponse() {
        return new CalculadorResponse();
    }

    /**
     * Create an instance of {@link Calculador }
     * 
     */
    public Calculador createCalculador() {
        return new Calculador();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Calculador }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://calculador.calculadorDeDistanciaDoisPontosWS/", name = "calculador")
    public JAXBElement<Calculador> createCalculador(Calculador value) {
        return new JAXBElement<Calculador>(_Calculador_QNAME, Calculador.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalculadorResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://calculador.calculadorDeDistanciaDoisPontosWS/", name = "calculadorResponse")
    public JAXBElement<CalculadorResponse> createCalculadorResponse(CalculadorResponse value) {
        return new JAXBElement<CalculadorResponse>(_CalculadorResponse_QNAME, CalculadorResponse.class, null, value);
    }

}
