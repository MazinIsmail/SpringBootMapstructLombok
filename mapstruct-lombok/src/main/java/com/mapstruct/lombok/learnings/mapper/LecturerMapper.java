package com.mapstruct.lombok.learnings.mapper;

import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;

import com.mapstruct.lombok.learnings.dto.LecturerDTO;
import com.mapstruct.lombok.learnings.model.LecturerModel;

@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface LecturerMapper {

    LecturerDTO toDTO(LecturerModel model);

    LecturerModel toModel(LecturerDTO dto);
}
