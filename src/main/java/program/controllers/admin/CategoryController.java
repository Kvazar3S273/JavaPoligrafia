package program.controllers.admin;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import program.dto.admin.categorydto.CategoryAddDto;
import program.entities.Category;
import program.mapper.ApplicationMapper;
import program.repositories.CategoryRepository;

import java.util.List;

@RestController
@RequestMapping("admin/categories")
@RequiredArgsConstructor
public class CategoryController {
    private final CategoryRepository categoryRepository;
    private final ApplicationMapper mapper;

    @GetMapping("")
    public List<Category> list() {
        return categoryRepository.findAll();
    }

    @PostMapping("")
    public int create(CategoryAddDto model) {
        Category category = mapper.CategoryByAddCategoryDto(model);
        categoryRepository.save(category);
        return category.getId();
    }
}
