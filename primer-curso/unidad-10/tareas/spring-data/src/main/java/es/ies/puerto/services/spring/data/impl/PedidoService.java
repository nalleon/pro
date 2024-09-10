package es.ies.puerto.services.spring.data.impl;
import es.ies.puerto.modelo.entity.PedidoEntity;
import es.ies.puerto.services.spring.data.interfaces.ICrudServices;
import es.ies.puerto.services.spring.data.repository.IPedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1/pedido/")
@Service
public class PedidoService implements ICrudServices<PedidoEntity> {

    private IPedidoRepository pedidoRepository;

    @Autowired
    public void setPedidoRepository(IPedidoRepository pedidoRepository) {
        this.pedidoRepository = pedidoRepository;
    }

    @Override
    public List<PedidoEntity> getAllObjects() {
        return pedidoRepository.findAll();
    }

    @Override
    public PedidoEntity saveObject(PedidoEntity object) {
        return pedidoRepository.save(object);
    }

    @Override
    public PedidoEntity updateObject(PedidoEntity object) {
        if (pedidoRepository.existsById(object.getId())) {
            return pedidoRepository.save(object);
        } else {
            throw new RuntimeException("Pedido con id " + object.getId() + " no encontrado");
        }
    }

    @Override
    public void deleteObject(int id) {
        if (pedidoRepository.existsById(id)) {
            pedidoRepository.deleteById(id);
        } else {
            throw new RuntimeException("Pedido con id " + id + " no existe");
        }
    }
}
