package br.com.gui.spring_boot.dto;

import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class ProdutoDto {

    private String nome;
    private BigDecimal preco;
    private Integer quantidade;

}
