package com.cinglevue.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.cinglevue.controller.AnnouncementController;
import com.cinglevue.domain.Announcement;
import com.cinglevue.repository.AnnouncementRepository;
import com.cinglevue.service.AnnouncementService;

@Service
public class AnnouncementServiceImpl implements AnnouncementService{
	
	@Autowired
	private AnnouncementRepository repository;
	private Logger logger = LoggerFactory.getLogger(AnnouncementServiceImpl.class);

	@Override
	public List<Announcement> getAllEntities() {
		// TODO Auto-generated method stub
		logger.info("getAllEntities API");
		return repository.findAll();
	}
	
	public Announcement getEntity(String id){
		logger.info("getEntity API");
		return repository.findOne(id);
	}
	
	public Announcement insertEntity(@RequestBody Announcement announcement){
		logger.info("insertEntity API");
		return repository.save(announcement);		
	}
	
	public Announcement updateEntity(Announcement announcement){
		logger.info("updateEntityAPI");
		return repository.save(announcement);
		
	}	
	public Announcement deleteEntity(Announcement announcement){
		logger.info("deleteEntity API");
		announcement.setActive((Boolean.FALSE));
		return repository.save(announcement);
	}

}
