package com.eastwoo.toyproject.camping_infomation.domain.service;

import com.eastwoo.toyproject.camping_infomation.domain.dto.CampingOriginalSiteDto;
import com.eastwoo.toyproject.camping_infomation.domain.entity.CampingOriginalSite;
import com.eastwoo.toyproject.camping_infomation.domain.repository.CampingOriginalSiteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ApiService {

    private final CampingOriginalSiteRepository campingSiteRepository;

    @Autowired
    public ApiService(CampingOriginalSiteRepository campingSiteRepository) {
        this.campingSiteRepository = campingSiteRepository;
    }

    public CampingOriginalSiteDto findById(Long id) {
        Optional<CampingOriginalSite> campingOriginalSite = campingSiteRepository.findById(id);
        return campingOriginalSite.map(CampingOriginalSiteDto::from)
                .orElseThrow(() -> new RuntimeException("Camping site not found"));
    }

    // City Province Name으로 검색 후 DTO 리스트로 변환하여 반환
    public List<CampingOriginalSiteDto> findByCityProvinceName(String cityProvinceName) {
        List<CampingOriginalSite> campingOriginalSites = campingSiteRepository.findByCityProvinceName(cityProvinceName);
        return campingOriginalSites.stream()
                .map(CampingOriginalSiteDto::from)
                .collect(Collectors.toList());
    }

    // City County District Name으로 검색 후 DTO 리스트로 변환하여 반환
    public List<CampingOriginalSiteDto> findByCityCountyDistrictName(String cityCountyDistrictName) {
        List<CampingOriginalSite> campingOriginalSites = campingSiteRepository.findByCityCountyDistrictName(cityCountyDistrictName);
        return campingOriginalSites.stream()
                .map(CampingOriginalSiteDto::from)
                .collect(Collectors.toList());
    }

    // Facility Name으로 검색 후 DTO 리스트로 변환하여 반환
    public List<CampingOriginalSiteDto> findByName(String facilityName) {
        List<CampingOriginalSite> campingOriginalSites = campingSiteRepository.findByFacilityNameContaining(facilityName);
        return campingOriginalSites.stream()
                .map(CampingOriginalSiteDto::from)
                .collect(Collectors.toList());
    }
}
