package com.fouremperors.study;

import com.fouremperors.study.dao.entity.Person;
import com.fouremperors.study.service.PersonService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.WebIntegrationTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.UUID;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(Application.class)
@WebIntegrationTest({"server.port=9000", "management.port=0"})
public class PersonTest {


    @Autowired
    PersonService personService;

    @Test
    public void addPerson() {
        Person person = new Person();

        person.setId(UUID.randomUUID().toString());
        person.setFirstname("Keith");
        person.setLastname("Fu");
        Person person1 = personService.addPersion(person);

        Assert.assertEquals(person.getId(), person1.getId());

        System.out.println(person.getId());

    }

    @Test
    public void findPersionById() {

        String id = "5ac10087-d74e-4ce8-a6de-f7fdcabbbe13";

        Person person = personService.findById(id);

        Assert.assertEquals("Fu", person.getLastname());


    }


}