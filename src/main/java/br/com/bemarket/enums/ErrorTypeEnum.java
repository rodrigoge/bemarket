package br.com.bemarket.enums;

import lombok.Getter;

@Getter
public enum ErrorTypeEnum {

    DATABASE("DATABASE"),
    INVALID_REQUEST("INVALID_REQUEST"),
    CONFIGURATION("CONFIGURATION");

    private final String value;

    ErrorTypeEnum(String value) {
        this.value = value;
    }
}
