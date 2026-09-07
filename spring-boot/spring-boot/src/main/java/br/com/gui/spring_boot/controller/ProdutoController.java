package br.com.gui.spring_boot.controller;

import br.com.gui.spring_boot.database.modal.ProdutoEntity;
import br.com.gui.spring_boot.dto.ProdutoDto;
import br.com.gui.spring_boot.service.ProdutosService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value ="/v1/produtos" )
@RequiredArgsConstructor
public class ProdutoController {

    private final ProdutosService produtosService;



    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<ProdutoEntity> findAll(){
        return produtosService.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ProdutoEntity createProduct(@RequestBody ProdutoDto produtoDto){
        return produtosService.createProduct(produtoDto);
    }
}
