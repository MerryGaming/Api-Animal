package org.aibles.animal.controller.handle;

import java.time.Instant;
import lombok.extern.slf4j.Slf4j;
import org.aibles.animal.exception.ExceptionRequest;
import org.aibles.animal.exception.response.ExceptionResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
@Slf4j
public class AnimalHandle {
  @ExceptionHandler(ExceptionRequest.class)
  public ResponseEntity<ExceptionResponse> handle(ExceptionRequest ex) {
    log.error("(Exception) error: {}", ex);
    ExceptionResponse exceptionResponse = new ExceptionResponse();
    exceptionResponse.setError("Error exception");
    exceptionResponse.setMessage(ex.getMessage());
    exceptionResponse.setTimestamp(Instant.now());
    return ResponseEntity.status(HttpStatus.valueOf(ex.getStatus())).body(exceptionResponse);
  }

}
