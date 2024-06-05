package es.ies.puerto.services.spring.data.impl;

import es.ies.puerto.dto.ClienteDTO;
import es.ies.puerto.modelo.entity.ClienteEntity;
import es.ies.puerto.services.spring.data.interfaces.ICrudServices;
import es.ies.puerto.services.spring.data.repository.IClienteRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/v1/cliente/")
@Service
public class ClienteService implements ICrudServices<ClienteEntity> {
    Logger logger = LoggerFactory.getLogger(ClienteService.class);

    private IClienteRepository clienteRepository;
    @Autowired
    public void setClienteRepository(IClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    @Override
    public List<ClienteEntity> getAllObjects() {
        return clienteRepository.findAll();
    }

    @Override
    public ClienteEntity saveObject(ClienteEntity object) {
        return clienteRepository.save(object);
    }

    @Override
    public ClienteEntity updateObject(ClienteEntity object) {
        if (clienteRepository.existsById(object.getId())) {
            return clienteRepository.save(object);
        } else {
            throw new RuntimeException("Cliente con id " + object.getId() + " no encontrado");
        }
    }

    @Override
    public void deleteObject(int id) {
        if (clienteRepository.existsById(id)) {
            clienteRepository.deleteById(id);
        } else {
            throw new RuntimeException("Cliente con id " + id + " no existe");
        }
    }
}
