package com.project.bestvacation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.bestvacation.entity.Calender;

import java.util.List;

@Repository
public interface CalenderRepository extends JpaRepository<Calender, Long>{

}
