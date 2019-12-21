package com.binus.skripsi.bcg.repository;

import com.binus.skripsi.bcg.model.entity.Ballistocardiography;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BallistocardiographyRepository extends JpaRepository<Ballistocardiography, Integer> {
}
