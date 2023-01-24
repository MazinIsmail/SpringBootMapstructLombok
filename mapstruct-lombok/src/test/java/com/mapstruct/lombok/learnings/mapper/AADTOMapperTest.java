package com.mapstruct.lombok.learnings.mapper;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.mapstruct.lombok.learnings.dto.ADTO;
import com.mapstruct.lombok.learnings.model.AModel;
import com.mapstruct.lombok.learnings.model.BModel;

@SpringBootTest
public class AADTOMapperTest {

	@Autowired
	private AADTOMapper aADTOMapper;

	@Test
	void mapperTesting() {
		AModel aModel = new AModel();
		aModel.setId("123");

		BModel bModel = new BModel();
		bModel.setId("321");
		bModel.setName("BModel Name");
		aModel.setRelated(List.of(bModel));

		ADTO aDto = aADTOMapper.mapperA(aModel);

		Assertions.assertNotNull(aDto);
		Assertions.assertEquals(aDto.getId(), aModel.getId());
		Assertions.assertEquals(aDto.getRelations().get(0).getRelatedName(), bModel.getName());
	}
}
