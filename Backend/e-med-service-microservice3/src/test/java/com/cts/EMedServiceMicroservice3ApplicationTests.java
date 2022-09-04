package com.cts;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.cts.model.Bed;
import com.cts.repository.BedRepository;
import com.cts.service.BedService;

@SpringBootTest
@RunWith(SpringRunner.class)
class EMedServiceMicroservice3ApplicationTests {

	@Autowired
	BedService service;
	
	@MockBean
	BedRepository repo;

	@Test
	public void getBedByBedTypeTest() {
		String bedType = "TestType";
		Bed bed = new Bed();
		when(repo.findByBedType(bedType)).thenReturn(bed);
		assertEquals(bed,service.getBedByBedType(bedType));
	}
	
	
	@Test
	public void updateCountTest() {
		Bed bed = new Bed();
		verify(repo,times(1)).save(bed);
		
	}
	
	@Test
	public void getAllBedsTest() {
		when(repo.findAll()).thenReturn(Stream.of(new Bed(),new Bed()).collect(Collectors.toList()));
		assertEquals(2,service.getAllBeds().size());
	}
}
