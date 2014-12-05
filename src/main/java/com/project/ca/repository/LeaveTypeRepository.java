package com.project.ca.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.project.ca.model.*;

public interface LeaveTypeRepository extends JpaRepository<LeaveType,Integer> {
	
}
