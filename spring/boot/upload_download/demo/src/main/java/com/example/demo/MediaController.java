package com.example.demo;

import org.springframework.core.io.FileUrlResource;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

@RestController
public class MediaController {

    @GetMapping(value = "/medias/{fileName}", produces = "application/octet-stream")
    public ResponseEntity<Resource> downloadMedia(@PathVariable String fileName)throws Exception {
        Resource resource = new FileUrlResource(fileName);
         return  ResponseEntity
                .ok()
                .body(resource);

    }
    @PostMapping("/upload")
    public String uploadMedia(@RequestParam("file") MultipartFile file){
        try {
            //@TOdo resolve file extension from content type and then use that as extension
           // String contentType=file.getContentType();
            File target = new File(file.getName()+".png");
            Path targetPath = Paths.get(target.toURI());
            long size = Files.copy(file.getInputStream(), targetPath, StandardCopyOption.REPLACE_EXISTING);
            return "uploaded successfully";
        } catch (Exception e) {
           e.printStackTrace();
           return e.getMessage();
        }
    }


}
