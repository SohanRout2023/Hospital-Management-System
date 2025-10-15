package com.hospitalmanagement.oneshot.hospitalManagement.service;


import com.hospitalmanagement.oneshot.hospitalManagement.entity.Patient;
import com.hospitalmanagement.oneshot.hospitalManagement.repository.PatientRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PatientService {

    private final PatientRepository patientRepository;

    public Patient getPatientById(Long id){
        Patient p1 = patientRepository.findById(id).orElseThrow();
        return p1;
    }
}
