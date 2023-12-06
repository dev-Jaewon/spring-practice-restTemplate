import axios, { AxiosError, AxiosResponse } from "axios";

import { SearchPolicy } from '../types/searchPolicy'
import { ResponsePolicy } from "../types/responsePolicyList";

const api = axios.create({
    baseURL:
        "http://localhost:8080",
    headers: {
        "Content-Type": "application/json",
    },
});

export const getPolicyList = async (searchPolicy: SearchPolicy): Promise<ResponsePolicy> => {
    const url: string = parseURI('/policy', searchPolicy);
    return (await api.get<ResponsePolicy>(url)).data;
}

const parseURI = <T extends object>(endpoint: string, queryObject: T): string => {
    return Object.keys(queryObject).filter((key) =>
        queryObject[key as keyof T]
    ).reduce((acc, key, i) => {
        const join = `${key}=${queryObject[key as keyof T]}`;
        return acc = i === 0 ? acc + `?${join}` : acc + `&${join}`;
    }, endpoint)
};
