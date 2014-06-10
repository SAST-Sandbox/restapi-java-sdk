//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2014.04.11 um 01:54:30 PM CEST 
//

package de.immobilienscout24.rest.schema.common._1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java-Klasse f�r FacilityType.
 * 
 * <p>
 * Das folgende Schemafragment gibt den erwarteten Content an, der in dieser
 * Klasse enthalten ist.
 * <p>
 * 
 * <pre>
 * &lt;simpleType name="FacilityType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ASSISTED_LIVING"/>
 *     &lt;enumeration value="RESIDENCE"/>
 *     &lt;enumeration value="SENIOR_PARK"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FacilityType")
@XmlEnum
public enum FacilityType {

	/**
	 * Seniorenwohnen
	 * 
	 */
	ASSISTED_LIVING,

	/**
	 * Residenz
	 * 
	 */
	RESIDENCE,

	/**
	 * Seniorenwohnpark
	 * 
	 */
	SENIOR_PARK;

	public String value() {
		return name();
	}

	public static FacilityType fromValue(String v) {
		return valueOf(v);
	}

}