package com.example.product.model; import org.springframework.stereotype.Repository; import java.util.ArrayList; import java.util.List; 
import java.util.stream.Collectors; @Repository public class ProductRepository {
    private List<Product> list = new ArrayList<>(); public List<Product> getAllProducts() { return list;
    }
    public Product getProductById(Integer id) { return list.stream().filter(song -> 
        song.getId().equals(id)).collect(Collectors.toList()).get(0);
    }
    public void addProduct(Product s) { list.add(s);
    }
    public void updateProduct(Product productSave) { list.forEach(product -> { if(product.getId().equals(productSave.getId())){ 
                product.setId(productSave.getId()); product.setName(productSave.getName()); 
                product.setDescription(productSave.getDescription()); product.setPrice(productSave.getPrice()); 
                product.setCreatedOne(productSave.getCreatedOne()); product.setStatus(productSave.getStatus());
            }
        });
    }
    public void removeProduct(Product s) { list.remove(s);
    }
    public void addList(List<Product> listOfProducts) { listOfProducts.addAll(getAllProducts());
    }
}
