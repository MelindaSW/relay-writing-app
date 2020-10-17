package se.melindasw.relaywriter.users;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import se.melindasw.relaywriter.exceptions.UserNotFoundException;

@ControllerAdvice
public class UsersControllerAdvice {
  @ResponseBody
  @ExceptionHandler(UserNotFoundException.class)
  @ResponseStatus(HttpStatus.NOT_FOUND)
  public String habitNotFoundHandler(UserNotFoundException e) {
    return e.getMessage();
  }
}