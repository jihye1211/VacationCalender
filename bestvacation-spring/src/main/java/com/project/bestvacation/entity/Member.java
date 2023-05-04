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
@Entity(name="member") // 테이블 명을 작성
public class Member {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long mKey;

    @Column(length = 255)
    private String mId;

    @Column(length = 255)
    private String mPassword;

    @Column(length = 8)
    private String mJoinYmd;

    @Column
    private long mYearVacCnt;

    @Column
    private long mUsedVacCnt;

    @Column
    private long mTotalVacCnt;

    @Column(length = 8)
    private String mSignUpYmd;
    
    @Column(length = 2)
    private String mState;

    @Column(length = 255)
    private String mEmail;

    @Column(length = 255)
    private String mName;

    @Column(length = 2)
    private String mGender;

    @Column(length = 8)
    private String mBirthday;

    @Column
    private String mSysTime;

    @Column(length = 255)
    private String mSysUser;

    @Builder
	public Member(long mKey, String mId, String mPassword, String mJoinYmd, long mYearVacCnt, long mUsedVacCnt,
			long mTotalVacCnt, String mSignUpYmd, String mState, String mEmail, String mName, String mGender,
			String mBirthday, String mSysTime, String mSysUser) {
		this.mKey = mKey;
		this.mId = mId;
		this.mPassword = mPassword;
		this.mJoinYmd = mJoinYmd;
		this.mYearVacCnt = mYearVacCnt;
		this.mUsedVacCnt = mUsedVacCnt;
		this.mTotalVacCnt = mTotalVacCnt;
		this.mSignUpYmd = mSignUpYmd;
		this.mState = mState;
		this.mEmail = mEmail;
		this.mName = mName;
		this.mGender = mGender;
		this.mBirthday = mBirthday;
		this.mSysTime = mSysTime;
		this.mSysUser = mSysUser;
	}
    
    /*
    	int	NOT null auto_increment,
		VARCHAR(255)	NULL,
		VARCHAR(255)	NULL,
		VARCHAR(8)	NULL,
		int	NULL,
		int	NULL,
		int	NULL,
		VARCHAR(8)	NULL,
		VARCHAR(2)	NULL,
		VARCHAR(255)	NULL,
		VARCHAR(255)	NULL,
		VARCHAR(2)	NULL,
		VARCHAR(8)	NULL,
		timestamp	NULL,
		VARCHAR(255)	null,
	primary key(m_key)
     * */

}
