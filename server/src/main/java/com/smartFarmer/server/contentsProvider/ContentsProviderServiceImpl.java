package com.smartFarmer.server.contentsProvider;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.smartFarmer.server.contentsProvider.Dto.ResponseDetailExampleDto;
import com.smartFarmer.server.contentsProvider.Dto.ResponseExampleListDto;
import com.smartFarmer.server.contentsProvider.Dto.SearchExampleListDto;
import com.smartFarmer.server.contentsProvider.Dto.SearchPolicyListDto;

import java.net.URI;

@Service
public class ContentsProviderServiceImpl implements ContentsProviderService {

    @Autowired
    RestTemplate restTemplate;

    @Value("${api.key}")
    private String KEY;

    @Value("${api.url}")
    private String URL;

    @Override
    public String policyList(SearchPolicyListDto searchInfo) {
        return "";
    };

    @Override
    public String detailPolicy() {
        return "";
    };

    @Override
    public String educationList() {
        return "";
    };

    @Override
    public String detailEducation() {
        return "";
    };

    @Override
    public ResponseEntity<ResponseExampleListDto> exampleList(SearchExampleListDto searchInfo) {
        URI uri = UriComponentsBuilder.fromHttpUrl(URL)
                .path("/youthListV2")
                .queryParam("sCode", "01")
                .queryParam("typeDv", "json")
                .queryParam("rowCnt", searchInfo.getPerPage())
                .queryParam("cp", searchInfo.getPage())
                .queryParam("serviceKey", KEY)
                .build(true).toUri();

        return ResponseEntity.ok().body(restTemplate.getForObject(uri, ResponseExampleListDto.class));
    };

    @Override
    public ResponseEntity<ResponseDetailExampleDto> detailExample(String postNumber) {
        URI uri = UriComponentsBuilder.fromHttpUrl(URL)
                .path("/youthViewV2")
                .queryParam("sCode", "01")
                .queryParam("typeDv", "json")
                .queryParam("seq", postNumber)
                .queryParam("serviceKey", KEY)
                .build(true).toUri();

        return ResponseEntity.ok().body(restTemplate.getForObject(uri, ResponseDetailExampleDto.class));
    };

}