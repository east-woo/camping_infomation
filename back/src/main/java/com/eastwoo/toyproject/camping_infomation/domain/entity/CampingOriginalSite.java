package com.eastwoo.toyproject.camping_infomation.domain.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Table(name = "camping_original_sites")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CampingOriginalSite {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(name = "facility_name", length = 255)
    private String facilityName;

    @Column(name = "category", length = 255)
    private String category;

    @Column(name = "city_province_name", length = 255)
    private String cityProvinceName;

    @Column(name = "city_county_district_name", length = 255)
    private String cityCountyDistrictName;

    @Column(name = "administrative_area_name", length = 255)
    private String administrativeAreaName;

    @Column(name = "ri_name", length = 255)
    private String riName;

    @Column(name = "street_address", length = 255)
    private String streetAddress;

    @Column(name = "road_name", length = 255)
    private String roadName;

    @Column(name = "building_number", length = 255)
    private String buildingNumber;

    @Column(name = "latitude")
    private Double latitude;

    @Column(name = "longitude")
    private Double longitude;

    @Column(name = "postal_code", length = 20)
    private String postalCode;

    @Column(name = "street_name_address", length = 255)
    private String streetNameAddress;

    @Column(name = "full_street_address", length = 255)
    private String fullStreetAddress;

    @Column(name = "telephone_number", length = 20)
    private String telephoneNumber;

    @Column(name = "website", length = 255)
    private String website;

    @Column(name = "business_entity", length = 255)
    private String businessEntity;

    @Column(name = "operate_weekdays_yn")
    private Boolean operateWeekdaysYn;

    @Column(name = "operate_weekends_yn")
    private Boolean operateWeekendsYn;

    @Column(name = "operate_spring_yn")
    private Boolean operateSpringYn;

    @Column(name = "operate_summer_yn")
    private Boolean operateSummerYn;

    @Column(name = "operate_fall_yn")
    private Boolean operateFallYn;

    @Column(name = "operate_winter_yn")
    private Boolean operateWinterYn;

    @Column(name = "electricity_auxiliary_facilities_yn")
    private Boolean electricityAuxiliaryFacilitiesYn;

    @Column(name = "hot_water_auxiliary_facilities_yn")
    private Boolean hotWaterAuxiliaryFacilitiesYn;

    @Column(name = "wireless_internet_auxiliary_facilities_yn")
    private Boolean wirelessInternetAuxiliaryFacilitiesYn;

    @Column(name = "firewood_sales_auxiliary_facilities_yn")
    private Boolean firewoodSalesAuxiliaryFacilitiesYn;

    @Column(name = "promenade_auxiliary_facilities_yn")
    private Boolean promenadeAuxiliaryFacilitiesYn;

    @Column(name = "water_park_auxiliary_facilities_yn")
    private Boolean waterParkAuxiliaryFacilitiesYn;

    @Column(name = "playground_auxiliary_facilities_yn")
    private Boolean playgroundAuxiliaryFacilitiesYn;

    @Column(name = "mart_auxiliary_facilities_yn")
    private Boolean martAuxiliaryFacilitiesYn;

    @Column(name = "restrooms_auxiliary_facilities")
    private Integer restroomsAuxiliaryFacilities;

    @Column(name = "shower_rooms_auxiliary_facilities")
    private Integer showerRoomsAuxiliaryFacilities;

    @Column(name = "sinks_auxiliary_facilities")
    private Integer sinksAuxiliaryFacilities;

    @Column(name = "fire_extinguishers_auxiliary_facilities")
    private Integer fireExtinguishersAuxiliaryFacilities;

    @Column(name = "fishing_nearby_facilities_yn")
    private Boolean fishingNearbyFacilitiesYn;

    @Column(name = "promenade_nearby_facilities_yn")
    private Boolean promenadeNearbyFacilitiesYn;

    @Column(name = "water_play_sea_bathing_nearby_facilities_yn")
    private Boolean waterPlaySeaBathingNearbyFacilitiesYn;

    @Column(name = "water_play_sea_leisure_nearby_facilities_yn")
    private Boolean waterPlaySeaLeisureNearbyFacilitiesYn;

    @Column(name = "water_play_valley_nearby_facilities_yn")
    private Boolean waterPlayValleyNearbyFacilitiesYn;

    @Column(name = "water_play_river_nearby_facilities_yn")
    private Boolean waterPlayRiverNearbyFacilitiesYn;

    @Column(name = "water_play_pool_nearby_facilities_yn")
    private Boolean waterPlayPoolNearbyFacilitiesYn;

    @Column(name = "youth_experience_facility_nearby_facilities_yn")
    private Boolean youthExperienceFacilityNearbyFacilitiesYn;

    @Column(name = "rural_experience_facility_nearby_facilities_yn")
    private Boolean ruralExperienceFacilityNearbyFacilitiesYn;

    @Column(name = "childrens_play_facility_nearby_facilities_yn")
    private Boolean childrensPlayFacilityNearbyFacilitiesYn;

    @Column(name = "glamping_bed_yn")
    private Boolean glampingBedYn;

    @Column(name = "glamping_tv_yn")
    private Boolean glampingTvYn;

    @Column(name = "glamping_refrigerator_yn")
    private Boolean glampingRefrigeratorYn;

    @Column(name = "glamping_internet_wired_wireless_yn")
    private Boolean glampingInternetWiredWirelessYn;

    @Column(name = "glamping_interior_restroom_yn")
    private Boolean glampingInteriorRestroomYn;

    @Column(name = "glamping_air_conditioner_yn")
    private Boolean glampingAirConditionerYn;

    @Column(name = "glamping_heating_equipment_yn")
    private Boolean glampingHeatingEquipmentYn;

    @Column(name = "glamping_cooking_utensils_yn")
    private Boolean glampingCookingUtensilsYn;

    @Column(name = "facility_features", columnDefinition = "TEXT")
    private String facilityFeatures;

    @Column(name = "facility_introduction", columnDefinition = "TEXT")
    private String facilityIntroduction;

    @Column(name = "last_written_date")
    private LocalDate lastWrittenDate;
}
