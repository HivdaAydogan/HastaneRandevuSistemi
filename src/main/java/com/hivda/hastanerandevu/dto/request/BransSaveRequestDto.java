package com.hivda.hastanerandevu.dto.request;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class BransSaveRequestDto {
    @NotEmpty
    @Size(min = 2, max = 20)
    String ad;
}
