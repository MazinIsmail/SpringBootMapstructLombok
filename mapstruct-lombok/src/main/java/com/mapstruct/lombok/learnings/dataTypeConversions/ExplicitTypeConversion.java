package com.mapstruct.lombok.learnings.dataTypeConversions;

/**
 * 
 */
public interface ExplicitTypeConversion {

	/*
	 * numberFormat
	 * 
	 * MapStruct handles conversion of numbers to String in required format
	 * seamlessly. We can pass the required format as numberFormat during @Mapping
	 * annotation.
	 * 
	 * @Mapping(source = "price", target = "price", numberFormat = "$#.00")
	 */

	/*
	 * dateFormat
	 * 
	 * MapStruct handles conversion of date to String in required format seamlessly.
	 * We can pass the required format as dateFormat during @Mapping annotation.
	 * 
	 * @Mapping(source = "manufacturingDate", target = "manufacturingDate",
	 * dateFormat = "dd.MM.yyyy")
	 * 
	 */

	/*
	 * expression
	 * 
	 * MapStruct allows to call a conversion method for customized logic. We can use
	 * expression to achieve the same where we can pass any java object and call its
	 * method to do the conversion.
	 * 
	 * @Mapping(target = "target-property", expression = "java(target-method())")
	 * 
	 * @Mapping(target = "manufacturingDate", expression =
	 * "java(getManufacturingDate(carEntity.getManufacturingDate()))")
	 */

	/*
	 * const
	 * 
	 * MapStruct allows to map a constant value to a property.
	 * 
	 * @Mapping(target = "target-property", const = "const-value")
	 */

	/*
	 * defaultValue
	 * 
	 * Mapstruct we can pass the default value in case source property is null using
	 * defaultValue attribute of @Mapping annotation.
	 * 
	 * @Mapping(target = "target-property", source="source-property" defaultValue =
	 * "default-value")
	 */

	/*
	 * defaultExpression
	 * 
	 * Mapstruct we can pass a computed value using defaultExpression in case source
	 * property is null using defaultExpression attribute of @Mapping annotation.
	 * 
	 * @Mapping(target = "target-property", source="source-property"
	 * defaultExpression = "default-value-method")
	 * 
	 * @Mapping(source = "name", target = "name", defaultExpression =
	 * "java(UUID.randomUUID().toString())")
	 * 
	 */

}
