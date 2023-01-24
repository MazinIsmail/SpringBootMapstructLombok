package com.mapstruct.lombok.learnings.mapper;

import java.util.List;

import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import com.mapstruct.lombok.learnings.dto.ADTO;
import com.mapstruct.lombok.learnings.dto.BDTO;
import com.mapstruct.lombok.learnings.model.AModel;
import com.mapstruct.lombok.learnings.model.BModel;

/**
 * When you mapping lists you should make a map for both the class element and
 * the list to map all the elements of the list)
 */
@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface AADTOMapper {

	@Mappings({ @Mapping(source = "related", target = "relations") })
	ADTO mapperA(AModel obj);

	@Mapping(source = "id", target = "identificator")
	@Mapping(source = "name", target = "relatedName")
	BDTO bDTOMapping(BModel b);

	List<BDTO> bDTOListMapping(List<BModel> bList);
}
