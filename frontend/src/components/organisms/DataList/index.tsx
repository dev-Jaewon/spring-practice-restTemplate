import styled from '@emotion/styled'

import { ResponsePolicy } from "../../../types/responsePolicyList";
import { Column } from "../../moecules/Column";
import { PolicyFilter } from "../../moecules/PolicyFilter";
import { useState } from 'react';


interface DataListType {
  isLoading: boolean;
  policyList: ResponsePolicy | undefined;
}

const PER_PAGE_LIST = [10, 20, 30, 40];

export const DataList = (props: DataListType) => {
  const [perPage, setPerpage] = useState(20);

  const handleClickPerPage = (perPage: number) => {
    setPerpage(perPage)
  }

  return <Container>
    <PolicyFilter></PolicyFilter>
    <ListContainer>
      <FilterContainer>sdf
        <PerpageList>
          {PER_PAGE_LIST.map(num => <PerPage onClick={() => handleClickPerPage(num)} num={num} perPage={perPage}>{num}개씩 보기</PerPage>)}
        </PerpageList>
      </FilterContainer>
      <div>
        {
          !props.isLoading ? <div>{
            props.policyList?.policy_list.map(info =>
              <Column info={info} key={info.seq} />
            )
          }</div> : <div>로딩중</div>
        }
      </div>
    </ListContainer>
  </Container>
}

const Container = styled.div`
`;

const ListContainer = styled.div`
  display: flex;
  position: relative;
  flex-direction: column;
`;

const FilterContainer = styled.div`
  background-color: #fafafa;
  padding: 0 30px;

  @media screen and (max-width: 600px){
    padding: 0 10px;
  }
`;

const PerpageList = styled.ul`
    display: flex;
    flex-direction: column;
    right: 30px;
    position: absolute;
    top: 0%;

    @media screen and (max-width: 600px){
        font-size: 12px;
        right: 10px;
    }

    &:hover {
        right: 50px;
        position: absolute;

        li {
            display: flex;
        }
    }
`

const PerPage = styled.li<{ num: number, perPage: number }>`
    align-items: center;
    height: 33px;
    padding: 0 10px;
    display: ${({ num, perPage }) => num === perPage ? 'flex' : 'none'};
    font-weight: ${({ num, perPage }) => num === perPage ? 600 : 500};
    background-color: #fafafa;
    cursor: pointer;
`