package com.allstate.repositories;

import com.allstate.entities.Teacher;
import com.allstate.enums.Gender;
import com.sun.tools.javac.util.List;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;

/**
 * Created by localadmin on 30/01/17.
 */
public interface ITeacherRepository extends CrudRepository<Teacher,Integer> {
   public ArrayList<Teacher> findByGender(Gender female);

     ArrayList<Teacher> findByAgeGreaterThan(int age);
}
