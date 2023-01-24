package com.mapstruct.lombok.learnings.dto;

import java.util.List;

import lombok.Data;

@Data
public class StudentDTO {

	private Long id;

	private String name;

	private List<LectureDTO> lectures;

	private List<LecturerDTO> lecturers;

	private String departmentName;
}
