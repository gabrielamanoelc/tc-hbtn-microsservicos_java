package com.example.product.controller; import com.example.product.model.Product; import com.example.product.model.ProductRepository; 
import io.swagger.annotations.ApiOperation; import io.swagger.annotations.ApiResponse; import io.swagger.annotations.ApiResponses; 
import org.springframework.beans.factory.annotation.Autowired; import org.springframework.http.ResponseEntity; import 
org.springframework.web.bind.annotation.*; import java.util.List; @RestController @RequestMapping("/products") public class 
ProductController {
    @Autowired private ProductRepository productRepository; @GetMapping("/welcome") @ApiOperation(value = "Responsável por retornar uma 
    mensagem de boas vindas.") public ResponseEntity<String> mensagemBoasVindas(){
        return ResponseEntity.ok().body("BEM VINDO À PRODUCT REST API.");
    }
    @PostMapping("/addProduct") @ApiResponses(value = { @ApiResponse(code = 10, message = "Required fields not informed.")
    })
    @ApiOperation(value = "Responsável por adicionar um produto.") public ResponseEntity<?> addProduct(@RequestBody Product product){ 
        productRepository.addProduct(product); return ResponseEntity.noContent().build();
    }
    @GetMapping("/allProducts") @ApiResponses(value = { @ApiResponse(code = 11, message = "Warning - the process returned more than 1000 
            products.")
    })
    @ApiOperation(value = "Responsável por retornar uma lista de produtos.") public ResponseEntity<List<Product>> getAllProducts(){ 
        return ResponseEntity.ok().body(productRepository.getAllProducts());
    }
    @GetMapping("/findProductById/{id}") @ApiResponses(value = { @ApiResponse(code = 12, message = "The field id not informed. This 
            information is required.")
    })
    @ApiOperation(value = "Responsável por retornar um produto pelo id.") public ResponseEntity<Product> 
    findProdutoById(@PathVariable(name = "id") Long id){
        return ResponseEntity.ok().body(productRepository.getProductById(Math.toIntExact(id)));
    }
    @DeleteMapping("/removeProduct") @ApiResponses(value = { @ApiResponse(code = 13, message = "User not allowed to remove a product 
            from this category.")
    })
    @ApiOperation(value = "Responsável por remover um produto.") public ResponseEntity<?> deleteProductById(@RequestBody Product 
    product){
        productRepository.removeProduct(product); return ResponseEntity.noContent().build();
    }
    @PutMapping("/updateProduct") @ApiResponses(value = { @ApiResponse(code = 14, message = "No information has been updated. The new 
            information is the same as recorded in the database.")
    })
    @ApiOperation(value = "Responsável por atualizar um produto.") public ResponseEntity<?> updateProduct(@RequestBody Product product){ 
        productRepository.updateProduct(product); return ResponseEntity.noContent().build();
    }
}
