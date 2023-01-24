package com.mapstruct.lombok.learnings.model;

import java.util.List;

import com.mapstruct.lombok.learnings.dto.DepartmentDTO;

import lombok.Data;

@Data
public class StudentModel {

	private Long id;

	private String name;

	private List<LectureModel> lectures;

	private List<LecturerModel> lecturers;

	private DepartmentDTO department;

}
