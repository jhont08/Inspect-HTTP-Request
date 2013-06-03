/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.certicamara.inspecthttprequest.service;

import java.util.List;
import java.util.UUID;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;
 
import com.certicamara.inspecthttprequest.model.InspectHTTP;
/**
 *
 * @author Jhon F Triana
 */

@Repository
public class InspectHTTPService {
    @Autowired
    private MongoTemplate mongoTemplate;
     
    public static final String COLLECTION_NAME = "httprequest";
     
    public void addHTTPRequest(InspectHTTP inspecthttp) {
        if (!mongoTemplate.collectionExists(InspectHTTP.class)) {
            mongoTemplate.createCollection(InspectHTTP.class);
        }       
        inspecthttp.setId(UUID.randomUUID().toString());
        mongoTemplate.insert(inspecthttp, COLLECTION_NAME);
    }
     
    public List<InspectHTTP> listHTTPRequest() {
        return mongoTemplate.findAll(InspectHTTP.class, COLLECTION_NAME);
    }
     
    public void updateHTTPRequest(InspectHTTP httprequest) {
        mongoTemplate.insert(httprequest, COLLECTION_NAME);      
    }
    
}
