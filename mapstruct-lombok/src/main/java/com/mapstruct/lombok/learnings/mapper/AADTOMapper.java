package com.mapstruct.lombok.learnings.mapper;

import java.util.List;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import com.mapstruct.lombok.learnings.dto.ADTO;
import com.mapstruct.lombok.learnings.dto.BDTO;
import com.mapstruct.lombok.learnings.model.AModel;
import com.mapstruct.lombok.learnings.model.BModel;

/**
 * componentModel = "spring" : Used for injecting this mapper to other classes
 * 
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

	/*
	 * Advises the code generator to apply all the Mappings from an inverse mapping
	 * method to the annotated methodas well.
	 * 
	 * Inverse of this mapping is already provided in bDTOMapping
	 */
	@InheritInverseConfiguration
	BModel bDTOToBModel(BDTO b);

	/*
	 * defaultValue: Used for setting default value if no value is there. When the
	 * source value is null
	 * 
	 * @Mapping(source = "id", target = "identificator", defaultValue = "Default")
	 * 
	 * constant: Used for assigning constant value.
	 * 
	 * @Mapping(target = "identificator", constant = "Hard Coded")
	 * 
	 * defaultExpression: You have to import the LocalDate in the class
	 * like @Mapper(componentModel = "spring", imports = {LocalDate.class} ).
	 * Otherwise the below defaultExpression will not work.
	 * 
	 * @Mapping(source = "id", target = "identificator", defaultExpression =
	 * "java(LocalDate.now())")
	 */
}
