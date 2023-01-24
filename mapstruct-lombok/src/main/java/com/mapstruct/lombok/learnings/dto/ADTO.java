package com.mapstruct.lombok.learnings.dto;

import java.util.List;

import lombok.Data;

@Data
public class ADTO {
	private String id;
	private List<BDTO> relations;
}
