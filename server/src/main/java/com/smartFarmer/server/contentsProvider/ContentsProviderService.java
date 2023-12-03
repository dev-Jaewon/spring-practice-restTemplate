package com.smartFarmer.server.contentsProvider;

import com.smartFarmer.server.contentsProvider.Dto.ResponseExampleListDto;
import com.smartFarmer.server.contentsProvider.Dto.SearchExampleListDto;
import com.smartFarmer.server.contentsProvider.Dto.SearchPolicyListDto;

public interface ContentsProviderService {
    public String policyList(SearchPolicyListDto searchInfo);
    public String detailPolicy();
    public String educationList();
    public String detailEducation();
    public ResponseExampleListDto exampleList(SearchExampleListDto searchInfo);
    public String detailExample();
}
