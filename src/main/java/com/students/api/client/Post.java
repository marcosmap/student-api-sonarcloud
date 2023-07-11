package com.students.api.client;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Post {
    /**
     * This is an userId of the variable.
     */
    private int userId;
    /**
     * This is an id of the variable.
     */
    private int id;
    /**
     * This is a title of the variable.
     */
    private String title;
    /**
     * This is a description of the variable.
     */
    private String body;
}
