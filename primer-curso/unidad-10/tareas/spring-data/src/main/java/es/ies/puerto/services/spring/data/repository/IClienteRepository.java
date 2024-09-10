package es.ies.puerto.services.spring.data.repository;

import es.ies.puerto.dto.ClienteDTO;
import es.ies.puerto.modelo.entity.ClienteEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IClienteRepository extends JpaRepository<ClienteEntity, Integer> {

}
