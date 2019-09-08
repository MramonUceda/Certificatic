
package com.castillo.jaxws.clientes;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.castillo.jaxws.clientes package. 
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

    private final static QName _ObtenerClientes_QNAME = new QName("http://clientes.jaxws.castillo.com/", "obtenerClientes");
    private final static QName _AgregarCliente_QNAME = new QName("http://clientes.jaxws.castillo.com/", "agregarCliente");
    private final static QName _ObtenerIdResponse_QNAME = new QName("http://clientes.jaxws.castillo.com/", "obtenerIdResponse");
    private final static QName _ActualizarCliente_QNAME = new QName("http://clientes.jaxws.castillo.com/", "actualizarCliente");
    private final static QName _EliminarCliente_QNAME = new QName("http://clientes.jaxws.castillo.com/", "eliminarCliente");
    private final static QName _AgregarClienteResponse_QNAME = new QName("http://clientes.jaxws.castillo.com/", "agregarClienteResponse");
    private final static QName _ObtenerClientesResponse_QNAME = new QName("http://clientes.jaxws.castillo.com/", "obtenerClientesResponse");
    private final static QName _ObtenerId_QNAME = new QName("http://clientes.jaxws.castillo.com/", "obtenerId");
    private final static QName _ActualizarClienteResponse_QNAME = new QName("http://clientes.jaxws.castillo.com/", "actualizarClienteResponse");
    private final static QName _EliminarClienteResponse_QNAME = new QName("http://clientes.jaxws.castillo.com/", "eliminarClienteResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.castillo.jaxws.clientes
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AgregarCliente }
     * 
     */
    public AgregarCliente createAgregarCliente() {
        return new AgregarCliente();
    }

    /**
     * Create an instance of {@link ObtenerIdResponse }
     * 
     */
    public ObtenerIdResponse createObtenerIdResponse() {
        return new ObtenerIdResponse();
    }

    /**
     * Create an instance of {@link ActualizarCliente }
     * 
     */
    public ActualizarCliente createActualizarCliente() {
        return new ActualizarCliente();
    }

    /**
     * Create an instance of {@link ObtenerClientes }
     * 
     */
    public ObtenerClientes createObtenerClientes() {
        return new ObtenerClientes();
    }

    /**
     * Create an instance of {@link ActualizarClienteResponse }
     * 
     */
    public ActualizarClienteResponse createActualizarClienteResponse() {
        return new ActualizarClienteResponse();
    }

    /**
     * Create an instance of {@link EliminarClienteResponse }
     * 
     */
    public EliminarClienteResponse createEliminarClienteResponse() {
        return new EliminarClienteResponse();
    }

    /**
     * Create an instance of {@link ObtenerClientesResponse }
     * 
     */
    public ObtenerClientesResponse createObtenerClientesResponse() {
        return new ObtenerClientesResponse();
    }

    /**
     * Create an instance of {@link ObtenerId }
     * 
     */
    public ObtenerId createObtenerId() {
        return new ObtenerId();
    }

    /**
     * Create an instance of {@link EliminarCliente }
     * 
     */
    public EliminarCliente createEliminarCliente() {
        return new EliminarCliente();
    }

    /**
     * Create an instance of {@link AgregarClienteResponse }
     * 
     */
    public AgregarClienteResponse createAgregarClienteResponse() {
        return new AgregarClienteResponse();
    }

    /**
     * Create an instance of {@link Cliente }
     * 
     */
    public Cliente createCliente() {
        return new Cliente();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerClientes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clientes.jaxws.castillo.com/", name = "obtenerClientes")
    public JAXBElement<ObtenerClientes> createObtenerClientes(ObtenerClientes value) {
        return new JAXBElement<ObtenerClientes>(_ObtenerClientes_QNAME, ObtenerClientes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AgregarCliente }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clientes.jaxws.castillo.com/", name = "agregarCliente")
    public JAXBElement<AgregarCliente> createAgregarCliente(AgregarCliente value) {
        return new JAXBElement<AgregarCliente>(_AgregarCliente_QNAME, AgregarCliente.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clientes.jaxws.castillo.com/", name = "obtenerIdResponse")
    public JAXBElement<ObtenerIdResponse> createObtenerIdResponse(ObtenerIdResponse value) {
        return new JAXBElement<ObtenerIdResponse>(_ObtenerIdResponse_QNAME, ObtenerIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActualizarCliente }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clientes.jaxws.castillo.com/", name = "actualizarCliente")
    public JAXBElement<ActualizarCliente> createActualizarCliente(ActualizarCliente value) {
        return new JAXBElement<ActualizarCliente>(_ActualizarCliente_QNAME, ActualizarCliente.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarCliente }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clientes.jaxws.castillo.com/", name = "eliminarCliente")
    public JAXBElement<EliminarCliente> createEliminarCliente(EliminarCliente value) {
        return new JAXBElement<EliminarCliente>(_EliminarCliente_QNAME, EliminarCliente.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AgregarClienteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clientes.jaxws.castillo.com/", name = "agregarClienteResponse")
    public JAXBElement<AgregarClienteResponse> createAgregarClienteResponse(AgregarClienteResponse value) {
        return new JAXBElement<AgregarClienteResponse>(_AgregarClienteResponse_QNAME, AgregarClienteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerClientesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clientes.jaxws.castillo.com/", name = "obtenerClientesResponse")
    public JAXBElement<ObtenerClientesResponse> createObtenerClientesResponse(ObtenerClientesResponse value) {
        return new JAXBElement<ObtenerClientesResponse>(_ObtenerClientesResponse_QNAME, ObtenerClientesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerId }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clientes.jaxws.castillo.com/", name = "obtenerId")
    public JAXBElement<ObtenerId> createObtenerId(ObtenerId value) {
        return new JAXBElement<ObtenerId>(_ObtenerId_QNAME, ObtenerId.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActualizarClienteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clientes.jaxws.castillo.com/", name = "actualizarClienteResponse")
    public JAXBElement<ActualizarClienteResponse> createActualizarClienteResponse(ActualizarClienteResponse value) {
        return new JAXBElement<ActualizarClienteResponse>(_ActualizarClienteResponse_QNAME, ActualizarClienteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarClienteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clientes.jaxws.castillo.com/", name = "eliminarClienteResponse")
    public JAXBElement<EliminarClienteResponse> createEliminarClienteResponse(EliminarClienteResponse value) {
        return new JAXBElement<EliminarClienteResponse>(_EliminarClienteResponse_QNAME, EliminarClienteResponse.class, null, value);
    }

}
