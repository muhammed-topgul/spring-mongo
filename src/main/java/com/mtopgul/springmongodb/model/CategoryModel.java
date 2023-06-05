package com.mtopgul.springmongodb.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author muhammed-topgul
 * @since 05/06/2023 13:30
 */
@Document
@Getter
@Setter
public class CategoryModel {
    @Id
    private String id;
    private String name;
    private String description;
}
