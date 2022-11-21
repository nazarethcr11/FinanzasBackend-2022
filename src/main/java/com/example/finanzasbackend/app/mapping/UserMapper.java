package com.example.finanzasbackend.app.mapping;

import com.example.finanzasbackend.app.domain.model.entity.User;
import com.example.finanzasbackend.app.resources.user.CreateUserResource;
import com.example.finanzasbackend.app.resources.user.UserResource;
import com.example.finanzasbackend.shared.mapping.EnhancedModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.Serializable;
import java.util.List;

public class UserMapper implements Serializable {
    @Autowired
    EnhancedModelMapper mapper;

    public UserResource toResource(User model){return mapper.map(model, UserResource.class);}

    public List<UserResource> toResource(List<User> model){
        return mapper.mapList(model, UserResource.class);
    }

    public User toModel(CreateUserResource resource){
        return mapper.map(resource, User.class);
    }



}
