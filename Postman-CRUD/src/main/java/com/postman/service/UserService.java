package com.postman.service;

import com.postman.entity.UserEntity;
import com.postman.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService
{
    @Autowired
    UserRepository repository;

    //Insert into Database;;;
    public UserEntity insertForm(UserEntity entity)
    {
        return repository.save(entity);
    }

    //Delete from database;;;
    public void deleteData(int id)
    {
        repository.deleteById((long) id);
    }

    //Getting All Data;;
    public List<UserEntity> getAlldata()
    {
       return repository.findAll();
    }

    //Update the Data;;;
    public UserEntity updateRow(UserEntity entity)
    {
        return repository.save(entity);
    }
}
