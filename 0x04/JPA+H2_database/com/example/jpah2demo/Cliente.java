package com.example.jpah2demo; import javax.persistence.*; import java.util.List; import java.util.Set; @Entity public class Cliente { 
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) private Long id; private String nome; @OneToMany(cascade = CascadeType.ALL, 
    orphanRemoval = true) @JoinColumn(name="cliente_id") private List<Endereco> enderecos; @OneToMany(cascade = CascadeType.ALL, 
    orphanRemoval = true) @JoinColumn(name="cliente_id") private List<Telefone> telefones; public Cliente(Long id, String nome, 
    List<Endereco> enderecos, List<Telefone> telefones) {
        this.id = id; this.nome = nome; this.enderecos = enderecos; this.telefones = telefones;
    }
    public Cliente() {
    }
    public Long getId() { return id;
    }
    public void setId(Long id) { this.id = id;
    }
    public String getNome() { return nome;
    }
    public void setNome(String nome) { this.nome = nome;
    }
    public List<Endereco> getEnderecos() { return enderecos;
    }
    public void setEnderecos(List<Endereco> enderecos) { this.enderecos = enderecos;
    }
    public List<Telefone> getTelefones() { return telefones;
    }
    public void setTelefones(List<Telefone> telefones) { this.telefones = telefones;
    }
}
