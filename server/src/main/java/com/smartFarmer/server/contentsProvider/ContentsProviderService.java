package com.smartFarmer.server.contentsProvider;

import org.springframework.http.ResponseEntity;

import com.smartFarmer.server.contentsProvider.Dto.ResponseDetailExampleDto;
import com.smartFarmer.server.contentsProvider.Dto.ResponseExampleListDto;
import com.smartFarmer.server.contentsProvider.Dto.SearchExampleListDto;
import com.smartFarmer.server.contentsProvider.Dto.SearchPolicyListDto;

public interface ContentsProviderService {
    public String policyList(SearchPolicyListDto searchInfo);
    public String detailPolicy();
    public String educationList();
    public String detailEducation();
    public ResponseEntity<ResponseExampleListDto> exampleList(SearchExampleListDto searchInfo);
    public ResponseEntity<ResponseDetailExampleDto> detailExample(String postNumber);
}
