package br.com.bemarket.exceptions;

import br.com.bemarket.enums.ErrorTypeEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;

@Getter
@Log4j2
@AllArgsConstructor
@Builder
public class FlowException extends RuntimeException {

    private ErrorTypeEnum error;
    private HttpStatus httpStatus;
    private String message;
}
