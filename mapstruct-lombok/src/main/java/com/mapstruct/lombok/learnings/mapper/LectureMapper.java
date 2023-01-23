package com.mapstruct.lombok.learnings.mapper;

import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;

import com.mapstruct.lombok.learnings.dto.LectureDTO;
import com.mapstruct.lombok.learnings.model.LectureModel;

@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface LectureMapper {

    LectureDTO toDTO(LectureModel model);

    LectureModel toModel(LectureDTO dto);
}
