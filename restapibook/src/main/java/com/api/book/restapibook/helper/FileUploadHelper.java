package com.api.book.restapibook.helper;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

@Component
public class FileUploadHelper {
    
   // public final String UPLOAD_DIR="C:\\mohit\\Springboot\\restapibook\\src\\main\\resources\\static\\images";
    public final String UPLOAD_DIR = new ClassPathResource("static/images/").getFile().getAbsoluteFile().toString();

    
    public FileUploadHelper() throws IOException{

    }

    public boolean uploadfile(MultipartFile multipartFile){

        boolean f = false;
         
        try{
        //   InputStream is = multipartFile.getInputStream();
        //   byte data[] = new byte[is.available()];
        //   is.read(data);

        //   //write

        //   FileOutputStream fos = new FileOutputStream(UPLOAD_DIR+File.separator+ multipartFile.getOriginalFilename());
        //   fos.write(data);

        //   fos.flush();
        //   fos.close();

          Files.copy(multipartFile.getInputStream(), Paths.get(UPLOAD_DIR+File.separator+multipartFile.getOriginalFilename()), StandardCopyOption.REPLACE_EXISTING);
          f=true;


        }catch(Exception e){
           e.printStackTrace();
        }


        return f;
        
    }
}
