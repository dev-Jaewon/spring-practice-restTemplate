package com.smartFarmer.server.contentsProvider.Dto;

import lombok.Getter;

@Getter
public class SearchEducation {
    private String keyword;
    private String startDay;
    private String endDay;
    private String area1;
    private String page;
    private String perPage;
}
