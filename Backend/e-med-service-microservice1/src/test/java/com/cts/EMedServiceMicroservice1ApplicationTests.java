package com.cts;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.cts.model.Patient;
import com.cts.repository.PatientRepository;
import com.cts.service.PatientServiceImpl;

@RunWith(SpringRunner.class)
@SpringBootTest
class EMedServiceMicroservice1ApplicationTests {

	@MockBean
	PatientRepository repo;
	
	@Autowired
	PatientServiceImpl patient;
	
	@Test
	public void savePatientTest() {
		Patient P = new Patient("Amit","Pass123456","123,Vikas Nagar",22,"Male","Amit@gmail.com","9425973922");
		when(repo.save(P)).thenReturn(P);
		assertTrue(P.equals(patient.savePatient(P)));
	}
	
	@Test
	public void getAllPatientTest() {
		when(repo.findAll()).thenReturn(Stream.of(new Patient("Amit","Pass123456","123,Vikas Nagar",22,"Male","Amit@gmail.com","9425973922"),
												new Patient("Bhawesh","Pass123456","124,Vikas Nagar",25,"Male","Bhawesh@gmail.com","9435973922")).collect(Collectors.toList()));
		//System.out.print(patient.getAllPatient().size());
		assertEquals(2, patient.getAllPatient().size());
	}
	
	@Test
	public void getPatientByEmailTest() {
		String mail = "TestMail@gmail.com";
		Patient P = new Patient("Amit","Pass123456","123,Vikas Nagar",22,"Male","TestMail@gmail.com","9425973922");
		when(repo.findByEmail(mail)).thenReturn(P);
		assertTrue(P.equals(patient.getPatientByEmail(mail)));
		
	}
	
	@Test
	public void  checkByEmailTest() {
		String mail = "TestMail@gmail.com";
		when(repo.existsByEmail(mail)).thenReturn(true);
		
		assertTrue(patient.checkByEmail(mail));
		
	}

}
