package org.example.tests;

import org.example.helpers.PersonServiceHelper;
import org.example.model.Person;
import org.junit.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

public class TestGetPerson {

    private PersonServiceHelper personServiceHelper;

    @BeforeClass
    public void init(){

    }

    @Test
    public void testGetAllPerson(){

        List<Person> personList = personServiceHelper.getAllUser();
    }


}
