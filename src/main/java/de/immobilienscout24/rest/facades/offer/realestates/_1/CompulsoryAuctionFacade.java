package de.immobilienscout24.rest.facades.offer.realestates._1;

import de.immobilienscout24.rest.schema.common._1.BuildingEnergyRatingType;
import de.immobilienscout24.rest.schema.common._1.CourtageInfo;
import de.immobilienscout24.rest.schema.common._1.EnergyPerformanceCertificate;
import de.immobilienscout24.rest.schema.common._1.EnergySourcesEnev2014;
import de.immobilienscout24.rest.schema.common._1.FiringTypes;
import de.immobilienscout24.rest.schema.common._1.HeatingTypeEnev2014;
import de.immobilienscout24.rest.schema.common._1.Price;
import de.immobilienscout24.rest.schema.common._1.YesNotApplicableType;
import de.immobilienscout24.rest.schema.offer.realestates._1.CompulsoryAuction;

/**
 * Note: Currently this object has no attribute "courtage". But to avoid adding
 * a new facade or changing the existing one we do nothing inside the getter and
 * setter of courtage.
 * 
 */

public class CompulsoryAuctionFacade implements RealestateFacade, EnergySavingFacade {
	final private CompulsoryAuction realestate;

	public CompulsoryAuctionFacade(CompulsoryAuction CompulsoryAuction) {
		realestate = CompulsoryAuction;
	}

	public CompulsoryAuction get() {
		return realestate;
	}

	@Override
	public Price getPrice() {
		return null;
	}

	@Override
	public void setPrice(Price value) {
	}

	@Override
	public CourtageInfo getCourtage() {
		// return realestate.getCourtage();
		// do nothing because this immotype has no courtage element
		return null;
	}

	@Override
	public void setCourtage(CourtageInfo value) {
		// realestate.setCourtage(value);
		// do nothing because this immotype has no courtage element
	}

	/*******************************************************************************************************
	 ******************************** Energy Stuff ***************************************
	 *******************************************************************************************************/

	@Override
	public EnergySourcesEnev2014 getEnergySourcesEnev2014() {
		return realestate.getEnergySourcesEnev2014();
	}

	@Override
	public void setEnergySourcesEnev2014(EnergySourcesEnev2014 value) {
		realestate.setEnergySourcesEnev2014(value);
	}

	@Override
	public Double getThermalCharacteristic() {
		return realestate.getThermalCharacteristic();
	}

	@Override
	public void setThermalCharacteristic(Double value) {
		realestate.setThermalCharacteristic(value);
	}

	@Override
	public FiringTypes getFiringTypes() {
		// return realestate.getFiringTypes();
		// do nothing because this immotype has no firingTypes element
		return null;
	}

	@Override
	public void setFiringTypes(FiringTypes value) {
		// realestate.setFiringTypes(value);
		// do nothing because this immotype has no firingTypes element
	}

	@Override
	public Boolean isConstructionYearUnknown() {
		return realestate.isConstructionYearUnknown();
	}

	@Override
	public void setConstructionYearUnknown(Boolean value) {
		realestate.setConstructionYearUnknown(value);
	}

	@Override
	public HeatingTypeEnev2014 getHeatingTypeEnev2014() {
		return realestate.getHeatingTypeEnev2014();
	}

	@Override
	public void setHeatingTypeEnev2014(HeatingTypeEnev2014 value) {
		realestate.setHeatingTypeEnev2014(value);
	}

	@Override
	public YesNotApplicableType getEnergyConsumptionContainsWarmWater() {
		return realestate.getEnergyConsumptionContainsWarmWater();
	}

	@Override
	public void setEnergyConsumptionContainsWarmWater(YesNotApplicableType value) {
		realestate.setEnergyConsumptionContainsWarmWater(value);
	}

	@Override
	public EnergyPerformanceCertificate getEnergyCertificate() {
		return realestate.getEnergyCertificate();
	}

	@Override
	public void setEnergyCertificate(EnergyPerformanceCertificate value) {
		realestate.setEnergyCertificate(value);
	}

	@Override
	public BuildingEnergyRatingType getBuildingEnergyRatingType() {
		return realestate.getBuildingEnergyRatingType();
	}

	@Override
	public void setBuildingEnergyRatingType(BuildingEnergyRatingType value) {
		realestate.setBuildingEnergyRatingType(value);
	}

	@Override
	public Integer getConstructionYear() {
		return realestate.getConstructionYear();
	}

	@Override
	public void setConstructionYear(Integer value) {
		realestate.setConstructionYear(value);
	}

}
