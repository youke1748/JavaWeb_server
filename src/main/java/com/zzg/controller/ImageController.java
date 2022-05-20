package com.zzg.controller;


import com.zzg.utils.Result;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

@RestController
@CrossOrigin(value = "*",maxAge = 3600)
@RequestMapping("/image")
public class ImageController {

    private final String imagePath = "D:/image/";
    private final String fileMapper = "/file/";

    @RequestMapping(value = "/uploadFile")
    public Result uploadFile(MultipartFile file) throws IllegalStateException, IOException {
        // 1.文件名称
        String oldFileName = file.getOriginalFilename(); //获取上传文件的原名
        // 2.上传图片
        if(oldFileName!=null && oldFileName.length()>0){
            // 3.新的图片名称
            String newFileName = UUID.randomUUID() + oldFileName.substring(oldFileName.lastIndexOf("."));
            // 4.新图片
            File newFile = new File(imagePath+newFileName);
            // 5.将内存中的数据写入磁盘
            file.transferTo(newFile);
            // 6.返回图片路径
            return Result.succ(fileMapper+newFileName);
        }
        return Result.fail("上传失败");
    }

}
