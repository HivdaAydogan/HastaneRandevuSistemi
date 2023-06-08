package com.hivda.hastanerandevu.service;

import com.hivda.hastanerandevu.repository.IHastaRepository;
import com.hivda.hastanerandevu.repository.entity.Hasta;
import com.hivda.hastanerandevu.utility.ServiceManager;
import org.springframework.stereotype.Service;

@Service
public class HastaService extends ServiceManager<Hasta,Long> {
    private final IHastaRepository repository;
    public HastaService(IHastaRepository repository) {
        super(repository);
        this.repository = repository;
    }
}
