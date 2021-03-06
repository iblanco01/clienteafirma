
package juntadeandalucia.cice.pfirma.mobile.v2;

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
@WebServiceClient(name = "MobileService", targetNamespace = "urn:juntadeandalucia:cice:pfirma:mobile:v2.0", wsdlLocation = "file:/C:/Users/carlos/Desktop/MobileService.wsdl")
public class MobileService_Service
    extends Service
{

    private final static URL MOBILESERVICE_WSDL_LOCATION;
    private final static WebServiceException MOBILESERVICE_EXCEPTION;
    private final static QName MOBILESERVICE_QNAME = new QName("urn:juntadeandalucia:cice:pfirma:mobile:v2.0", "MobileService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("file:/C:/Users/carlos/Desktop/MobileService.wsdl");
        } catch (final MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        MOBILESERVICE_WSDL_LOCATION = url;
        MOBILESERVICE_EXCEPTION = e;
    }

    public MobileService_Service() {
        super(__getWsdlLocation(), MOBILESERVICE_QNAME);
    }

    public MobileService_Service(final WebServiceFeature... features) {
        super(__getWsdlLocation(), MOBILESERVICE_QNAME, features);
    }

    public MobileService_Service(final URL wsdlLocation) {
        super(wsdlLocation, MOBILESERVICE_QNAME);
    }

    public MobileService_Service(final URL wsdlLocation, final WebServiceFeature... features) {
        super(wsdlLocation, MOBILESERVICE_QNAME, features);
    }

    public MobileService_Service(final URL wsdlLocation, final QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public MobileService_Service(final URL wsdlLocation, final QName serviceName, final WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns MobileService
     */
    @WebEndpoint(name = "MobileServicePort")
    public MobileService getMobileServicePort() {
        return super.getPort(new QName("urn:juntadeandalucia:cice:pfirma:mobile:v2.0", "MobileServicePort"), MobileService.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns MobileService
     */
    @WebEndpoint(name = "MobileServicePort")
    public MobileService getMobileServicePort(final WebServiceFeature... features) {
        return super.getPort(new QName("urn:juntadeandalucia:cice:pfirma:mobile:v2.0", "MobileServicePort"), MobileService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (MOBILESERVICE_EXCEPTION!= null) {
            throw MOBILESERVICE_EXCEPTION;
        }
        return MOBILESERVICE_WSDL_LOCATION;
    }

}
