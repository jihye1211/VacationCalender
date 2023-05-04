package com.project.bestvacation.entity;

import lombok.*;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Getter // getter 메소드 생성
@Builder // 빌더를 사용할 수 있게 함
//@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity(name="calender") // 테이블 명을 작성
public class Calender {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long cKey;

    @Column(length = 8)
    private String cYmd;

    @Column(nullable = false)
    private long mKey;

    @Column(length = 2)
    private String cType;
    
    @Column(length = 2)
    private String cCnclYn;

    @Column(length = 2)
    private String cAprovYn;

    @Column
    private String cSysTime;

    @Column(length = 255)
    private String cSysUser;

    @Builder
	public Calender(long cKey, String cYmd, long mKey, String cType, String cCnclYn, String cAprovYn, String cSysTime,
			String cSysUser) {
		this.cKey = cKey;
		this.cYmd = cYmd;
		this.mKey = mKey;
		this.cType = cType;
		this.cCnclYn = cCnclYn;
		this.cAprovYn = cAprovYn;
		this.cSysTime = cSysTime;
		this.cSysUser = cSysUser;
	}
    
    /*
    c_key	int	NOT null auto_increment,
	c_ymd	VARCHAR(8)	NULL,
	m_key	int	NOT NULL,
	c_type	VARCHAR(2)	NULL,
	c_cncl_yn	varchar(2)	NULL,
	c_aprov_yn	VARCHAR(2)	NULL,
	c_sys_time	timestamp	NULL,
	c_sys_user	VARCHAR(255)	null,
	primary key(c_key)
     * */

}
