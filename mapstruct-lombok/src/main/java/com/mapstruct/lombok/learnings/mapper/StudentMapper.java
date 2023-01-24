package com.mapstruct.lombok.learnings.mapper;

import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.mapstruct.lombok.learnings.dto.StudentDTO;
import com.mapstruct.lombok.learnings.model.StudentModel;

@Mapper(componentModel = "spring", uses = { LectureListMapper.class,
		LecturerListMapper.class }, injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface StudentMapper {

	@Mapping(source = "department.name", target = "departmentName")
	StudentDTO toDTO(StudentModel model);

	@Mapping(source = "departmentName", target = "department.name")
	StudentModel toModel(StudentDTO dto);
}
