package com.yyt.ppc.controller;


import com.yyt.ppc.model.Person;
import com.yyt.ppc.services.PersonService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by kibrom on 6/27/16.
 */
@RestController
public class PersonController {

    private static final Log logger = LogFactory.getLog(PersonController.class);

    @Autowired
    PersonService personService;

    @RequestMapping({"/admin"})
    public String welcome(){
        return "Welcom to rest example";
    }
    @RequestMapping({"/getPerson"})
    public Person getPerson(){

        Person person = new Person();
        person.setName("Hagos");
        person.setCountry("Ethiopia");
        return person;
    }
    @RequestMapping(value = "/")
    public ModelAndView home(){

        return new ModelAndView("success");
    }
}
