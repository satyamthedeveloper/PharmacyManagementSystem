package com.cts.patient;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;

import com.cts.patient.dao.PatientDao;
import com.cts.patient.model.Patient;
import com.cts.patient.services.PatientServiceImpl;

@SpringBootTest
class PatientMsApplicationTests {

	@InjectMocks
	PatientServiceImpl patientServiceMock;

	@Mock
	PatientDao patientDaoMock;

	@Before
	public void init() {
		MockitoAnnotations.initMocks(this);
	}

	@SuppressWarnings("deprecation")
	@Test
	public void testGetAllPatientDetails() {
		List<Patient> demoList = new ArrayList<Patient>();
		demoList.add(new Patient(11, "Rakesh", new Date(1995, 05, 05), 'M', true, 985884478));
		when(patientDaoMock.findAll()).thenReturn(demoList);
		List<Patient> result = patientServiceMock.getAllPatientDetails();
		assertEquals(demoList, result);
	}

	@SuppressWarnings("deprecation")
	@Test
	public void testGetStockDetailsById() {
		Optional<Patient> patient = Optional
				.of(new Patient(11, "Rakesh", new Date(1995, 05, 05), 'M', true, 985884478));
		long id = 11;
		when(patientDaoMock.findById(id)).thenReturn(patient);
		Optional<Patient> result = patientServiceMock.getPatientDetailsById(11);
		assertEquals(patient, result);
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void testAddStock() {
		Patient patient = new Patient(11, "Rakesh", new Date(1995, 05, 05), 'M', true, 985884478);
		patientServiceMock.addPatient(patient);
		
		verify(patientDaoMock, times(1)).save(patient);
		
	}


}
