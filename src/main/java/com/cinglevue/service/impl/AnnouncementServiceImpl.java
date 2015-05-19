package com.cinglevue.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.cinglevue.domain.Announcement;
import com.cinglevue.repository.AnnouncementRepository;
import com.cinglevue.service.AnnouncementService;

@Service
public class AnnouncementServiceImpl implements AnnouncementService{
	
	@Autowired
	private AnnouncementRepository repository;

	@Override
	public List<Announcement> getAllEntities() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}
	
	public Announcement getEntity(String id){
		return repository.findOne(id);
	}
	
	public Announcement insertEntity(@RequestBody Announcement announcement){
		return repository.save(announcement);		
	}
	
	public Announcement updateEntity(Announcement announcement){
		return repository.save(announcement);
		
	}	
	public Announcement deleteEntity(Announcement announcement){
		announcement.setActive((Boolean.FALSE));
		return repository.save(announcement);
	}

}
