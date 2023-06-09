package com.hivda.hastanerandevu.controller;

import com.hivda.hastanerandevu.dto.request.DoktorSaveRequestDto;
import com.hivda.hastanerandevu.dto.response.DoktorResponseDto;
import com.hivda.hastanerandevu.repository.entity.Doktor;
import com.hivda.hastanerandevu.repository.view.VwDoktor;
import com.hivda.hastanerandevu.service.DoktorService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.hivda.hastanerandevu.constants.RestApiList.*;

@RestController
@RequestMapping(DOKTOR)
@RequiredArgsConstructor
public class DoktorController {
    private final DoktorService doktorService;

    @PostMapping(SAVE)
    public Doktor save(@RequestBody @Valid DoktorSaveRequestDto dto){
        return doktorService.save(dto);
    }


    @GetMapping(FINDBYAD)
    public List<Doktor> findByAd(String ad){
        return doktorService.findByAd(ad);
    }

    /**
     * ÖDEV - Doktorların bilgilerini RESPONSE DTO olarak dönüş
     * yapan 2 metot yazınız.
     * 1. metotta doktorları çekip DTO'ya dönüştürüp listeleyiniz.
     * 2. Direkt DB'den alınan kayıtları View olarak alıp dönüş yapınız.
     */

    public List<DoktorResponseDto> findAllResponse(){
        return null;
    }

    public List<VwDoktor> findAllView(){
        return null;
    }


    @GetMapping(FINDALL)
    public List<Doktor> findAll(){
        return doktorService.findAll();
    }

}
