package br.com.gui.spring_boot.exception;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ErrorResponse {

    private String msg;
    private Integer status;
}
