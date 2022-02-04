package program.mapper;

import org.mapstruct.Mapper;
import program.dto.admin.categorydto.CategoryAddDto;
import program.entities.Category;

@Mapper(componentModel = "spring")
public interface ApplicationMapper {
    Category CategoryByAddCategoryDto(CategoryAddDto dto);
}
