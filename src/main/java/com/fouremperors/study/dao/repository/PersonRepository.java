package com.fouremperors.study.dao.repository;

import com.fouremperors.study.dao.entity.Person;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by qianfanyanfa on 16/6/1.
 */
public interface PersonRepository extends CrudRepository<Person, String> {



}
