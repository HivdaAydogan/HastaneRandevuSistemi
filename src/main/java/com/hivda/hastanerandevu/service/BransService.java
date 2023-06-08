package com.hivda.hastanerandevu.service;

import com.hivda.hastanerandevu.repository.IBransRepository;
import com.hivda.hastanerandevu.repository.entity.Brans;
import com.hivda.hastanerandevu.utility.ServiceManager;
import org.springframework.stereotype.Service;

@Service
public class BransService extends ServiceManager<Brans,Long> {
    private final IBransRepository repository;
    public BransService(IBransRepository repository) {
        super(repository);
        this.repository = repository;
    }
}
