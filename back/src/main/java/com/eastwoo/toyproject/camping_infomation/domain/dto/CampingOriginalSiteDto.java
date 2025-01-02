package com.eastwoo.toyproject.camping_infomation.domain.dto;

import com.eastwoo.toyproject.camping_infomation.domain.entity.CampingOriginalSite;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;


@Getter
@Setter
public class CampingOriginalSiteDto {

    private Long id;
    private String facilityName;
    private String category;
    private String cityProvinceName;
    private String cityCountyDistrictName;
    private String administrativeAreaName;
    private String riName;
    private String streetAddress;
    private String roadName;
    private String buildingNumber;
    private Double latitude;
    private Double longitude;
    private String postalCode;
    private String streetNameAddress;
    private String fullStreetAddress;
    private String telephoneNumber;
    private String website;
    private String businessEntity;
    private Boolean operateWeekdaysYn;
    private Boolean operateWeekendsYn;
    private Boolean operateSpringYn;
    private Boolean operateSummerYn;
    private Boolean operateFallYn;
    private Boolean operateWinterYn;
    private Boolean electricityAuxiliaryFacilitiesYn;
    private Boolean hotWaterAuxiliaryFacilitiesYn;
    private Boolean wirelessInternetAuxiliaryFacilitiesYn;
    private Boolean firewoodSalesAuxiliaryFacilitiesYn;
    private Boolean promenadeAuxiliaryFacilitiesYn;
    private Boolean waterParkAuxiliaryFacilitiesYn;
    private Boolean playgroundAuxiliaryFacilitiesYn;
    private Boolean martAuxiliaryFacilitiesYn;
    private Integer restroomsAuxiliaryFacilities;
    private Integer showerRoomsAuxiliaryFacilities;
    private Integer sinksAuxiliaryFacilities;
    private Integer fireExtinguishersAuxiliaryFacilities;
    private Boolean fishingNearbyFacilitiesYn;
    private Boolean promenadeNearbyFacilitiesYn;
    private Boolean waterPlaySeaBathingNearbyFacilitiesYn;
    private Boolean waterPlaySeaLeisureNearbyFacilitiesYn;
    private Boolean waterPlayValleyNearbyFacilitiesYn;
    private Boolean waterPlayRiverNearbyFacilitiesYn;
    private Boolean waterPlayPoolNearbyFacilitiesYn;
    private Boolean youthExperienceFacilityNearbyFacilitiesYn;
    private Boolean ruralExperienceFacilityNearbyFacilitiesYn;
    private Boolean childrensPlayFacilityNearbyFacilitiesYn;
    private Boolean glampingBedYn;
    private Boolean glampingTvYn;
    private Boolean glampingRefrigeratorYn;
    private Boolean glampingInternetWiredWirelessYn;
    private Boolean glampingInteriorRestroomYn;
    private Boolean glampingAirConditionerYn;
    private Boolean glampingHeatingEquipmentYn;
    private Boolean glampingCookingUtensilsYn;
    private String facilityFeatures;
    private String facilityIntroduction;
    private LocalDate lastWrittenDate;

    // Static method to convert from Entity to DTO
    public static CampingOriginalSiteDto from(CampingOriginalSite entity) {
        CampingOriginalSiteDto dto = new CampingOriginalSiteDto();
        dto.setId(entity.getId());
        dto.setFacilityName(entity.getFacilityName());
        dto.setCategory(entity.getCategory());
        dto.setCityProvinceName(entity.getCityProvinceName());
        dto.setCityCountyDistrictName(entity.getCityCountyDistrictName());
        dto.setAdministrativeAreaName(entity.getAdministrativeAreaName());
        dto.setRiName(entity.getRiName());
        dto.setStreetAddress(entity.getStreetAddress());
        dto.setRoadName(entity.getRoadName());
        dto.setBuildingNumber(entity.getBuildingNumber());
        dto.setLatitude(entity.getLatitude());
        dto.setLongitude(entity.getLongitude());
        dto.setPostalCode(entity.getPostalCode());
        dto.setStreetNameAddress(entity.getStreetNameAddress());
        dto.setFullStreetAddress(entity.getFullStreetAddress());
        dto.setTelephoneNumber(entity.getTelephoneNumber());
        dto.setWebsite(entity.getWebsite());
        dto.setBusinessEntity(entity.getBusinessEntity());
        dto.setOperateWeekdaysYn(entity.getOperateWeekdaysYn());
        dto.setOperateWeekendsYn(entity.getOperateWeekendsYn());
        dto.setOperateSpringYn(entity.getOperateSpringYn());
        dto.setOperateSummerYn(entity.getOperateSummerYn());
        dto.setOperateFallYn(entity.getOperateFallYn());
        dto.setOperateWinterYn(entity.getOperateWinterYn());
        dto.setElectricityAuxiliaryFacilitiesYn(entity.getElectricityAuxiliaryFacilitiesYn());
        dto.setHotWaterAuxiliaryFacilitiesYn(entity.getHotWaterAuxiliaryFacilitiesYn());
        dto.setWirelessInternetAuxiliaryFacilitiesYn(entity.getWirelessInternetAuxiliaryFacilitiesYn());
        dto.setFirewoodSalesAuxiliaryFacilitiesYn(entity.getFirewoodSalesAuxiliaryFacilitiesYn());
        dto.setPromenadeAuxiliaryFacilitiesYn(entity.getPromenadeAuxiliaryFacilitiesYn());
        dto.setWaterParkAuxiliaryFacilitiesYn(entity.getWaterParkAuxiliaryFacilitiesYn());
        dto.setPlaygroundAuxiliaryFacilitiesYn(entity.getPlaygroundAuxiliaryFacilitiesYn());
        dto.setMartAuxiliaryFacilitiesYn(entity.getMartAuxiliaryFacilitiesYn());
        dto.setRestroomsAuxiliaryFacilities(entity.getRestroomsAuxiliaryFacilities());
        dto.setShowerRoomsAuxiliaryFacilities(entity.getShowerRoomsAuxiliaryFacilities());
        dto.setSinksAuxiliaryFacilities(entity.getSinksAuxiliaryFacilities());
        dto.setFireExtinguishersAuxiliaryFacilities(entity.getFireExtinguishersAuxiliaryFacilities());
        dto.setFishingNearbyFacilitiesYn(entity.getFishingNearbyFacilitiesYn());
        dto.setPromenadeNearbyFacilitiesYn(entity.getPromenadeNearbyFacilitiesYn());
        dto.setWaterPlaySeaBathingNearbyFacilitiesYn(entity.getWaterPlaySeaBathingNearbyFacilitiesYn());
        dto.setWaterPlaySeaLeisureNearbyFacilitiesYn(entity.getWaterPlaySeaLeisureNearbyFacilitiesYn());
        dto.setWaterPlayValleyNearbyFacilitiesYn(entity.getWaterPlayValleyNearbyFacilitiesYn());
        dto.setWaterPlayRiverNearbyFacilitiesYn(entity.getWaterPlayRiverNearbyFacilitiesYn());
        dto.setWaterPlayPoolNearbyFacilitiesYn(entity.getWaterPlayPoolNearbyFacilitiesYn());
        dto.setYouthExperienceFacilityNearbyFacilitiesYn(entity.getYouthExperienceFacilityNearbyFacilitiesYn());
        dto.setRuralExperienceFacilityNearbyFacilitiesYn(entity.getRuralExperienceFacilityNearbyFacilitiesYn());
        dto.setChildrensPlayFacilityNearbyFacilitiesYn(entity.getChildrensPlayFacilityNearbyFacilitiesYn());
        dto.setGlampingBedYn(entity.getGlampingBedYn());
        dto.setGlampingTvYn(entity.getGlampingTvYn());
        dto.setGlampingRefrigeratorYn(entity.getGlampingRefrigeratorYn());
        dto.setGlampingInternetWiredWirelessYn(entity.getGlampingInternetWiredWirelessYn());
        dto.setGlampingInteriorRestroomYn(entity.getGlampingInteriorRestroomYn());
        dto.setGlampingAirConditionerYn(entity.getGlampingAirConditionerYn());
        dto.setGlampingHeatingEquipmentYn(entity.getGlampingHeatingEquipmentYn());
        dto.setGlampingCookingUtensilsYn(entity.getGlampingCookingUtensilsYn());
        dto.setFacilityFeatures(entity.getFacilityFeatures());
        dto.setFacilityIntroduction(entity.getFacilityIntroduction());
        dto.setLastWrittenDate(entity.getLastWrittenDate());
        return dto;
    }

    // Static method to convert from DTO to Entity
    public CampingOriginalSite toEntity() {
        return CampingOriginalSite.builder()
                .id(this.id)
                .facilityName(this.facilityName)
                .category(this.category)
                .cityProvinceName(this.cityProvinceName)
                .cityCountyDistrictName(this.cityCountyDistrictName)
                .administrativeAreaName(this.administrativeAreaName)
                .riName(this.riName)
                .streetAddress(this.streetAddress)
                .roadName(this.roadName)
                .buildingNumber(this.buildingNumber)
                .latitude(this.latitude)
                .longitude(this.longitude)
                .postalCode(this.postalCode)
                .streetNameAddress(this.streetNameAddress)
                .fullStreetAddress(this.fullStreetAddress)
                .telephoneNumber(this.telephoneNumber)
                .website(this.website)
                .businessEntity(this.businessEntity)
                .operateWeekdaysYn(this.operateWeekdaysYn)
                .operateWeekendsYn(this.operateWeekendsYn)
                .operateSpringYn(this.operateSpringYn)
                .operateSummerYn(this.operateSummerYn)
                .operateFallYn(this.operateFallYn)
                .operateWinterYn(this.operateWinterYn)
                .electricityAuxiliaryFacilitiesYn(this.electricityAuxiliaryFacilitiesYn)
                .hotWaterAuxiliaryFacilitiesYn(this.hotWaterAuxiliaryFacilitiesYn)
                .wirelessInternetAuxiliaryFacilitiesYn(this.wirelessInternetAuxiliaryFacilitiesYn)
                .firewoodSalesAuxiliaryFacilitiesYn(this.firewoodSalesAuxiliaryFacilitiesYn)
                .promenadeAuxiliaryFacilitiesYn(this.promenadeAuxiliaryFacilitiesYn)
                .waterParkAuxiliaryFacilitiesYn(this.waterParkAuxiliaryFacilitiesYn)
                .playgroundAuxiliaryFacilitiesYn(this.playgroundAuxiliaryFacilitiesYn)
                .martAuxiliaryFacilitiesYn(this.martAuxiliaryFacilitiesYn)
                .restroomsAuxiliaryFacilities(this.restroomsAuxiliaryFacilities)
                .showerRoomsAuxiliaryFacilities(this.showerRoomsAuxiliaryFacilities)
                .sinksAuxiliaryFacilities(this.sinksAuxiliaryFacilities)
                .fireExtinguishersAuxiliaryFacilities(this.fireExtinguishersAuxiliaryFacilities)
                .fishingNearbyFacilitiesYn(this.fishingNearbyFacilitiesYn)
                .promenadeNearbyFacilitiesYn(this.promenadeNearbyFacilitiesYn)
                .waterPlaySeaBathingNearbyFacilitiesYn(this.waterPlaySeaBathingNearbyFacilitiesYn)
                .waterPlaySeaLeisureNearbyFacilitiesYn(this.waterPlaySeaLeisureNearbyFacilitiesYn)
                .waterPlayValleyNearbyFacilitiesYn(this.waterPlayValleyNearbyFacilitiesYn)
                .waterPlayRiverNearbyFacilitiesYn(this.waterPlayRiverNearbyFacilitiesYn)
                .waterPlayPoolNearbyFacilitiesYn(this.waterPlayPoolNearbyFacilitiesYn)
                .youthExperienceFacilityNearbyFacilitiesYn(this.youthExperienceFacilityNearbyFacilitiesYn)
                .ruralExperienceFacilityNearbyFacilitiesYn(this.ruralExperienceFacilityNearbyFacilitiesYn)
                .childrensPlayFacilityNearbyFacilitiesYn(this.childrensPlayFacilityNearbyFacilitiesYn)
                .glampingBedYn(this.glampingBedYn)
                .glampingTvYn(this.glampingTvYn)
                .glampingRefrigeratorYn(this.glampingRefrigeratorYn)
                .glampingInternetWiredWirelessYn(this.glampingInternetWiredWirelessYn)
                .glampingInteriorRestroomYn(this.glampingInteriorRestroomYn)
                .glampingAirConditionerYn(this.glampingAirConditionerYn)
                .glampingHeatingEquipmentYn(this.glampingHeatingEquipmentYn)
                .glampingCookingUtensilsYn(this.glampingCookingUtensilsYn)
                .facilityFeatures(this.facilityFeatures)
                .facilityIntroduction(this.facilityIntroduction)
                .lastWrittenDate(this.lastWrittenDate)
                .build();
    }
}