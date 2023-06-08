package com.hivda.hastanerandevu.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(Exception.class)
    @ResponseBody
    public ResponseEntity<ErrorMessage> hatalariYakalayanBenim(Exception ex){
        return new ResponseEntity<>(createErrorMessage(ex,ErrorType.INTERNAL_SERVER_ERROR), HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler(HastaneRandevuException.class)
    @ResponseBody
    public ResponseEntity<ErrorMessage> Java8StartExceptionHandler(HastaneRandevuException ex){
        return new ResponseEntity<>(createErrorMessage(ex,ex.getErrorType()),ex.getErrorType().getHttpStatus());

    }

    /**
     * Tüm hatalar belli bir metot üzerinde geçtiği için ek kodlamalar yapmadan tek bir yerden oluşan
     * hataların loglanması ve veritabanına kayıt edilmesini kolaylaştırır.
     * @param ex
     * @param errorType
     * @return
     */
    private ErrorMessage createErrorMessage(Exception ex, ErrorType errorType){
        System.out.println("Hata oluştu...:" +
                System.currentTimeMillis()+ " - " + ex.toString());
        return ErrorMessage.builder()
                .message(errorType.getMessage())
                .code(errorType.getCode())
                .build();
    }



}
