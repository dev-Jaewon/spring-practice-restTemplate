export type Policy = {
    seq: number;
    typeDv: string;
    title: string;
    contents: string;
    eduTarget: string;
    area1Nm: string;
    eduStDt: string;
    eduMethod2?: string;
    eduMethod3?: string;
    totQuantity?: number;
    price?: number;
    eduMethod?: string;
    eduEdDt?: string;
    eduTime?: number;
    eduCnt?: number;
    applStDt: string;
    applEdDt: string;
    area2Nm?: string;
    chargeAgency: string;
    chargeDept?: string;
    chargeTel?: string;
    infoUrl?: string;
}

interface PolicyPaging {
    beginRow: number;
    pagePerRow: number;
    lastPage: number;
    totalCount: number;
    currentPage: number;
    pageSize: number;
    startPage: number;
    endPage: number;
}

export type ResponsePolicy = {
    policy_list: Array<Policy>
    policy_paging: PolicyPaging
}
