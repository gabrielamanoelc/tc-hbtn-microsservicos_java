package com.example.product.model; import java.math.BigDecimal; import java.time.LocalDate; public class Product { private Long id; 
    private String name; private String description; private BigDecimal price; private LocalDate createdOne; private Boolean status; 
    public Product(Long id, String name, String description, BigDecimal price, LocalDate createdOne, Boolean status) {
        this.id = id; this.name = name; this.description = description; this.price = price; this.createdOne = createdOne; this.status = 
        status;
    }
    public Product() {
    }
    public Long getId() { return id;
    }
    public void setId(Long id) { this.id = id;
    }
    public String getName() { return name;
    }
    public void setName(String name) { this.name = name;
    }
    public String getDescription() { return description;
    }
    public void setDescription(String description) { this.description = description;
    }
    public BigDecimal getPrice() { return price;
    }
    public void setPrice(BigDecimal price) { this.price = price;
    }
    public LocalDate getCreatedOne() { return createdOne;
    }
    public void setCreatedOne(LocalDate createdOne) { this.createdOne = createdOne;
    }
    public Boolean getStatus() { return status;
    }
    public void setStatus(Boolean status) { this.status = status;
    }
}
