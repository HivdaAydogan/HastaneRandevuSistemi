package com.hivda.hastanerandevu.repository;

import com.hivda.hastanerandevu.repository.entity.Doktor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IDoktorRepository extends JpaRepository<Doktor,Long> {
}
