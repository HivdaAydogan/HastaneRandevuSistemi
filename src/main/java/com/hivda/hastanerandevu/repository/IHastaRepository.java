package com.hivda.hastanerandevu.repository;

import com.hivda.hastanerandevu.repository.entity.Hasta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IHastaRepository extends JpaRepository<Hasta,Long> {
}
