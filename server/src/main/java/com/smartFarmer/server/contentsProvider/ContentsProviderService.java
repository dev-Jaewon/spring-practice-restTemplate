package com.smartFarmer.server.contentsProvider;

import org.springframework.http.ResponseEntity;

import com.smartFarmer.server.contentsProvider.Dto.ReposeEducationDetail;
import com.smartFarmer.server.contentsProvider.Dto.ResponseDetailExampleDto;
import com.smartFarmer.server.contentsProvider.Dto.ResponseEducation;
import com.smartFarmer.server.contentsProvider.Dto.ResponseExampleListDto;
import com.smartFarmer.server.contentsProvider.Dto.ResponsePolicyDetail;
import com.smartFarmer.server.contentsProvider.Dto.ResponsePolicyList;
import com.smartFarmer.server.contentsProvider.Dto.SearchEducation;
import com.smartFarmer.server.contentsProvider.Dto.SearchExampleListDto;
import com.smartFarmer.server.contentsProvider.Dto.SearchPolicyList;

public interface ContentsProviderService {
    public ResponseEntity<ResponsePolicyList> policyList(SearchPolicyList searchInfo);

    public ResponseEntity<ResponsePolicyDetail> detailPolicy(String postNumber);

    public ResponseEntity<ResponseEducation> educationList(SearchEducation searchInfo);

    public ResponseEntity<ReposeEducationDetail> educationDetail(String postNumber);

    public ResponseEntity<ResponseExampleListDto> exampleList(SearchExampleListDto searchInfo);

    public ResponseEntity<ResponseDetailExampleDto> detailExample(String postNumber);
}
