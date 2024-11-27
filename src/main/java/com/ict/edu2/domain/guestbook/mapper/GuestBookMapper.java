package com.ict.edu2.domain.guestbook.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.ict.edu2.domain.guestbook.vo.GuestBookVO;

@Mapper
public interface GuestBookMapper {
  // 간단한 sql 처리 가능  -> 발전 : springjpa(메소드 가지고 알아서 함)
  @Select("select * from guestbook order by gb_idx")
  public List<GuestBookVO> getGuestBookList();
  
  // xml을 가려면 메서드 이름이 id가 된다.
  public GuestBookVO getGuestBookDetail(String gb_idx); // 메소드가 곧 id이다.
}
