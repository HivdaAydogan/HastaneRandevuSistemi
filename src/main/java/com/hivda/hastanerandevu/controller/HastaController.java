package com.hivda.hastanerandevu.controller;
import com.hivda.hastanerandevu.service.HastaService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.hivda.hastanerandevu.constants.RestApiList.*;

@RestController
@RequestMapping(HASTA)
@RequiredArgsConstructor
public class HastaController {
    private final HastaService hastaService;
}
