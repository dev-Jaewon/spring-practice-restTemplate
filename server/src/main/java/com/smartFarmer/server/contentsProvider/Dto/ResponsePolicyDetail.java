package com.smartFarmer.server.contentsProvider.Dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;

@Getter
public class ResponsePolicyDetail {

    @JsonProperty("policy_result")
    private Policy policy;

    @Getter
    public static class Policy {

        private String eduMethod2;

        private String eduMethod3;

        private String eduTarget;

        private String area1Nm;

        private String area2Nm;

        private String chargeDept;

        private String chargeTel;

        private String infoUrl;

        private String seq;

        private String typeDv;

        private String title;

        private String contents;

        private String applStDt;

        private String applEdDt;

        private String price;

        private String totQuantity;

        private String chargeAgency;

        private String eduStDt;

        private String eduEdDt;

        private String eduTime;

        private String eduCnt;

        private String eduMethod;
    }
}