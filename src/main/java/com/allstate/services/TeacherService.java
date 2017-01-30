package com.allstate.services;

import com.allstate.entities.Teacher;
import com.allstate.repositories.ITeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeacherService {
    @Autowired
    private ITeacherRepository repository;

    public TeacherService(ITeacherRepository repository){
        this.repository = repository;
    }


    public Teacher create(Teacher t) {
        return this.repository.save(t);
    }
}
