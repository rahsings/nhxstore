package com.org.thewitchking.nhxstore.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.org.thewitchking.nhxstore.model.NhxUser;

public interface NhxRepo extends JpaRepository<NhxUser,Integer>{
	
}
