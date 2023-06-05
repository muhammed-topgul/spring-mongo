package com.mtopgul.springmongodb.repository;

import com.mtopgul.springmongodb.model.CategoryModel;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author muhammed-topgul
 * @since 05/06/2023 14:41
 */
public interface CategoryRepository extends MongoRepository<CategoryModel, String> {
}
