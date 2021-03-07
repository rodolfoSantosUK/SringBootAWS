package com.rasmoo.cliente.escola.gradecurricular.controller;

import com.rasmoo.cliente.escola.gradecurricular.request.UserDetailsRequestModel;
import com.rasmoo.cliente.escola.gradecurricular.response.UserRest;
import com.rasmoo.cliente.escola.gradecurricular.service.UserService;
import com.rasmoo.cliente.escola.gradecurricular.shared.dto.UserDto;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public UserRest createUser(@RequestBody UserDetailsRequestModel userDetails) {


         UserRest returnValue = new UserRest();

         UserDto userDto = new UserDto();
         BeanUtils.copyProperties(userDetails,userDto);

         UserDto createdUser = userService.createUser(userDto);
         BeanUtils.copyProperties(createdUser,returnValue);

         return returnValue;
     }


}
