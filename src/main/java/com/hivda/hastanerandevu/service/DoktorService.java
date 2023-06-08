package com.hivda.hastanerandevu.service;

import com.hivda.hastanerandevu.repository.IDoktorRepository;
import com.hivda.hastanerandevu.repository.entity.Doktor;
import com.hivda.hastanerandevu.utility.ServiceManager;
import org.springframework.stereotype.Service;

@Service
public class DoktorService extends ServiceManager<Doktor,Long> {
    private final IDoktorRepository repository;
    public DoktorService(IDoktorRepository repository) {
        super(repository);
        this.repository = repository;
    }
}
