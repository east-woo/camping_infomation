package com.eastwoo.toyproject.camping_infomation.domain.repository;

import com.eastwoo.toyproject.camping_infomation.domain.entity.CampingOriginalSite;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CampingOriginalSiteRepository extends JpaRepository<CampingOriginalSite, Long> {

    Optional<CampingOriginalSite> findById(Long id);

    List<CampingOriginalSite> findByCityProvinceName(String cityProvinceName);

    List<CampingOriginalSite> findByCityCountyDistrictName(String cityCountyDistrictName);

    List<CampingOriginalSite> findByFacilityNameContaining(String facilityName);
}
