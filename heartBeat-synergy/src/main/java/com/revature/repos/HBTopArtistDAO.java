package com.revature.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.revature.models.HBTopArtist;
import com.revature.models.HBUserAccount;

public interface HBTopArtistDAO extends JpaRepository<HBTopArtist, Integer>{

	List<HBTopArtist> findByUser(HBUserAccount user);
	
	void deleteByUser(HBUserAccount user);

}
