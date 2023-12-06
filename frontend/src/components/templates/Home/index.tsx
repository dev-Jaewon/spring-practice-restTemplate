import { useState } from "react";
import { DataList } from "../../organisms/DataList";
import { getPolicyList } from "../../../utils/api";
import { useQuery } from '@tanstack/react-query';
import { SearchPolicy } from "../../../types/searchPolicy";

export const Home = () => {
    const [searchPolicy, setSearchPolicy] = useState<SearchPolicy>({
        keyWord: "",
        startPolicy: "",
        endPolicy: "",
        area1: "",
        perPage: "",
        page: "",
    });


    const { data, isLoading } = useQuery({ queryKey: [""], queryFn: () => getPolicyList(searchPolicy) });


    return (<><DataList policyList={data} isLoading={isLoading} /></>);
}
