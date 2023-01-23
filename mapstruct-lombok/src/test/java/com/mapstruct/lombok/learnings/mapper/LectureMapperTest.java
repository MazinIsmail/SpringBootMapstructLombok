package com.mapstruct.lombok.learnings.mapper;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.mapstruct.lombok.learnings.dto.LectureDTO;
import com.mapstruct.lombok.learnings.model.LectureModel;

/**
 * Integration-level testing for {@link LectureMapper}.
 */
@SpringBootTest
class LectureMapperTest {

    @Autowired
    private LectureMapper mapperUnderTest;

    @Test
    void shouldProperlyMapModelToDto() {
        //given
        LectureModel model = new LectureModel();
        model.setId(11L);
        model.setName("lecture name");

        //when
        LectureDTO dto = mapperUnderTest.toDTO(model);

        //then
        Assertions.assertNotNull(dto);
        Assertions.assertEquals(model.getId(), dto.getId());
        Assertions.assertEquals(model.getName(), dto.getName());
    }

    @Test
    void shouldProperlyMapDtoToModel() {
        //given
        LectureDTO dto = new LectureDTO();
        dto.setId(11L);
        dto.setName("lecture name");

        //when
        LectureModel model = mapperUnderTest.toModel(dto);

        //then
        Assertions.assertNotNull(model);
        Assertions.assertEquals(dto.getId(), model.getId());
        Assertions.assertEquals(dto.getName(), model.getName());
    }
}