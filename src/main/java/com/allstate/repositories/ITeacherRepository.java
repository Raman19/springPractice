package com.allstate.repositories;

import com.allstate.entities.Teacher;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by localadmin on 30/01/17.
 */
public interface ITeacherRepository extends CrudRepository<Teacher,Integer> {
}
