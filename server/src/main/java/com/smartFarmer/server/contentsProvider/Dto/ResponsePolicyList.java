package com.smartFarmer.server.contentsProvider.Dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;

@Getter
public class ResponsePolicyList {

    @JsonProperty("policy_list")
    private List<Policy> policies;

    @JsonProperty("policy_paging")
    private PolicyPaging policyPaging;

    @Getter
    public static class Policy {

        private String eduTarget;

        private String area1Nm;

        private String eduStDt;

        private String eduMethod2;

        private String eduMethod3;

        private String totQuantity;

        private String price;

        private String eduMethod;

        private String eduEdDt;

        private String eduTime;

        private String eduCnt;

        private String seq;

        private String typeDv;

        private String title;

        private String contents;

        private String applStDt;

        private String applEdDt;

        private String area2Nm;

        private String chargeAgency;

        private String chargeDept;

        private String chargeTel;

        private String infoUrl;
    }

    @Getter
    public static class PolicyPaging {

        private int beginRow;

        private int pagePerRow;

        private int lastPage;

        private int totalCount;

        private int currentPage;

        private int pageSize;

        private int startPage;

        private int endPage;
    }
}