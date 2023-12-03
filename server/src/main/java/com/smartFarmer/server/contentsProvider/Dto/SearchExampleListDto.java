package com.smartFarmer.server.contentsProvider.Dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SearchExampleListDto {
    private String sCode;
    private String typeDv;
    private String serviceKey;
    private String perPage;
    private String page;
}
