package com.smartFarmer.server.contentsProvider.Dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SearchPolicyList {
    private String keyWord;
    private String startPolicy;
    private String endPolicy;
    private String area1;
    private String perPage = "10";
    private String page = "1";
}
