package com.smartFarmer.server.contentsProvider.Dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;

@Getter
public class ReposeEducationDetail {

    @JsonProperty("edu_result")
    private Edu edu;

    @Getter
    public static class Edu {

        private String chargeDept;

        private String area2Nm;

        private String area1Nm;

        private String eduTarget;

        private String eduMethod2;

        private String eduMethod3;

        private String chargeTel;

        private String infoUrl;

        private String seq;

        private String typeDv;

        private String price;

        private String totQuantity;

        private String chargeAgency;

        private String title;

        private String contents;

        private String applStDt;

        private String applEdDt;

        private String eduStDt;

        private String eduEdDt;

        private String eduTime;

        private String eduCnt;

        private String eduMethod;
    }
}