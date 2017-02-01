package de.seven.fate.service;

import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class PersonService {

    @Secured({"ROLE_USER"})
    public void printTime(){
        System.out.println(new Date());
    }
}
