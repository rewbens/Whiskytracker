package com.codeclan.example.WhiskyTracker;

import com.codeclan.example.WhiskyTracker.models.Distillery;
import com.codeclan.example.WhiskyTracker.models.Whisky;
import com.codeclan.example.WhiskyTracker.repositories.DistilleryRepository;
import com.codeclan.example.WhiskyTracker.repositories.WhiskyRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class WhiskyTrackerApplicationTests {

	@Autowired
	WhiskyRepository whiskyRepository;

	@Autowired
	DistilleryRepository distilleryRepository;


	@Test
	public void contextLoads() {
	}


	@Test
	public void canFindWhiskyByAParticularYear() {
		List<Whisky> foundWhisky= whiskyRepository.findByYear(1987);
		assertEquals(1, foundWhisky.size());
	}

	@Test
	public void canFindDistilleryByRegion() {
		List<Distillery> foundDistillery= distilleryRepository.findByRegion("Lowland");
		assertEquals(2, foundDistillery.size());
	}





}
