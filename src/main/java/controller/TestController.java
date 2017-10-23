package controller;

import jpa.repository.TestRepository;
import lombok.Data;

import javax.ejb.EJB;
import javax.inject.Named;

@Named
@Data
public class TestController {

    @EJB
    private TestRepository testRepository;

    private String test = "cdi.test";
}
