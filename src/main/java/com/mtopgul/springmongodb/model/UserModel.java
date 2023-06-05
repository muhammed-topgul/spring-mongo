package com.mtopgul.springmongodb.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.Instant;
import java.util.Map;

/**
 * @author muhammed-topgul
 * @since 05/06/2023 09:54
 */
@Document
@Getter
@Setter
public class UserModel {
    @Id
    private String id;
    private String firstName;
    private String lastName;
    private Map<String, String> properties;
    @CreatedDate
    private Instant createdAt;
    @DBRef
    private CategoryModel category;
}
