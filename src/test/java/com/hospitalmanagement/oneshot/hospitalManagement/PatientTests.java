package com.hospitalmanagement.oneshot.hospitalManagement;


import com.hospitalmanagement.oneshot.hospitalManagement.entity.Patient;
import com.hospitalmanagement.oneshot.hospitalManagement.repository.PatientRepository;
import com.hospitalmanagement.oneshot.hospitalManagement.service.PatientService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class PatientTests {

    @Autowired
    private PatientRepository patientRepository;

    @Autowired
    private PatientService patientService;


    @Test
    public void testTransactionMethods(){
        Patient patient = patientService.getPatientById(1L);
        System.out.println(patient);
}
    }

