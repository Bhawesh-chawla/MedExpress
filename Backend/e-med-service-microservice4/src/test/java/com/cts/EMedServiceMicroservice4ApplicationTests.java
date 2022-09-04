package com.cts;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.cts.model.Blood;
import com.cts.repository.BloodRepository;
import com.cts.service.BloodService;

@SpringBootTest
@RunWith(SpringRunner.class)
class EMedServiceMicroservice4ApplicationTests {

	@Autowired 
	BloodService service;
	
	@MockBean
	BloodRepository repo;
	
	@Test
	public void getBloodByBloodTypeTest() {
		String bt = "O+ve";
		Blood blood = new Blood();
		when(repo.findByBloodType(bt)).thenReturn(blood);
		assertEquals(blood,service.getBloodByBloodType(bt));
	}
	
	@Test
	public void updateCountTest() {
		int count = 5;
		String bt = "O-ve";
		Blood blood = new Blood();
		service.updateCount(bt, count);
		verify(repo,times(1)).save(blood);
	}
	
	@Test
	public void getAllBloodTest() {
		when(repo.findAll()).thenReturn(Stream.of(new Blood(),new Blood()).collect(Collectors.toList()));
		assertEquals(2,service.getAllBlood().size());
	}

}
