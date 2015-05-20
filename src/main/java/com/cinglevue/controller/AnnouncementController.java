package com.cinglevue.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cinglevue.service.AnnouncementService;
import com.cinglevue.domain.Announcement;

@RestController
@RequestMapping("/announcements")
public class AnnouncementController {
	
	@Autowired
	private AnnouncementService announcementService;
	
	private Logger logger = LoggerFactory.getLogger(AnnouncementController.class);
		
	@RequestMapping(value = "")
    public List<Announcement> findAllAnnouncements() {
		logger.info("findAllAnnouncements() API");
        return announcementService.getAllEntities();
    }
	
	@RequestMapping(value = "/{announcementId}")
	public Announcement findOne(@PathVariable(value="announcementId") String announcementId){
		//return null;
		logger.info("findOne API");
		return announcementService.getEntity(announcementId);
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public Announcement addOne(@RequestBody Announcement announcement){
		//return null;
		logger.info("addOne API");
		return announcementService.insertEntity(announcement);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value = "/{announcementId}")
	public Announcement updateOne(@RequestBody Announcement announcement){
		logger.info("updateOne API");
		return announcementService.updateEntity(announcement);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value = "/{announcementId}")
	public Announcement deleteOne(@RequestBody Announcement announcement){
		logger.info("deleteOne API");
		return announcementService.deleteEntity(announcement);
	}
}
