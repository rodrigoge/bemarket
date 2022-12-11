package br.com.bemarket.api;

import br.com.bemarket.exceptions.ErrorInfo;
import br.com.bemarket.exceptions.FlowException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.LocalDateTime;
import java.time.ZoneId;

@ControllerAdvice
public class GlobalControllerAdvice {

    @Autowired
    private ObjectMapper objectMapper;

    @ExceptionHandler(FlowException.class)
    public ResponseEntity<ErrorInfo> handleFlowException(FlowException exception) {
        return ResponseEntity
                .status(exception.getHttpStatus())
                .body(
                        ErrorInfo.builder()
                                .status(exception.getHttpStatus().value())
                                .error(exception.getError())
                                .message(exception.getMessage())
                                .timestamp(LocalDateTime.now(ZoneId.of("UTC")).toString())
                                .build()
                );
    }
}
