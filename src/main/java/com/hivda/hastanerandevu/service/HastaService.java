package com.hivda.hastanerandevu.service;

import com.hivda.hastanerandevu.dto.request.HastaSaveRequestDto;
import com.hivda.hastanerandevu.mapper.IHastaMapper;
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

    public Hasta save(HastaSaveRequestDto dto){
        Hasta hasta = IHastaMapper.INSTANCE.fromSaveDto(dto);
        return save(hasta);
    }





}
