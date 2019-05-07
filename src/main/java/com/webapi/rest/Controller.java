package com.webapi.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * TODO insert class description
 *
 * @author : afneto
 */

@RestController
public class Controller {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public static List<String> GetPessoas() {

        final List<String> list = new ArrayList<String>();
        list.add("André");
        list.add("Daniel");
        list.add("Fábio");
        list.add("Filipe");
        list.add("Hugo");
        list.add("Renato");
        list.add("José");
        list.add("António");
        list.add("Patrício");
        list.add("Joana");
        list.add("Teresa");
        list.add("Carlos");
        list.add("Ricardo");
        list.add("Bernardo");
        list.add("Ana");
        list.add("Maria");
        list.add("Carolina");

        return list;
    }

}
