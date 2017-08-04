package com.fouremperors.study;

import com.fouremperors.study.dao.entity.Person;
import com.fouremperors.study.service.PersonService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.query.SortQuery;
import org.springframework.data.redis.core.query.SortQueryBuilder;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PersonTest {


    @Autowired
    PersonService personService;
    @Autowired
    StringRedisTemplate stringRedisTemplate;

    @Test
    public void addPerson() {
        Person person = new Person();

        person.setRealName(TestUtil.generateChineseName());
        person.setDate(LocalDate.now().format(DateTimeFormatter.ISO_DATE));
        Person person1 = personService.addPersion(person);

        Assert.assertEquals(person.getId(), person1.getId());

        System.out.println(person.getId());

    }

    @Test
    public void findPersionById() {
        SortQueryBuilder<String> builder=SortQueryBuilder.sort("com.fouremperors.study.dao.entity.Person");
        SortQuery<String> sortQuery = builder.by("id").get("#").build();
        List<String> sort = stringRedisTemplate.sort(sortQuery);

        int a=1;

    }
    @Test
    public  void delAll(){


        Assert.assertTrue(personService.getCount()==0);

    }


}