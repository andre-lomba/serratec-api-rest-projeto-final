package org.serratec.sales_manager_grupo5.dto.produtoDTO;

import java.util.HashSet;
import java.util.Set;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class ProdutoRequestDTO {

    @NotBlank(message = "Nome deve ser preenchido.")
    @Size(min = 3, max = 100, message = "Nome deve ter entre {min} e {max} caracteres.")
    private String nome;
    @NotNull(message = "Informe um preço para o produto.")
    private Double preco;
    private Set<Long> id_categorias = new HashSet<>();

    public ProdutoRequestDTO() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Set<Long> getId_categorias() {
        return id_categorias;
    }

    public void setId_categorias(Set<Long> id_categorias) {
        this.id_categorias = id_categorias;
    }

}