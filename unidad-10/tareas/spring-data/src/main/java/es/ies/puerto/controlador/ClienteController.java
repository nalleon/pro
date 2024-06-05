package es.ies.puerto.controlador;

import es.ies.puerto.controlador.interfaces.IController;
import es.ies.puerto.dto.ClienteDTO;
import es.ies.puerto.modelo.entity.ClienteEntity;
import es.ies.puerto.services.spring.data.impl.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/cliente")
public class ClienteController implements IController<ClienteEntity> {

    private ClienteService clienteService;

    @Autowired
    public void setClienteService(ClienteService clienteService) {
        this.clienteService = clienteService;
    }


    @GetMapping("/")
    @Override
    public List<ClienteEntity> getAllObjects() {
        return clienteService.getAllObjects();
    }

    @PostMapping("/")
    @Override
    public ResponseEntity<ClienteEntity> saveObject(@RequestBody ClienteEntity clienteEntity) {
        ClienteEntity savedObject = clienteService.saveObject(clienteEntity);
        return new ResponseEntity<>(savedObject, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    @Override
    public ResponseEntity<ClienteEntity> updateObject(@PathVariable int id, @RequestBody ClienteEntity clienteEntity) {
        clienteEntity.setId(id);
        ClienteEntity updatedObject = clienteService.updateObject(clienteEntity);
        return new ResponseEntity<>(updatedObject, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    @Override
    public ResponseEntity<Void> deleteObject(@PathVariable int id) {
        clienteService.deleteObject(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
