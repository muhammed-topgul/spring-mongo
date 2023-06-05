package com.mtopgul.springmongodb.repository;

import com.mtopgul.springmongodb.model.UserModel;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author muhammed-topgul
 * @since 05/06/2023 09:55
 */
public interface UserRepository extends MongoRepository<UserModel, String> {
}
