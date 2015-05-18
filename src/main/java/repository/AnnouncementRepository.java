package repository;

import java.io.Serializable;

import org.springframework.data.mongodb.repository.MongoRepository;

import domain.Announcement;

public interface AnnouncementRepository extends MongoRepository<Announcement, Serializable>{

}
