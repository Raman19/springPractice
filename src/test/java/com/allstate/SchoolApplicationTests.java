package com.allstate;

import com.allstate.services.KlassServiceTest;
import com.allstate.services.StudentServiceTest;
import com.allstate.services.TeacherServiceTest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.junit4.SpringRunner;

//@RunWith(SpringRunner.class)
@RunWith(Suite.class)
@SpringBootTest
@Sql(value = {"/sql/seed1.sql"})
@Suite.SuiteClasses({
		StudentServiceTest.class,
		KlassServiceTest.class,
		TeacherServiceTest.class,
})
public class SchoolApplicationTests {

	@Test
	public void contextLoads() {
	}

}
