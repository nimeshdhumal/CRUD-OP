package com.postman.controller;

import com.postman.entity.UserEntity;
import com.postman.service.UserService;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class UserController
{
    @Autowired
    UserService userService;

    //Insert into Database;;;
    @PostMapping("/savedata")
    public UserEntity saveForm(@RequestBody UserEntity user)
    {
         UserEntity data = userService.insertForm(user);
         return data;
    }

    //delete from database;;;
    @DeleteMapping("/deleteRow/{id}")
    public void deleteuser(@PathVariable("id") int id)
    {
        userService.deleteData(id);
    }

    //Getting All Data;;;
    @GetMapping("/getdata")
    public List<UserEntity> getdata()
    {
        List<UserEntity> h =  userService.getAlldata();
        return h;
    }

    //Update the Row
    @PutMapping(value = "/updaterow")
    public UserEntity UpdateData( UserEntity entity)
    {
        UserEntity user = userService.updateRow(entity);
        return user;
    }

}