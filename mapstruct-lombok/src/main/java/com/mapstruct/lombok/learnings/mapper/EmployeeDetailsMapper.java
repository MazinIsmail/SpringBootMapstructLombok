package com.mapstruct.lombok.learnings.mapper;

import org.mapstruct.AfterMapping;
import org.mapstruct.BeforeMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.Named;

import com.mapstruct.lombok.learnings.dto.DepartmentDTO;
import com.mapstruct.lombok.learnings.dto.EmployeeDetailsDTO;
import com.mapstruct.lombok.learnings.dto.LecturerDTO;

/**
 * Using Multiple Source Objects
 * 
 * date formater usage while mapping
 * 
 * Custom Mapping using qualifiedByName
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

	/*
	 * Whether the property specified via target() should be ignored by the
	 * generated mapping method or not.This can be useful when certain attributes
	 * should not be propagated from source or target	
	 */
	@Mapping(source = "departmentDTO.name", target = "departmentName", ignore = true)
	@Mapping(source = "departmentDTO.section", target = "departmentSection")
	@Mapping(source = "lecturerDTO.id", target = "lecturerId")
	// Add custom mapper using qualifiedByName
	@Mapping(source = "lecturerDTO.name", target = "lecturerName", qualifiedByName = "trimLectererName")
	EmployeeDetailsDTO toEmployeeDetailsDTOAgain(DepartmentDTO departmentDTO, LecturerDTO lecturerDTO);

	@Named("trimLectererName")
	default String trimLectererName(String lecturerName) {
		return lecturerName.trim();
	}

	/*
	 * For DepartmentDTO, this method is invoked before the mapping. Can be used for
	 * validation and/or set default values.
	 */
	@BeforeMapping
	default void setDefaultValue(DepartmentDTO departmentDTO) {
		if (departmentDTO.getName() == null) {
			departmentDTO.setName("Default Name");
		}
	}

	/*
	 * After calculation use MappingTarget to target the field to set the value.
	 */
	@AfterMapping
	default void calculateTotalCost(DepartmentDTO departmentDTO, @MappingTarget EmployeeDetailsDTO employeeDetailsDTO) {
		float total = departmentDTO.getQuantity() * departmentDTO.getCost();
		employeeDetailsDTO.setTotalCost(total);
	}

}
