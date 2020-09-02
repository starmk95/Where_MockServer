package com.where.mockserver.repository;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class User {
    private final String mUserId;
    private String mName;
}
