//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2014.10.22 um 03:41:54 PM CEST 
//


package de.immobilienscout24.rest.schema.common._1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse fr SiteRecommendedUseType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="SiteRecommendedUseType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NO_INFORMATION"/>
 *     &lt;enumeration value="FUTURE_DEVELOPMENT_LAND"/>
 *     &lt;enumeration value="TWINHOUSE"/>
 *     &lt;enumeration value="SINGLE_FAMILY_HOUSE"/>
 *     &lt;enumeration value="GARAGE"/>
 *     &lt;enumeration value="GARDEN"/>
 *     &lt;enumeration value="NO_DEVELOPMENT"/>
 *     &lt;enumeration value="APARTMENT_BUILDING"/>
 *     &lt;enumeration value="ORCHARD"/>
 *     &lt;enumeration value="TERRACE_HOUSE"/>
 *     &lt;enumeration value="PARKING_SPACE"/>
 *     &lt;enumeration value="VILLA"/>
 *     &lt;enumeration value="FORREST"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SiteRecommendedUseType")
@XmlEnum
public enum SiteRecommendedUseType {


    /**
     * keine Angabe
     * 
     */
    NO_INFORMATION,

    /**
     * Bauerwartungsland
     * 
     */
    FUTURE_DEVELOPMENT_LAND,

    /**
     * Doppelhaushlfte
     * 
     */
    TWINHOUSE,

    /**
     * Einfamilienhaus
     * 
     */
    SINGLE_FAMILY_HOUSE,

    /**
     * Garage
     * 
     */
    GARAGE,

    /**
     * Garten
     * 
     */
    GARDEN,

    /**
     * Keine Bebauung
     * 
     */
    NO_DEVELOPMENT,

    /**
     * Mehrfamilienhaus
     * 
     */
    APARTMENT_BUILDING,

    /**
     * Obstpflanzung
     * 
     */
    ORCHARD,

    /**
     * Reihenhaus
     * 
     */
    TERRACE_HOUSE,

    /**
     * Stellpltze
     * 
     */
    PARKING_SPACE,

    /**
     * Villa
     * 
     */
    VILLA,

    /**
     * Wald
     * 
     */
    FORREST;

    public String value() {
        return name();
    }

    public static SiteRecommendedUseType fromValue(String v) {
        return valueOf(v);
    }

}
