package com.jpa.studentsapp.service;

import com.jpa.studentsapp.repositories.ConsultationRepository;
import com.jpa.studentsapp.repositories.MedecinRepository;
import com.jpa.studentsapp.repositories.PatientRepository;
import com.jpa.studentsapp.repositories.RendezVousRepository;
import jakarta.transaction.Transactional;
import com.jpa.studentsapp.entities.Consultation;
import com.jpa.studentsapp.entities.Medecin;
import com.jpa.studentsapp.entities.Patient;
import com.jpa.studentsapp.entities.RendezVous;

import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@Transactional
public class HospitalServiceImpl implements IHospitalService {

    private PatientRepository patientRepository;
    private MedecinRepository medecinRepository;
    private RendezVousRepository rendezVousRepository;
    private ConsultationRepository consultationRepository;

    public HospitalServiceImpl(PatientRepository patientRepository, MedecinRepository medecinRepository, RendezVousRepository rendezVousRepository, ConsultationRepository consultationRepository) {
        this.patientRepository = patientRepository;
        this.medecinRepository = medecinRepository;
        this.rendezVousRepository = rendezVousRepository;
        this.consultationRepository = consultationRepository;
    }

    @Override
    public Patient savePatient(Patient patient) {

        return patientRepository.save(patient);
    }

    @Override
    public Medecin saveMedecin(Medecin medecin) {

        return medecinRepository.save(medecin);
    }

    @Override
    public RendezVous saveRDV(RendezVous rendezVous) {
        rendezVous.setId(UUID.randomUUID().toString());
        return rendezVousRepository.save(rendezVous);
    }

    @Override
    public Consultation saveConsultation(Consultation consultation) {
        return consultationRepository.save(consultation);
    }
}
