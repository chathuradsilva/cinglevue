package com.cinglevue.service;

import java.util.List;

import com.cinglevue.domain.Announcement;

public interface AnnouncementService {
	List<Announcement> getAllEntities();
	Announcement getEntity(String id);
    Announcement insertEntity(Announcement announcement);
    Announcement updateEntity(Announcement announcement);
    Announcement deleteEntity(Announcement announcement);
}
