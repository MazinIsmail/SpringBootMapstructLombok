package com.mapstruct.lombok.learnings.dto;

import lombok.Data;

import java.util.List;

@Data
public class StudentDTO {

    private Long id;

    private String name;

    private List<LectureDTO> lectures;

    private List<LecturerDTO> lecturers;
}
