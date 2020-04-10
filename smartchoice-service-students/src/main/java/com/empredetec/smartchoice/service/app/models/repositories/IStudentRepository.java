package com.empredetec.smartchoice.service.app.models.repositories;

import org.springframework.data.repository.CrudRepository;

import com.empredetec.smartchoice.beans.entities.Student;

public interface IStudentRepository extends CrudRepository<Student, Long> {

}
