package com.hivda.hastanerandevu.dto.response;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DoktorResponseDto {
    Long id;
    String ad;
    Long bransid;
    String bransad;
}
