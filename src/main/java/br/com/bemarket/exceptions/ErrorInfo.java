package br.com.bemarket.exceptions;

import br.com.bemarket.enums.ErrorTypeEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class ErrorInfo {

    private Integer status;
    private ErrorTypeEnum error;
    private String message;
    private String timestamp;
}
