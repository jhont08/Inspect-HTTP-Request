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
 
import com.certicamara.inspecthttprequest.model.InspectHTTP;
import com.certicamara.inspecthttprequest.service.InspectHTTPService;
import javax.servlet.http.HttpServletRequest;


/**
 *
 * @author Jhon F Triana
 */

@Controller 
public class InspectHTTPController {
    
    @Autowired
    private InspectHTTPService inspectHTTPService;
     
    @RequestMapping(value = "/httprequest/", method = RequestMethod.GET)  
    public View create(HttpServletRequest request, @ModelAttribute InspectHTTP inspecthttp, ModelMap model) {  
        inspecthttp.setMethod(request.getMethod());
        inspecthttp.setUrl(request.getRequestURL());
        inspecthttp.setAccept(request.getHeader("Accept"));
        inspecthttp.setAcceptEnc(request.getHeader("Accept-Encoding"));
        inspecthttp.setAcceptLan(request.getHeader("Accept-Language"));
        inspecthttp.setConnection(request.getHeader("Connection"));
        inspecthttp.setCookie(request.getHeader("Cookie"));
        inspecthttp.setHost(request.getHeader("Host"));
        inspecthttp.setReferer(request.getHeader("Referer"));
        inspecthttp.setUserAgent(request.getHeader("User-Agent"));
        inspecthttp.setXRequestedWith(request.getHeader("X-Requested-With"));
        if(StringUtils.hasText(inspecthttp.getId())) {
            inspectHTTPService.updateHTTPRequest(inspecthttp);
        } else {
            inspectHTTPService.addHTTPRequest(inspecthttp);
        }
        return new RedirectView("/InspectHTTPRequest/");
    }
    
    @RequestMapping(value = "/httprequest/inspect", method = RequestMethod.GET)
    public String getHTTPRequestList(ModelMap model) {
        model.addAttribute("HTTPRequestList", inspectHTTPService.listHTTPRequest());  
        return "output";  
    }  
    
}
