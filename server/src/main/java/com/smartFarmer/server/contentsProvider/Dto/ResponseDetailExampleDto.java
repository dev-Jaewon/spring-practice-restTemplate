package com.smartFarmer.server.contentsProvider.Dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;

@Getter
public class ResponseDetailExampleDto {

    @JsonProperty("youth_result")
    private ExampleResult exampleResult;
    
    @Getter
    public static class ExampleResult {
        
        @JsonProperty("title")
        private String title;
        
        @JsonProperty("bbsSeq")
        private String postNumber;

        @JsonProperty("contents")
        private String contents;

        private String bbsInfo04;
        private String bbsInfo07;
        private String bbsInfo08;
        private String area1Nm;
        private String area2Nm;
        private String bbsId;
        private String bbsInfo03;

    }
}
