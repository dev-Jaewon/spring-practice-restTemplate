import styled from '@emotion/styled'


export const PolicyFilter = () => {

 

    return <Container>
        <PolicyKind>
            <div className='item'>지원사업</div>
            <div className='item'>교육</div>
            <div className='item'>청년사례목록</div>
        </PolicyKind>
        <FilterContainer>
            <p>상세검색</p>
        </FilterContainer>
    </Container>
}

const Container = styled.div`
    padding: 50px 0;
`;

const PolicyKind = styled.div`
    display:flex;
    border-top: 2px solid #B3B3B3;
    border-bottom: 1px solid #f2f2f2;

    .item {
        padding: 10px 10px;
        cursor:pointer;

        &:hover {
            background-color: #dfdfdf;
        }
    }
`;

const FilterContainer = styled.div`
    margin-top: 30px;
`;