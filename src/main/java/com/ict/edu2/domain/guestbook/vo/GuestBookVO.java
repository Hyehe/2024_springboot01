package com.ict.edu2.domain.guestbook.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor // 변수들을 다 만든 생성자
@NoArgsConstructor  // 기본 생성자
public class GuestBookVO {
  private String gb_idx, gb_name, gb_subject, gb_content, gb_email, gb_pw, gb_regdate;
}
