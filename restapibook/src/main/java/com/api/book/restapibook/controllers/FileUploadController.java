package com.api.book.restapibook.controllers;

import com.api.book.restapibook.helper.FileUploadHelper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController
public class FileUploadController{

    @Autowired
    public FileUploadHelper FileUploadHelper;

    @PostMapping("/upload-file")
    public ResponseEntity<String> uploadfile(@RequestParam("file") MultipartFile file){
        // System.out.println(file.getOriginalFilename());
        // System.out.println(file.getSize());
        // System.out.println(file.getContentType());
        // System.out.println(file.getName());

        try{


        //validation
        if(file.isEmpty()){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Request must contain file");
        }

        if(!file.getContentType().equals("image/jpeg")){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Only Jpeg content type are allowed");
        }

        //fileUploadCode...

        boolean f = FileUploadHelper.uploadfile(file);
        if(f){
            // return ResponseEntity.ok("The file is successfully uploaded");

            return ResponseEntity.ok(ServletUriComponentsBuilder.fromCurrentContextPath().path("/images/").path(file.getOriginalFilename()).toUriString());
            
        }

     }catch(Exception e){
        e.printStackTrace();
     }
        
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Something went wrong! Try Again..");
    }
}