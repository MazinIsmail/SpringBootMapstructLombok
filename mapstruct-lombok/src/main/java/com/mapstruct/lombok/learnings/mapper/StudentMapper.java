package com.mapstruct.lombok.learnings.mapper;

import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;

import com.mapstruct.lombok.learnings.dto.StudentDTO;
import com.mapstruct.lombok.learnings.model.StudentModel;

@Mapper(componentModel = "spring",
        uses = {LectureListMapper.class, LecturerListMapper.class},
        injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface StudentMapper {

    StudentDTO toDTO(StudentModel model);

    StudentModel toModel(StudentDTO dto);
}
