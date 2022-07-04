package com.example.user.exception; import org.springframework.http.HttpStatus; import org.springframework.http.ResponseEntity; import 
org.springframework.web.bind.annotation.ControllerAdvice; import org.springframework.web.bind.annotation.ExceptionHandler; 
@ControllerAdvice public class ExceptionService {
    @ExceptionHandler ResponseEntity<CPFException> handleException(CPFException err){ UserErrorResponse user =new UserErrorResponse(); 
        user.setStatus(HttpStatus.BAD_REQUEST.value()); user.setMessage("You have entered invalid CPF."); return new 
        ResponseEntity(user,HttpStatus.BAD_REQUEST);
    }
    @ExceptionHandler ResponseEntity<UserNameException> handleException(UserNameException err){ UserErrorResponse user =new 
        UserErrorResponse(); user.setStatus(HttpStatus.BAD_REQUEST.value()); user.setMessage("You have entered invalid USERNAME."); 
        return new ResponseEntity(user,HttpStatus.BAD_REQUEST);
    }
    @ExceptionHandler ResponseEntity<UserIdException> handleException(UserIdException err){ UserErrorResponse user =new 
        UserErrorResponse(); user.setStatus(HttpStatus.BAD_REQUEST.value()); user.setMessage("you have entered invalid ID."); return new 
        ResponseEntity(user,HttpStatus.BAD_REQUEST);
    }
}
