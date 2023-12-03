package com.smartFarmer.server.contentsProvider;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.smartFarmer.server.contentsProvider.Dto.ResponseDetailExampleDto;
import com.smartFarmer.server.contentsProvider.Dto.ResponseExampleListDto;
import com.smartFarmer.server.contentsProvider.Dto.ResponsePolicyList;
import com.smartFarmer.server.contentsProvider.Dto.SearchExampleListDto;
import com.smartFarmer.server.contentsProvider.Dto.SearchPolicyList;

@RestController
public class ContentsProviderController {

    @Autowired
    ContentsProviderService contentsProviderService;

    @GetMapping(value = "/policyList")
    public ResponseEntity<ResponsePolicyList> GetPolicyList(@ModelAttribute SearchPolicyList searchInfo) {
        return contentsProviderService.policyList(searchInfo);
    }

    @GetMapping(value = "exampleList")
    public ResponseEntity<ResponseExampleListDto> getExampleList(SearchExampleListDto searchInfo) {
        return contentsProviderService.exampleList(searchInfo);
    }

    @GetMapping(value = "/exampleDetail/{postNumber}")
    public ResponseEntity<ResponseDetailExampleDto> detailExample(@PathVariable("postNumber") String postNumber) {
        return contentsProviderService.detailExample(postNumber);
    }
}