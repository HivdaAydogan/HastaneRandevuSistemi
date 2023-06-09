package com.hivda.hastanerandevu.service;

import com.hivda.hastanerandevu.dto.request.BransSaveRequestDto;
import com.hivda.hastanerandevu.exceptions.ErrorType;
import com.hivda.hastanerandevu.exceptions.HastaneRandevuException;
import com.hivda.hastanerandevu.repository.IBransRepository;
import com.hivda.hastanerandevu.repository.entity.Brans;
import com.hivda.hastanerandevu.utility.ServiceManager;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BransService extends ServiceManager<Brans,Long> {
    private final IBransRepository repository;
    public BransService(IBransRepository repository) {
        super(repository);
        this.repository = repository;
    }

    public Brans save(BransSaveRequestDto dto){
        /**
         * Dikkat! Eğer aynı isimde bir brans varsa kayıt önce kontrol edilmeli
         * sonra kayıt yapılmalıdır.
         * "dahiliye" - "Dahiliye" - "DAHİLİYE" - "   dahiliye"
         */
        String bransAdi = dto.getAd().trim();
        /**
         * 1. Yöntem
         * Optional<Brans> optionalBrans = repository.findOptionalByAdIgnoreCase(bransAdi);
         *         if (optionalBrans.isEmpty())
         *             // Burada kayıt yapılmalı
         *             ;
         *         else
         *             // Burada hata döndürülmeli
         *         ;
         * 2. Yöntem
         *   repository.findOptionalByAdIgnoreCase(bransAdi)
         *                 .ifPresentOrElse(
         *                         brans -> {
         *                             throw new RuntimeException("Bu isimde bir branş zaten var");
         *                         },
         *                         () -> {
         *                             Brans brans = Brans.builder().ad(bransAdi).build();
         *                             repository.save(brans);
         *                         }
         *                 );
         *
         */
        Optional<Brans> optionalBrans = repository.findOptionalByAdIgnoreCase(bransAdi);
        if (optionalBrans.isPresent()) // Eğer böyle bir kayıt varsa burada akışı bitir.
            throw new HastaneRandevuException(ErrorType.BRANS_ZATEN_KAYITLI);
        // Brans brans = Brans.builder().ad(bransAdi).build();
        // return repository.save(brans);
        return repository.save(Brans.builder().ad(bransAdi).build());



    }









}
