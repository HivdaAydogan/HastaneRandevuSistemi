package com.hivda.hastanerandevu.controller;

import com.hivda.hastanerandevu.repository.entity.Brans;
import com.hivda.hastanerandevu.service.BransService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.hivda.hastanerandevu.constants.RestApiList.*;

@RestController
@RequestMapping(BRANS)
@RequiredArgsConstructor
public class BransController {
    private final BransService bransService;

    @PostMapping(SAVE)
    public Brans save(@RequestBody Brans brans){
        return bransService.save(brans);
    }

    @GetMapping(FINDALL)
    public ResponseEntity<List<Brans>> findAll(){
        return ResponseEntity.ok(bransService.findAll());
    }



}
