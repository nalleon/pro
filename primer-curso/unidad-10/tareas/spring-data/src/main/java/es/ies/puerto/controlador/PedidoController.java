package es.ies.puerto.controlador;

import es.ies.puerto.controlador.interfaces.IController;
import es.ies.puerto.dto.PedidoDTO;
import es.ies.puerto.modelo.entity.ClienteEntity;
import es.ies.puerto.modelo.entity.PedidoEntity;
import es.ies.puerto.services.spring.data.impl.ClienteService;
import es.ies.puerto.services.spring.data.impl.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/v1/pedido")
public class PedidoController implements IController<PedidoEntity> {

    private PedidoService pedidoService;

    @Autowired
    public void setPedidoService(PedidoService pedidoService) {
        this.pedidoService = pedidoService;
    }


    @GetMapping("/")
    @Override
    public List<PedidoEntity> getAllObjects() {
        return pedidoService.getAllObjects();
    }

    @PostMapping("/")
    @Override
    public ResponseEntity<PedidoEntity> saveObject(@RequestBody PedidoEntity pedidoEntity) {
        PedidoEntity savedObject = pedidoService.saveObject(pedidoEntity);
        return new ResponseEntity<>(savedObject, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    @Override
    public ResponseEntity<PedidoEntity> updateObject(@PathVariable int id, @RequestBody PedidoEntity pedidoEntity) {
        pedidoEntity.setId(id);
        PedidoEntity updatedObject = pedidoService.updateObject(pedidoEntity);
        return new ResponseEntity<>(updatedObject, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    @Override
    public ResponseEntity<Void> deleteObject(@PathVariable int id) {
        pedidoService.deleteObject(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
