package com.allstate.services;

import com.allstate.entities.Student;
import com.allstate.entities.Teacher;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;


@RunWith(SpringRunner.class)
@SpringBootTest
@Sql(value = {"/sql/seed2.sql"})

public class TeacherServiceTest {
    @Autowired
    private TeacherService service;

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void shouldReturnCreateTeacher() throws Exception {
        Teacher before = new Teacher();
        before.setName("anusha");
        before.setAge(25);
        before.setGender("female");
        Teacher after = this.service.create(before);
        assertEquals("anusha",after.getName());

    }
}