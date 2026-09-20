package br.com.gui.spring_boot.handler;

import br.com.gui.spring_boot.exception.ErrorResponse;
import br.com.gui.spring_boot.exception.NotFoundExcepiton;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalException {

    @ExceptionHandler(NotFoundExcepiton.class)
    public ResponseEntity<ErrorResponse> handleNotFoundException(NotFoundExcepiton ex){
        ErrorResponse response = ErrorResponse.builder()
                .msg(ex.getMessage())
                .status(HttpStatus.NO_CONTENT.value())
                .build();

        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(response);
    }
}
