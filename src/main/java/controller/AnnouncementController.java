package controller;

import java.util.List;

import javax.websocket.server.PathParam;

import hello.Greeting;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import domain.Announcement;

@RestController
@RequestMapping("/announcements")
public class AnnouncementController {
	
	@RequestMapping("/")
    public List<Announcement> findAllAnnouncements() {
        return null;
    }
	
	@RequestMapping("/{announcementId}")
	public Announcement findOne(@PathParam(value="announcementId") String announcementId){
		return null;
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public Announcement addOne(Announcement announcement){
		return null;
	}
	
	@RequestMapping(method=RequestMethod.PUT, value = "/{announcementId}")
	public Announcement updateOne(Announcement announcement){
		return null;
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value = "/{announcementId}")
	public Announcement deleteOne(Announcement announcement){
		return null;
	}
}
