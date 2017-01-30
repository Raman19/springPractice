package com.allstate.services;

import com.allstate.entities.Klass;
import com.allstate.enums.Department;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.junit4.SpringRunner;

import java.sql.Date;
import java.time.LocalDate;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
@Sql(value = {"/sql/seed1.sql"})

public class KlassServiceTest {

    @Autowired
    private KlassService service;
    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void shouldReturnCreatedKlass() throws Exception {
        Klass before = new Klass();
        before.setName("raman");
        before.setCredits(4);
        before.setFee(4000);
        before.setDepartment(Department.ENGINEERING);
        before.setSemester(Date.valueOf(LocalDate.now()));
        Klass after = this.service.create(before);
        assertEquals("raman",after.getName());

    }
    @Test

    public void shouldReturnKlassById() {
        assertEquals("jotsna",this.service.findById(1).getName());
    }
    @Test
    public void shouldReturnKlassByName() {
        assertEquals(4,this.service.findByName("jotsna").getCredits());
    }
}