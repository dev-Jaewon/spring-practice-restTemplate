package com.smartFarmer.server.contentsProvider.Dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;

@Getter
public class ResponseEducation {
    @JsonProperty("youth_list")
    private List<Youth> youths;

    @JsonProperty("youth_paging")
    private YouthPaging youthPaging;

    @Getter
    public static class Youth {

        private String bbsSeq;

        private String bbsId;

        private String title;

        private String contents;

        private String bbsInfo03;

        private String bbsInfo04;

        private String bbsInfo07;

        private String bbsInfo08;

        private String area1Nm;

        private String area2Nm;
    }

    @Getter
    public static class YouthPaging {

        private int pagePerRow;

        private int startPage;

        private int pageSize;

        private int endPage;

        private int lastPage;

        private int totalCount;

        private int currentPage;

        private int beginRow;
    }
}