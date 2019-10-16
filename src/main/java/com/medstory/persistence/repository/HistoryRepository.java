package com.medstory.persistence.repository;

import com.medstory.persistence.model.History;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HistoryRepository extends JpaRepository<History, Long> {

    List<History> findByPatientCc(Long cc);

    List<History> findByDoctorProfessionalCard(Long professionalCard);
}
