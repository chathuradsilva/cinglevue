package service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import domain.Announcement;
import repository.AnnouncementRepository;
import service.AnnouncementService;

public class AnnouncementServiceImpl implements AnnouncementService{
	
	@Autowired
	private AnnouncementRepository repository;

	@Override
	public List<Announcement> getAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

}
