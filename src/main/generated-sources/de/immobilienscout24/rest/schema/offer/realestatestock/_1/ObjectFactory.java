//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2014.06.23 um 09:51:43 AM CEST 
//


package de.immobilienscout24.rest.schema.offer.realestatestock._1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the de.immobilienscout24.rest.schema.offer.realestatestock._1 package. 
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

    private final static QName _PriceRegionRealEstateStock_QNAME = new QName("http://rest.immobilienscout24.de/schema/offer/realestatestock/1.0", "priceRegionRealEstateStock");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: de.immobilienscout24.rest.schema.offer.realestatestock._1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PriceRegionRealEstateStock }
     * 
     */
    public PriceRegionRealEstateStock createPriceRegionRealEstateStock() {
        return new PriceRegionRealEstateStock();
    }

    /**
     * Create an instance of {@link RealEstateStock }
     * 
     */
    public RealEstateStock createRealEstateStock() {
        return new RealEstateStock();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PriceRegionRealEstateStock }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://rest.immobilienscout24.de/schema/offer/realestatestock/1.0", name = "priceRegionRealEstateStock")
    public JAXBElement<PriceRegionRealEstateStock> createPriceRegionRealEstateStock(PriceRegionRealEstateStock value) {
        return new JAXBElement<PriceRegionRealEstateStock>(_PriceRegionRealEstateStock_QNAME, PriceRegionRealEstateStock.class, null, value);
    }

}
