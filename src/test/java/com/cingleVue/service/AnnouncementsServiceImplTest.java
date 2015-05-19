package com.cingleVue.service;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsNull.nullValue;
import static org.hamcrest.core.IsNull.notNullValue;
import static org.hamcrest.core.Is.is;

import com.cinglevue.domain.Announcement;
import com.cinglevue.repository.AnnouncementRepository;
import com.cinglevue.service.AnnouncementService;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration
public class AnnouncementsServiceImplTest {
	
	@Autowired
	private AnnouncementRepository repository;
	
	@Autowired 
	private AnnouncementService announcementService;
	
	private static final String TEST_ID = "555b409143d50afc20e381e3";
	
	@Before
	public void setUp()
	{
		Announcement annuouncement = new Announcement();
		annuouncement.setId(TEST_ID);
		annuouncement.setTitle("test Title");
		annuouncement.setBody("test Body");
		annuouncement.setStartDate(null);
		annuouncement.setExpiryDate(null);
			
		Mockito.when(repository.findOne("john")).thenReturn(annuouncement);

	}
	
	@After
	public void Destroy()
	{
		
	}
	
	@Test
	public void getAllEntities() {
		// TODO Auto-generated method stub
		
		/*List<Announcement> announcements = testRepository.findAll();
		
		for(int i=0;i<announcements.size() ;i++){
			
			
		}*/
		
	}
	@Test
	public void getEntityTest(){
		 Announcement announcement = announcementService.getEntity(TEST_ID);
		 Assert.assertThat(announcement, is(notNullValue()));
	}
	@Test
	public void insertEntity(){
		//Announcement announcement = repository.save(announcement);		
	}
	@Test
	public void updateEntity(){
		//Announcement announcement = repository.save(announcement);
		
	}
	@Test
	public void deleteEntity(){
		//announcement.setActive((Boolean.FALSE));
		//Announcement announcement = repository.save(announcement);
	}
	
	

}
