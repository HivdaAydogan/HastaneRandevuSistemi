package com.hivda.hastanerandevu.service;

import com.hivda.hastanerandevu.repository.IRandevuRepository;
import com.hivda.hastanerandevu.repository.entity.Randevu;
import com.hivda.hastanerandevu.utility.ServiceManager;
import org.springframework.stereotype.Service;

@Service
public class RandevuService extends ServiceManager<Randevu,Long> {
    private final IRandevuRepository repository;

    public RandevuService(IRandevuRepository repository) {
        super(repository);
        this.repository = repository;
    }
}
