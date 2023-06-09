package com.hivda.hastanerandevu.mapper;

import com.hivda.hastanerandevu.dto.request.HastaSaveRequestDto;
import com.hivda.hastanerandevu.repository.entity.Hasta;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface IHastaMapper {
    IHastaMapper INSTANCE = Mappers.getMapper(IHastaMapper.class);
    Hasta fromSaveDto(HastaSaveRequestDto dto);
}
