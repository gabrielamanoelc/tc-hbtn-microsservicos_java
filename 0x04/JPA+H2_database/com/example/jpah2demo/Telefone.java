package com.example.jpah2demo; import com.fasterxml.jackson.annotation.JsonIgnore; import javax.persistence.*; @Entity public class 
Telefone {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) private Long id; private String telefone; @ManyToOne @JsonIgnore private 
    Cliente cliente; public Telefone(Long id, String telefone, Cliente cliente) {
        this.id = id; this.telefone = telefone; this.cliente = cliente;
    }
    public Telefone() {
    }
    public Long getId() { return id;
    }
    public void setId(Long id) { this.id = id;
    }
    public String getTelefone() { return telefone;
    }
    public void setTelefone(String telefone) { this.telefone = telefone;
    }
    public Cliente getCliente() { return cliente;
    }
    public void setCliente(Cliente cliente) { this.cliente = cliente;
    }
}
