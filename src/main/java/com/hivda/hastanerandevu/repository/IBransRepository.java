package com.hivda.hastanerandevu.repository;

import com.hivda.hastanerandevu.repository.entity.Brans;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IBransRepository extends JpaRepository<Brans,Long> {

    /**
     * Bu değer varsa nesne gelecek yoksa null
     * bunun yerine ne kullanılabilir?
     */
    Optional<Brans> findOptionalByAdIgnoreCase(String ad);

}
