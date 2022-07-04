package com.example.jpah2demo; import org.springframework.beans.factory.annotation.Autowired; import 
org.springframework.http.HttpStatus; import org.springframework.http.ResponseEntity; import org.springframework.web.bind.annotation.*; 
import java.util.List; import java.util.Optional; @RestController public class ClienteController {
    @Autowired private ClienteRepository clienteRepository; @PostMapping("/addClient") public ResponseEntity<Cliente> 
    addClient(@RequestBody Cliente cliente) {
        return ResponseEntity.status(HttpStatus.CREATED).body(clienteRepository.save(cliente));
    }
    @GetMapping("/findAllClients") public ResponseEntity<List<Cliente>> findAllClients() { return 
        ResponseEntity.status(HttpStatus.OK).body(clienteRepository.findAll());
    }
    @GetMapping("/findClientById/{id}") public ResponseEntity<Optional<Cliente>> findClientById(@PathVariable("id") Long idClient) { 
        return ResponseEntity.ok().body(clienteRepository.findById(idClient));
    }
    @DeleteMapping("/removeClientById/{id}") @ResponseStatus(HttpStatus.NO_CONTENT) public void removerCliente(@PathVariable("id") Long 
    idClient){
        clienteRepository.deleteById(idClient);
    }
    @PutMapping("/updateClientById/{id}") @ResponseStatus(HttpStatus.NO_CONTENT) public void updateCliente(@PathVariable("id") Long id, 
    @RequestBody Cliente cliente){
        cliente.setId(id); clienteRepository.save(cliente);
    }
}
