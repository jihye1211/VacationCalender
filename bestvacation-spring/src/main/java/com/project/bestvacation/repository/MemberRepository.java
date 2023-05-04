package com.project.bestvacation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.bestvacation.entity.Member;

@Repository
public interface MemberRepository extends JpaRepository<Member, Long>{

}
