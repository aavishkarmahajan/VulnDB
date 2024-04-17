package com.vm.vulndb.client;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.vm.vulndb.dto.AllDataResponseDTO;
import com.vm.vulndb.dto.BaseDataRequestDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.*;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@Component
public class VulnDBAPIClient {

    private String vulnDBAPIURL;
    private RestTemplateBuilder restTemplateBuilder;

    @Autowired
    public VulnDBAPIClient(@Value("${vulndb.api.url}") String vulnDBAPIURL, RestTemplateBuilder restTemplateBuilder) {
        this.vulnDBAPIURL = vulnDBAPIURL;
        this.restTemplateBuilder = restTemplateBuilder;
    }

    public AllDataResponseDTO getVulnerabilityData(int recent) throws JsonProcessingException {
        String url = vulnDBAPIURL;
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add("X-VulDB-ApiKey", "ac366bf986ae4c31a1bc4297d0cff2e8");
        Map<String, Object> map = new HashMap<>();
        map.put("recent",recent);
        HttpEntity<Map<String, Object>> entity = new HttpEntity<>(map, httpHeaders);
        RestTemplate restTemplate = this.restTemplateBuilder.build();
        //ResponseEntity<AllDataResponseDTO> responseData = restTemplate.exchange(url, HttpMethod.POST, entity, AllDataResponseDTO.class);
        ResponseEntity<AllDataResponseDTO> responseData = restTemplate.postForEntity(url, entity, AllDataResponseDTO.class);
        return responseData.getBody();

    }
}
