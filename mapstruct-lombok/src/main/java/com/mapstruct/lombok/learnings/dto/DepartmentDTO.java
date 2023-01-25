package com.mapstruct.lombok.learnings.dto;

import lombok.Data;

@Data
public class DepartmentDTO {
	private String name;
	private String section;
	private int quantity;
	private float cost;
}
