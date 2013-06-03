/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.certicamara.inspecthttprequest.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import javax.persistence.GeneratedValue;
/**
 *
 * @author Jhon F Triana
 */
 
@Document
public class InspectHTTP {
    
    @Id
    @GeneratedValue 
    private String id;
    
    private String method;
    private StringBuffer url;
    private String accept;
    private String acceptEnc;
    private String acceptLan;
    private String connection;
    private String cookie;
    private String host;
    private String referer;
    private String userAgent;
    private String XRequestedWith;
    
    public String getId() {
        return id;
    }
    
    public void setId(String id) {
        this.id = id;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public StringBuffer getUrl() {
        return url;
    }

    public void setUrl(StringBuffer url) {
        this.url = url;
    }

    public String getAccept() {
        return accept;
    }

    public void setAccept(String accept) {
        this.accept = accept;
    }

    public String getAcceptEnc() {
        return acceptEnc;
    }

    public void setAcceptEnc(String acceptEnc) {
        this.acceptEnc = acceptEnc;
    }

    public String getAcceptLan() {
        return acceptLan;
    }

    public void setAcceptLan(String acceptLan) {
        this.acceptLan = acceptLan;
    }

    public String getConnection() {
        return connection;
    }

    public void setConnection(String connection) {
        this.connection = connection;
    }

    public String getCookie() {
        return cookie;
    }

    public void setCookie(String cookie) {
        this.cookie = cookie;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getReferer() {
        return referer;
    }

    public void setReferer(String referer) {
        this.referer = referer;
    }

    public String getUserAgent() {
        return userAgent;
    }

    public void setUserAgent(String userAgent) {
        this.userAgent = userAgent;
    }

    public String getXRequestedWith() {
        return XRequestedWith;
    }

    public void setXRequestedWith(String XRequestedWith) {
        this.XRequestedWith = XRequestedWith;
    }
    
}
