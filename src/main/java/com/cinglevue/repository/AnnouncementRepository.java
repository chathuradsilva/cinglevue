package com.cinglevue.repository;

import java.io.Serializable;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.cinglevue.domain.Announcement;

public interface AnnouncementRepository extends MongoRepository<Announcement, Serializable>{

}
