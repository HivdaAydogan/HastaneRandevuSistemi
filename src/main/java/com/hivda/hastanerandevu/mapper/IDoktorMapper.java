package com.hivda.hastanerandevu.mapper;

import com.hivda.hastanerandevu.dto.request.DoktorSaveRequestDto;
import com.hivda.hastanerandevu.repository.entity.Doktor;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface IDoktorMapper {
    IDoktorMapper INSTANCE = Mappers.getMapper(IDoktorMapper.class);

    Doktor fromSaveDto(DoktorSaveRequestDto dto);
}
