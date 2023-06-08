package com.hivda.hastanerandevu.repository;

import com.hivda.hastanerandevu.repository.entity.Brans;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IBransRepository extends JpaRepository<Brans,Long> {

}
