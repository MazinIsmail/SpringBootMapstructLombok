package com.mapstruct.lombok.learnings.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

import com.mapstruct.lombok.learnings.dto.DepartmentDTO;
import com.mapstruct.lombok.learnings.dto.EmployeeDetailsDTO;
import com.mapstruct.lombok.learnings.dto.LecturerDTO;

/**
 * Using Multiple Source Objects
 * 
 */
@Mapper(componentModel = "spring")
public interface EmployeeDetailsMapper {

	@Mapping(source = "departmentDTO.name", target = "departmentName")
	@Mapping(source = "departmentDTO.section", target = "departmentSection")
	/*
	 * Type conversion automatically happens for the below statement.
	 * 
	 * For dates, you can mention the date format like: -
	 * 
	 * (source = "lecturerDTO.id", target = "lecturerId", dateFromat = "yyyy-MM-dd")
	 */
	@Mapping(source = "lecturerDTO.id", target = "lecturerId")
	@Mapping(source = "lecturerDTO.name", target = "lecturerName")
	EmployeeDetailsDTO toEmployeeDetailsDTO(DepartmentDTO departmentDTO, LecturerDTO lecturerDTO);

	@Mapping(source = "departmentDTO.name", target = "departmentName")
	@Mapping(source = "departmentDTO.section", target = "departmentSection")
	@Mapping(source = "lecturerDTO.id", target = "lecturerId")
	// Add custom mapper using qualifiedByName
	@Mapping(source = "lecturerDTO.name", target = "lecturerName", qualifiedByName = "trimLectererName")
	EmployeeDetailsDTO toEmployeeDetailsDTOAgain(DepartmentDTO departmentDTO, LecturerDTO lecturerDTO);

	@Named("trimLectererName")
	default String trimLectererName(String lecturerName) {
		return lecturerName.trim();
	}

}
