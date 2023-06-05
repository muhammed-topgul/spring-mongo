package com.mtopgul.springmongodb.bootstrap;

import com.mtopgul.springmongodb.model.CategoryModel;
import com.mtopgul.springmongodb.model.UserModel;
import com.mtopgul.springmongodb.repository.CategoryRepository;
import com.mtopgul.springmongodb.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * @author muhammed-topgul
 * @since 05/06/2023 10:22
 */
@Component
@RequiredArgsConstructor
public class BootstrapData implements CommandLineRunner {
    private final UserRepository userRepository;
    private final CategoryRepository categoryRepository;

    @Override
    public void run(String... args) throws Exception {
        newCategory();
    }

    private void newCategory() {
        CategoryModel categoryModel = new CategoryModel();
        categoryModel.setName("Cat-1");
        categoryModel.setDescription("Desc-1");
        categoryModel = categoryRepository.save(categoryModel);
        newUser(categoryModel);
    }

    private void newUser(CategoryModel categoryModel) {
        UserModel userModel = new UserModel();
        userModel.setFirstName("Muhammed");
        userModel.setLastName("Topgul");

        Map<String, String> properties = new HashMap<>();
        properties.put("job", "Software Engineer");
        properties.put("expertise", "Java Development");
        userModel.setProperties(properties);

        userModel.setCategory(categoryModel);

        userRepository.save(userModel);
    }
}
