package com.jpa.studentsapp.service;

import com.jpa.studentsapp.entities.Consultation;
import com.jpa.studentsapp.entities.Medecin;
import com.jpa.studentsapp.entities.Patient;
import com.jpa.studentsapp.entities.RendezVous;

public interface IHospitalService {
    Patient savePatient(Patient patient);
    Medecin saveMedecin(Medecin medecin);
    RendezVous saveRDV(RendezVous rendezVous);
    Consultation saveConsultation(Consultation consultation);
}
