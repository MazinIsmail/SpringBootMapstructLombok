package com.mapstruct.lombok.learnings.mapper;

import java.util.List;

import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;

import com.mapstruct.lombok.learnings.dto.LecturerDTO;
import com.mapstruct.lombok.learnings.model.LecturerModel;

@Mapper(componentModel = "spring", uses = LecturerMapper.class, injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface LecturerListMapper {

    List<LecturerModel> toModelList(List<LecturerDTO> dloList);

    List<LecturerDTO> toDTOList(List<LecturerModel> modelList);
}
