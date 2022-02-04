package program.controllers.admin;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import program.entities.Category;
import program.repositories.CategoryRepository;

import java.util.List;

@RestController
@RequestMapping("admin/categories")
@RequiredArgsConstructor
public class CategoryController {
    private final CategoryRepository categoryRepository;

    @GetMapping("/list")
    public List<Category> list(){
        return categoryRepository.findAll();
    }
}
