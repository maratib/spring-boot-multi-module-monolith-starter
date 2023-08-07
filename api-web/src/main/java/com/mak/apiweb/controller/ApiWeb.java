package com.mak.apiweb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mak.common.service.CommonService;

@RestController
@RequestMapping("/api")
public class ApiWeb {

    @Autowired
    private CommonService commonService;

    @GetMapping
    public ResponseEntity<String> index() {
        return new ResponseEntity<>(commonService.getService(), HttpStatus.OK);
    }

}
