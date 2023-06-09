package com.hivda.hastanerandevu.service;

import com.hivda.hastanerandevu.dto.request.DoktorSaveRequestDto;
import com.hivda.hastanerandevu.mapper.IDoktorMapper;
import com.hivda.hastanerandevu.repository.IDoktorRepository;
import com.hivda.hastanerandevu.repository.entity.Doktor;
import com.hivda.hastanerandevu.utility.ServiceManager;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
public class DoktorService extends ServiceManager<Doktor,Long> {
    private final IDoktorRepository repository;
    public DoktorService(IDoktorRepository repository) {
        super(repository);
        this.repository = repository;
    }

    public Doktor save(DoktorSaveRequestDto dto){
        /**
         * Dikkat! Burada ek neler yapılabilir?
         * 1- Doktorların özel alan bilgileri kontrol edilerek mükerrer kayıt yapılmasının önüne geçilebilir.
         * 2- bransid benzersiz ve tutarlı olduğu için kontrol edilebilir. bransid yoksa kayıt işlemi
         * hata fırlatabilir.
         */
        Doktor doktor = IDoktorMapper.INSTANCE.fromSaveDto(dto);
        return repository.save(doktor);
    }

    public List<Doktor> findByAd(String ad){
        return repository.findAllByAdContaining(ad);
    }




}
