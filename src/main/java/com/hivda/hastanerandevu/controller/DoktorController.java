package com.hivda.hastanerandevu.controller;

import com.hivda.hastanerandevu.service.DoktorService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.hivda.hastanerandevu.constants.RestApiList.*;

@RestController
@RequestMapping(DOKTOR)
@RequiredArgsConstructor
public class DoktorController {
    private final DoktorService doktorService;
}
