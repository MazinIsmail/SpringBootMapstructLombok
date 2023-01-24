package com.mapstruct.lombok.learnings.mapper;

import java.util.List;

import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;

import com.mapstruct.lombok.learnings.dto.LectureDTO;
import com.mapstruct.lombok.learnings.model.LectureModel;

/**
 * uses : Other mapper types used by this mapper.
 */
@Mapper(componentModel = "spring", uses = LectureMapper.class, injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface LectureListMapper {

	List<LectureModel> toModelList(List<LectureDTO> dtos);

	List<LectureDTO> toDTOList(List<LectureModel> models);
}
