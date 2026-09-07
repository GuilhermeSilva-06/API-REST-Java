package br.com.gui.spring_boot.service;

import br.com.gui.spring_boot.database.modal.ProdutoEntity;
import br.com.gui.spring_boot.dto.ProdutoDto;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Service
public class ProdutosService {

    private static final List<ProdutoEntity> PRODUTOS = new ArrayList<>();

    static {
      PRODUTOS.add(ProdutoEntity.builder()
                .id(1)
                .nome("Notebook")
                .preco(new BigDecimal(5000))
                .quantidade(10)
                .build());

        PRODUTOS.add(ProdutoEntity.builder()
                        .id(2)
                        .nome("Iphone")
                        .preco(new BigDecimal(7000))
                        .quantidade(10)
                        .build());

        PRODUTOS.add(ProdutoEntity.builder()
                        .id(3)
                        .nome("Mouse")
                        .preco(new BigDecimal(500))
                        .quantidade(10)
                        .build());
    }

    public static List<ProdutoEntity> findAll() {
       return new ArrayList<>(PRODUTOS);
    }

    public ProdutoEntity createProduct(ProdutoDto produtoDto){

        Integer identificador = PRODUTOS.stream()
                .mapToInt(ProdutoEntity::getId)
                .max()
                .orElse(0)+ 1;

        ProdutoEntity novoProduto = ProdutoEntity.builder()
                .id(identificador)
                .nome(produtoDto.getNome())
                .preco(produtoDto.getPreco())
                .quantidade(produtoDto.getQuantidade())
                .build();

        PRODUTOS.add(novoProduto);

        return novoProduto;
    }
}
