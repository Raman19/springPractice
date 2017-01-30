package com.allstate.services;

import com.allstate.entities.Student;
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
@Sql(value = {"/sql/seed.sql"})
public class StudentServiceTest {
    @Autowired
    private StudentService service;

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void shouldReturnStudentCreated() throws Exception {
        Student before = new Student();
        before.setEmail("raman@gmail.com");
        Student after = this.service.create(before);
        assertEquals("raman@gmail.com",after.getEmail());
    }

    @Test
    public void shouldReturnStudentById() {
        Student s = new Student();
        s.setEmail("abc@gmail.com");
        this.service.create(s);
        assertEquals("dikshita@gmail.com",this.service.findById(1).getEmail());
    }
    @Test
    public void shouldReturnStudentByEmail() {
        assertEquals("dikshita@gmail.com",this.service.findByEmail("dikshita@gmail.com").getEmail());
    }
}