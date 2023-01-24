package com.mapstruct.lombok.learnings.model;

import java.util.List;

import lombok.Data;

@Data
public class AModel {
	private String id;
	private List<BModel> related;
}
