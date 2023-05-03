-- 데이터베이스 생성
CREATE DATABASE bestvacation_db;
SHOW  databases;
USE bestvacation_db;

-- 멤버 테이블
CREATE TABLE member (
    m_key           INT(20) NOT NULL AUTO_INCREMENT COMMENT 'pk',
    m_id            VARCHAR(14) NULL COMMENT '아이디',
    m_password      VARCHAR(16) NULL COMMENT '비밀번호',
    m_join_ymd      VARCHAR(8) NULL COMMENT '입사일',
    m_sign_up_ymd   VARCHAR(8) NULL COMMENT '회원가입일',
    m_year_vac_cnt  INT(2) NULL COMMENT '당해년도 연차일수',
    m_used_vac_cnt  INT(2) NULL COMMENT '소진 연차일수',
    m_total_vac_cnt INT(2) NULL COMMENT '총 연차일수',
    m_is_active     VARCHAR(2) DEFAULT '1' COMMENT '사용여부(0:부,1:여)', 
    m_name          VARCHAR(20) NULL COMMENT '이름',
    m_gender        VARCHAR(2) NULL COMMENT '성별',
    m_birthday      VARCHAR(8) NULL COMMENT '생년월일',
    m_email         VARCHAR(64) NULL COMMENT '이메일',
    m_created_at    DATETIME DEFAULT CURRENT_TIMESTAMP COMMENT '생성시간',
    m_updated_at    DATETIME DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '수정시간',
    PRIMARY KEY(m_key)
) ENGINE=InnoDB CHARSET=utf8mb4;

-- 캘린더 테이블
CREATE TABLE calendar (
    c_key        INT(20) NOT NULL AUTO_INCREMENT COMMENT 'pk',
    c_ymd        VARCHAR(8) NULL COMMENT '일자(yyyymmdd)',
    m_key        INT(20) NOT NULL COMMENT '회원fk',
    c_type       VARCHAR(2) NULL COMMENT '유형(1:불가일,2:휴일,3:연차,4:오전반차,5:오후반차,6:병가,7:경조사)', 
    c_cncl_yn    VARCHAR(2) DEFAULT '0' COMMENT '취소여부(0:부,1:여)',
    c_aprov_yn   VARCHAR(2) DEFAULT '1' COMMENT '승인여부(0:부,1:여,9:에러)',
    c_created_at    DATETIME DEFAULT CURRENT_TIMESTAMP COMMENT '생성시간',
    c_updated_at    DATETIME DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '수정시간',
    c_sys_user   VARCHAR(20) NULL COMMENT '시스템유저',
    PRIMARY KEY(c_key)
) ENGINE=InnoDB CHARSET=utf8mb4;

-- 생성된 테이블 컬럼 조회
SHOW columns FROM member;
SHOW columns FROM calendar;