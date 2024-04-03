package com.jpa.studentsapp.repositories;

import com.jpa.studentsapp.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient,Long> {
    Patient findByNom(String name);
}
