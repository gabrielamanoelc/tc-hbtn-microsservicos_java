package com.example.jpah2demo; import com.fasterxml.jackson.annotation.JsonIgnore; import javax.persistence.*; @Entity public class 
Endereco {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) private Long id; private String descricao; @ManyToOne @JsonIgnore private 
    Cliente cliente; public Endereco(Long id, String descricao, Cliente cliente) {
        this.id = id; this.descricao = descricao; this.cliente = cliente;
    }
    public Endereco() {
    }
    public Long getId() { return id;
    }
    public void setId(Long id) { this.id = id;
    }
    public String getDescricao() { return descricao;
    }
    public void setDescricao(String descricao) { this.descricao = descricao;
    }
    public Cliente getCliente() { return cliente;
    }
    public void setCliente(Cliente cliente) { this.cliente = cliente;
    }
}
