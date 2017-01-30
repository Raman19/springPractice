package com.allstate.services;

import com.allstate.entities.Student;
import com.allstate.entities.Teacher;
import com.allstate.enums.Gender;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

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
        before.setGender(Gender.FEMALE);
        Teacher after = this.service.create(before);
        assertEquals("anusha",after.getName());

    }

    @Test
    public void shouldReturnTeacherById() throws Exception {
        assertEquals(23,this.service.findById(1).getAge());
    }

    @Test
    public void shouldReturnTeacherByGender() {
        ArrayList<Teacher> t = this.service.findByGender(Gender.MALE);
        assertEquals("t1",t.get(0).getName());
        ArrayList<Teacher> treacherList = this.service.findByGender(Gender.FEMALE);
        assertEquals(23,treacherList.get(0).getAge());
    }

    @Test
    public void shouldReturnTeachersGreaterThanSpecificAge(){
        ArrayList<Teacher> t = this.service.findByAgeGreaterThan(20);
    }
}