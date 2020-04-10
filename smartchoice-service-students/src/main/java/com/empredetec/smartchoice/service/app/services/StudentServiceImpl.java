package com.empredetec.smartchoice.service.app.services;

import org.springframework.stereotype.Service;

import com.empredetec.smartchoice.beans.entities.Student;
import com.empredetec.smartchoice.commons.services.BaseServiceImpl;
import com.empredetec.smartchoice.service.app.models.repositories.IStudentRepository;

@Service
public class StudentServiceImpl extends BaseServiceImpl<Student, IStudentRepository > implements IStudentService {

}
