package com.jpa.studentsapp.repositories;

import com.jpa.studentsapp.entities.Consultation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConsultationRepository extends JpaRepository<Consultation,Long> {
}
