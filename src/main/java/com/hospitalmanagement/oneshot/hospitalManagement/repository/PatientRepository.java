package com.hospitalmanagement.oneshot.hospitalManagement.repository;

import com.hospitalmanagement.oneshot.hospitalManagement.entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient, Long> {
}
