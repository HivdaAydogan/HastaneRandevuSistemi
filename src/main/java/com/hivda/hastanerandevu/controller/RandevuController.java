package com.hivda.hastanerandevu.controller;

import com.hivda.hastanerandevu.dto.request.RandevuSaveRequestDto;
import com.hivda.hastanerandevu.repository.entity.Randevu;
import com.hivda.hastanerandevu.service.RandevuService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import static com.hivda.hastanerandevu.constants.RestApiList.*;

@RestController
@RequestMapping(RANDEVU)
@RequiredArgsConstructor
public class RandevuController {
    private final RandevuService randevuService;

    @PostMapping(SAVE)
    public Randevu save(@RequestBody @Valid RandevuSaveRequestDto dto){
        return randevuService.save(dto);
    }


}
