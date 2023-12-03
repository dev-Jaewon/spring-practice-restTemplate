package com.smartFarmer.server.contentsProvider;

import org.springframework.http.ResponseEntity;

import com.smartFarmer.server.contentsProvider.Dto.ResponseDetailExampleDto;
import com.smartFarmer.server.contentsProvider.Dto.ResponseExampleListDto;
import com.smartFarmer.server.contentsProvider.Dto.ResponsePolicyDetail;
import com.smartFarmer.server.contentsProvider.Dto.ResponsePolicyList;
import com.smartFarmer.server.contentsProvider.Dto.SearchExampleListDto;
import com.smartFarmer.server.contentsProvider.Dto.SearchPolicyList;

public interface ContentsProviderService {
    public ResponseEntity<ResponsePolicyList> policyList(SearchPolicyList searchInfo);

    public ResponseEntity<ResponsePolicyDetail> detailPolicy(String postNumber);

    public String educationList();

    public String detailEducation();

    public ResponseEntity<ResponseExampleListDto> exampleList(SearchExampleListDto searchInfo);

    public ResponseEntity<ResponseDetailExampleDto> detailExample(String postNumber);
}
