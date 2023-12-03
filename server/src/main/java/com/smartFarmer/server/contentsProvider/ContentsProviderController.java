package com.smartFarmer.server.contentsProvider;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.smartFarmer.server.contentsProvider.Dto.ResponseDetailExampleDto;
import com.smartFarmer.server.contentsProvider.Dto.ResponseExampleListDto;
import com.smartFarmer.server.contentsProvider.Dto.ResponsePolicyDetail;
import com.smartFarmer.server.contentsProvider.Dto.ResponsePolicyList;
import com.smartFarmer.server.contentsProvider.Dto.SearchExampleListDto;
import com.smartFarmer.server.contentsProvider.Dto.SearchPolicyList;

@RestController
public class ContentsProviderController {

    @Autowired
    ContentsProviderService contentsProviderService;

    @GetMapping(value = "/policy")
    public ResponseEntity<ResponsePolicyList> GetPolicyList(@ModelAttribute SearchPolicyList searchInfo) {
        return contentsProviderService.policyList(searchInfo);
    }

    @GetMapping(value = "/policy/{postNumber}")
    public ResponseEntity<ResponsePolicyDetail> getPolicyDetail(@PathVariable("postNumber") String postNumber) {
        return contentsProviderService.detailPolicy(postNumber);
    }

    @GetMapping(value = "/example")
    public ResponseEntity<ResponseExampleListDto> getExampleList(SearchExampleListDto searchInfo) {
        return contentsProviderService.exampleList(searchInfo);
    }

    @GetMapping(value = "/example/{postNumber}")
    public ResponseEntity<ResponseDetailExampleDto> detailExample(@PathVariable("postNumber") String postNumber) {
        return contentsProviderService.detailExample(postNumber);
    }
}
