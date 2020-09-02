package com.where.mockserver.repository;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class GroupTest {

    Group group1;
    Group group2;
    Group group3;
    Group group4;


    @BeforeEach
    void init() {
        User user1 = new User("1", "김민규");
        User user2 = new User("2", "김용재");
        User user3 = new User("3", "김보겸");
        User user4 = new User("4", "이태강");
        group1 = new Group(user1);
        group1.addUser(user2);
        group1.addUser(user3);
        group1.addUser(user4);

        group2 = new Group(user2);
        group3 = new Group(user3);
        group4 = new Group(user4);
    }

    @Test
    void getGroupid() {
        // given
        // when
        // then
        assertThat(group1.getMGroupid()).isEqualTo(1);
        assertThat(group2.getMGroupid()).isEqualTo(2);
        assertThat(group3.getMGroupid()).isEqualTo(3);
        assertThat(group4.getMGroupid()).isEqualTo(4);

    }
}