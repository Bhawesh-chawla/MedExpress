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

import com.cts.model.Doctor;
import com.cts.repository.DoctorRepository;
import com.cts.service.DoctorServiceImpl;

@RunWith(SpringRunner.class)
@SpringBootTest
class EMedServiceMicroservice2ApplicationTests {

	@MockBean
	DoctorRepository repo;
	
	@Autowired
	DoctorServiceImpl doctor;
	
	@Test
	public void updateAvailabilityTest(){
		int id = 101;
		String val = "Test";
		doctor.updateAvailability(id,val);
		verify(repo,times(1)).updateAvailability(id,val);
	}
	
	@Test
	public void getAllDoctorsTest() {
		
		when(repo.findAll()).thenReturn(Stream.of(new Doctor(),new Doctor()).collect(Collectors.toList()));
		assertEquals(2,doctor.getAllDoctors().size());
	}
	
	@Test
	public void getDoctorByIdTest() {
		int id = 101;
		Doctor D = new Doctor();
		D.setDoctor_id(id);
		when(repo.findById(id)).thenReturn(D);
		assertEquals(D,doctor.getDoctorById(id));
	}
}
