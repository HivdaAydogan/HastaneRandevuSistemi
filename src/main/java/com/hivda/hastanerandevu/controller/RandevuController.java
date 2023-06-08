package com.hivda.hastanerandevu.controller;

import com.hivda.hastanerandevu.service.RandevuService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import static com.hivda.hastanerandevu.constants.RestApiList.*;

@RestController
@RequestMapping(RANDEVU)
@RequiredArgsConstructor
public class RandevuController {
    private final RandevuService randevuService;

}
