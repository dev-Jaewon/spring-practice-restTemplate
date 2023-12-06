import styled from '@emotion/styled'
import { Policy } from "../../../types/responsePolicyList"
import { useEffect, useRef, useState } from 'react';

interface ColumnTypes {
    info: Policy
}

export const Column = ({ info }: ColumnTypes) => {
    const target = useRef<HTMLDivElement>(null);
    const [isOpened, setIsOpened] = useState<boolean>(false);

    const handleClickTitle = () => setIsOpened(!isOpened)

    useEffect(() => {
        const clickFn = (e: MouseEvent) => {
            if (e.target) {
                if (!target.current || !target.current.contains(e.target as Node)) setIsOpened(false);
            }
        }

        window.addEventListener('click', clickFn);
        return () => window.removeEventListener('click', clickFn);
    }, []);

    return (
        <Container ref={target}>
            <ListContainer onClick={handleClickTitle}>
                <Dday>D-10</Dday>
                <TitleContainer>
                    <Title>{info.title}</Title>
                    <Target>
                        <span>대상 :</span>
                        <p>{info.eduTarget}</p>
                    </Target>
                </TitleContainer>
                <DateContainer>
                    <span>{info.applStDt}</span>
                    <span>~</span>
                    <span>{info.applEdDt}</span>
                </DateContainer>
            </ListContainer>
            {
                isOpened && <DetailContainer>
                    <div>
                        <span>주관기관</span>
                        <p>{info.chargeAgency}</p>
                    </div>
                    <div>
                        <span>담당부서</span>
                        <p>{info.chargeDept}</p>
                    </div>
                    <div>
                        <span>전화번호</span>
                        <p>{info.chargeTel}</p>
                    </div>
                    <div>
                        <span>URL</span>
                        <a href={info.infoUrl} target="_blank">{info.infoUrl}</a>
                    </div>
                    <div>
                        <span>내용</span>
                        <div >{info.contents}</div>
                    </div>
                </DetailContainer>
            }
        </Container>);
}


const Container = styled.div`
    display:flex;
    flex-direction: column;
`;

const ListContainer = styled.div`
    display:flex;
    align-items:center;
    height: 50px;
    padding: 10px 20px;
    box-shadow: rgba(17, 17, 26, 0.1) 0px 1px 0px;
    cursor: pointer;

    @media screen and (max-width: 600px){
        padding: 10px 20px 10px 10px;
    }
`;

const TitleContainer = styled.div`
    display:flex;
    flex-direction: column;
`;

const Title = styled.h2`
    font-size: 1rem;
    color: #292929;

    @media screen and (max-width: 600px){
        font-size: 0.8rem;
    }

    @media screen and (max-width: 400px){
        font-size: 0.7rem;
    }
`;

const Dday = styled.div`
    margin-right: 20px;
    font-size: 1rem;
    font-weight: 600; 
    color: #474747;

    @media screen and (max-width: 600px){
        margin-right: 20px;
        font-size: 0.8rem;
        flex-basis: 30px;

    }

    @media screen and (max-width: 400px){
        font-size: 0.7rem;
    }
`;

const Target = styled.div`
    display: flex;
    gap: 5px;
    font-weight: 600;
    font-size: 0.8rem;
    margin-top: 6px;
    color: #c18181;
    /* color: #c18181; */
    color: #afafaf;

    @media screen and (max-width: 600px){
        font-size: 0.7rem;
    }

    @media screen and (max-width: 400px){
        font-size: 0.6rem;
    }
`;

const DateContainer = styled.div`
    display: flex;
    margin-left: auto;
    font-size: 0.8rem;
    font-weight: 500;
    gap: 5px;
    color: #474747;

    @media screen and (max-width: 600px){
        font-size: 0.7rem;
        gap: 3px;
        flex-direction: column;
        align-items: center;
        flex-basis: 60px;
    }
`;

const DetailContainer = styled.div`
    display: flex;
    flex-direction: column;
    gap: 10px;
    padding: 20px 40px;
    font-size: 0.9rem;
    border-bottom: 1px solid rgba(17, 17, 26, 0.1);

    & > div {
        display: flex;
        gap: 20px;
        padding-bottom:10px;
        border-bottom: 1px solid rgba(17, 17, 26, 0.1);

        & > span {
            flex: 0 0 60px;
        }

        & > div {
            flex-grow: 1;
            line-height: 1.5rem;
        }
    }
`;