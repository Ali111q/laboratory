package com.azu.laboratory.user;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class UserService {
    private UserRepositry userRepositry;

    public UserService(UserRepositry userRepositry) {
        this.userRepositry = userRepositry;
    }

    private UserDto convertEntityToDto(User user){
        UserDto userDto = new UserDto();
        userDto.setId(user.getId());
        userDto.setName(user.getName());
        if (!user.getBloodDonations().isEmpty()) {
            userDto.setBlood_donations(user.getBloodDonations());
        }
        return userDto;
    }
    public List<UserDto> getAll(){

//        return users ;
        List<User> users = userRepositry.findAll();
        System.out.println(users);
        return  users.stream().map(this::convertEntityToDto).collect(Collectors.toList());
    }


}
