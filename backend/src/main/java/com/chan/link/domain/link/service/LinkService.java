package com.chan.link.domain.link.service;

import com.chan.link.domain.link.dto.LinkDto;
import com.chan.link.domain.link.dto.PageDto;
import com.chan.link.global.vo.LinkVO;
import org.springframework.data.domain.Slice;

import java.util.Optional;

public interface LinkService {

    Slice<LinkVO> LinkRecentAll (PageDto pageDto); // 링크 최신 순 모두 출력
    Optional<LinkVO> LinkBestRecentAll(); // 링크 최신 일주일 간 추천수 높은 순
    Optional<LinkVO> LinkSearch(String search); // link 검색 (HashTag, title)
    Optional<LinkVO> LinkUserAll(); // 나의 링크 조회
    LinkVO LinkAdd(LinkDto linkDto, Long userSeq); // 링크 추가
    LinkVO LinkUpdate(); // 링크 수정
    LinkVO LinkDel(); // 링크 삭제
    LinkVO LinkFollow(); // 링크 팔로우
}