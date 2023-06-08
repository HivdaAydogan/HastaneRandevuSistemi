package com.hivda.hastanerandevu.exceptions;

import lombok.Getter;

/**
 * Bu kısımda uygulamamız içinde oluşabilecek tüm hataları kapsayan bir kapsayıcıya ihtiyacımız var,
 * yani hata tiplerini listesini içeren bir Enum sınıfı oluşturabiliriz.
 * Ayrıca, uygulamamız restApi kurgusunda olduğu için bu hataların Response Entity oluşturmak doğru yaklaşımdır.
 */
@Getter
public class HastaneRandevuException extends RuntimeException{
    private final ErrorType errorType;
    public HastaneRandevuException(ErrorType errorType){
        super(errorType.getMessage());
        this.errorType = errorType;
    }

    public HastaneRandevuException(ErrorType errorType, String message){
        super(message);
        this.errorType = errorType;
    }

}
