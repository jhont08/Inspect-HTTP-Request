/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.certicamara.inspecthttprequest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.view.RedirectView;
 
import com.certicamara.inspecthttprequest.model.Person;
import com.certicamara.inspecthttprequest.service.PersonService;
import javax.servlet.http.HttpServletRequest;


/**
 *
 * @author Jhon F Triana
 */

@Controller 
public class PersonController {
    
    @Autowired
    private PersonService personService;
     
    @RequestMapping(value = "/person/", method = RequestMethod.GET)  
    public View create(HttpServletRequest request, @ModelAttribute Person person, ModelMap model) {  
        person.setMethod(request.getMethod());
        person.setUrl(request.getRequestURL());
        person.setAccept(request.getHeader("Accept"));
        person.setAcceptEnc(request.getHeader("Accept-Encoding"));
        person.setAcceptLan(request.getHeader("Accept-Language"));
        person.setConnection(request.getHeader("Connection"));
        person.setCookie(request.getHeader("Cookie"));
        person.setHost(request.getHeader("Host"));
        person.setReferer(request.getHeader("Referer"));
        person.setUserAgent(request.getHeader("User-Agent"));
        person.setXRequestedWith(request.getHeader("X-Requested-With"));
        if(StringUtils.hasText(person.getId())) {
            personService.updatePerson(person);
        } else {
            personService.addPerson(person);
        }
        return new RedirectView("/InspectHTTPRequest/");
    }
    
    @RequestMapping(value = "/person/inspect", method = RequestMethod.GET)
    public String getPersonList(ModelMap model) {
        model.addAttribute("personList", personService.listPerson());  
        return "output";  
    }  
    
}
