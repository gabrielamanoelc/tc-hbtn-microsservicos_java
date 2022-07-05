package com.example.user.controller;

import com.example.user.exception.CPFException;
import com.example.user.exception.UserIdException;
import com.example.user.exception.UserNameException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserController {

    @GetMapping("/user-id/{id}")
    public String findUserById(@PathVariable int id) {

        String msg = "You have entered valid ID";

        if(!isId(id)){
          throw new UserIdException();
        }

        return msg;
    }

    @GetMapping("/user-name/{userName}")
    public String findUserByName(@PathVariable String userName) {

        String msg = "You have entered valid USERNAME";

        if(!isUserName(userName)){
            throw new UserNameException();
        }

        return msg;
    }

    @GetMapping("/user-cpf/{cpf}")
    public ResponseEntity<String> findUserByCPF(@PathVariable String cpf) {

        String msg = "You have entered valid CPF";

        boolean isCPFValid = isCPF(cpf);
        if(!isCPFValid){
            throw new CPFException();
        }

        return ResponseEntity.ok().body(msg);

    }

    public boolean isCPF(String CPF) {
        return CPF.length() > 3 && CPF.length() <= 11;
    }

    public boolean isUserName(String userName){
        return userName.length() > 3 && userName.length() <= 15;
    }

    public boolean isId(int id){
            return id > 0 && id < 100;
    }

}
