package com.eastwoo.toyproject.camping_infomation.web.controller;

import com.eastwoo.toyproject.camping_infomation.domain.dto.CampingOriginalSiteDto;
import com.eastwoo.toyproject.camping_infomation.domain.entity.CampingOriginalSite;
import com.eastwoo.toyproject.camping_infomation.domain.service.ApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/camping-sites")
public class ApiController {

    private final ApiService apiService;

    @Autowired
    public ApiController(ApiService apiService) {
        this.apiService = apiService;
    }

    @GetMapping("/search/id")
    public ResponseEntity<CampingOriginalSiteDto> searchById(@RequestParam Long id) {
        CampingOriginalSiteDto sites = apiService.findById(id);
        return ResponseEntity.ok(sites);
    }


    @GetMapping("/search/city-province")
    public ResponseEntity<List<CampingOriginalSiteDto>> searchByCityProvince(@RequestParam String cityProvinceName) {
        List<CampingOriginalSiteDto> sites = apiService.findByCityProvinceName(cityProvinceName);
        return ResponseEntity.ok(sites);
    }

    @GetMapping("/search/city-county-district")
    public ResponseEntity<List<CampingOriginalSiteDto>> searchByCityCountyDistrict(@RequestParam String cityCountyDistrictName) {
        List<CampingOriginalSiteDto> sites = apiService.findByCityCountyDistrictName(cityCountyDistrictName);
        return ResponseEntity.ok(sites);
    }

    @GetMapping("/search/name")
    public ResponseEntity<List<CampingOriginalSiteDto>> searchByName(@RequestParam String facilityName) {
        List<CampingOriginalSiteDto> sites = apiService.findByName(facilityName);
        return ResponseEntity.ok(sites);
    }
}