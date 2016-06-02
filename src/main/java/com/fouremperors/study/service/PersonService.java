package com.fouremperors.study.service;

import com.fouremperors.study.dao.entity.Person;
import com.fouremperors.study.dao.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by qianfanyanfa on 16/6/1.
 */
@Service
public class PersonService {

    @Autowired
    PersonRepository personRepository;

    public Person findById(String id) {
        return personRepository.findOne(id);
    }

    public Person addPersion(Person person) {

        return personRepository.save(person);

    }
}
