package es.ies.puerto.business;

import es.ies.puerto.business.dto.AliasDTO;
import es.ies.puerto.business.dto.EquipamientoDTO;
import es.ies.puerto.business.dto.PersonajeDTO;
import es.ies.puerto.business.dto.PoderDTO;
import es.ies.puerto.exception.MarvelException;
import es.ies.puerto.mappers.struct.IMapperAlias;
import es.ies.puerto.mappers.struct.IMapperEquipamiento;
import es.ies.puerto.mappers.struct.IMapperPersonaje;
import es.ies.puerto.mappers.struct.IMapperPoder;
import es.ies.puerto.modelo.db.dao.DaoAlias;
import es.ies.puerto.modelo.db.dao.DaoEquipamiento;
import es.ies.puerto.modelo.db.dao.DaoPersonaje;
import es.ies.puerto.modelo.db.dao.DaoPoder;
import es.ies.puerto.modelo.db.entidades.Alias;
import es.ies.puerto.modelo.db.entidades.Equipamiento;
import es.ies.puerto.modelo.db.entidades.Personaje;
import es.ies.puerto.modelo.db.entidades.Poder;
import org.springframework.stereotype.Repository;

import java.util.HashSet;
import java.util.Set;

@Repository
public class MarvelBusiness {

        DaoPoder daoPoder;

        DaoAlias daoAlias;

        DaoEquipamiento daoEquipamiento;

        DaoPersonaje daoPersonaje;

        public MarvelBusiness() throws MarvelException {
            daoPoder = new DaoPoder();
            daoEquipamiento = new DaoEquipamiento();
            daoPersonaje = new DaoPersonaje();
            daoAlias = new DaoAlias();
        }

        public boolean addPersonaje(PersonajeDTO personajeDTO) throws MarvelException {
            return daoPersonaje.updatePersonaje(IMapperPersonaje.INSTANCE.personajeDTOToPersonaje(personajeDTO));
        }

        public boolean addPoder(PoderDTO poderDTO,PersonajeDTO personajeDTO) throws MarvelException {
            return daoPoder.updatePoder(IMapperPoder.INSTANCE.poderDTOTOpoder(poderDTO, personajeDTO));
        }

        public boolean addAlias(AliasDTO aliasDTO, PersonajeDTO personajeDTO) throws MarvelException {
            return daoAlias.updateAlias(IMapperAlias.INSTANCE.aliasDTOTOAlias(aliasDTO, personajeDTO));
        }

        public boolean addEquipamiento(EquipamientoDTO equipamientoDTO, PersonajeDTO personajeDTO) throws MarvelException {
            return daoEquipamiento.updateEquipamiento(
                    IMapperEquipamiento.INSTANCE.equipamientoDTOTOEquipamiento(equipamientoDTO, personajeDTO));
        }

        public PersonajeDTO obtainPersonajeById(String id) throws MarvelException {
            return IMapperPersonaje.INSTANCE.personajeToPersonajeDTO(daoPersonaje.findPersonaje(id));
        }

        public Set<PersonajeDTO> obtainPersonajes() throws MarvelException {
            Set<PersonajeDTO> personajeDTOs = null;
            Set<Personaje> personajeSet = daoPersonaje.findAllPersonaje();

            if (personajeSet != null) {
                personajeDTOs = new HashSet<>();
                for (Personaje personaje : personajeSet) {
                    personajeDTOs.add(IMapperPersonaje.INSTANCE.personajeToPersonajeDTO(personaje));
                }
            }
            return personajeDTOs;
        }

        public PoderDTO obtainPoderById(String id) throws MarvelException {
            return IMapperPoder.INSTANCE.poderTOpoderDTO(daoPoder.findPoder(new Poder(id)));
        }

        public Set<PoderDTO> obtainPoderes() throws MarvelException {
            Set<PoderDTO> poderDTOs = null;
            Set<Poder> poderSet = daoPoder.findAllPoder();

            if (poderSet != null) {
                poderDTOs = new HashSet<>();
                for (Poder poder : poderSet) {
                    poderDTOs.add(IMapperPoder.INSTANCE.poderTOpoderDTO(poder));
                }
            }
            return poderDTOs;
        }

        public AliasDTO obtainAliasById(String id) throws MarvelException {
            return IMapperAlias.INSTANCE.aliasTOAliasDTO(daoAlias.findAlias(new Alias(id)));
        }

        public Set<AliasDTO> obtainAlias() throws MarvelException {
            Set<AliasDTO> aliasDTOs = null;
            Set<Alias> aliasSet = daoAlias.findAllAlias();

            if (aliasSet != null) {
                aliasDTOs = new HashSet<>();
                for (Alias alias : aliasSet) {
                    aliasDTOs.add(IMapperAlias.INSTANCE.aliasTOAliasDTO(alias));
                }
            }
            return aliasDTOs;
        }

        public EquipamientoDTO obtainEquipamientoById(String id) throws MarvelException {
            return IMapperEquipamiento.INSTANCE.equipamientoTOEquipamientoDTO(
                    daoEquipamiento.findEquipamiento(new Equipamiento(id)));
        }

        public Set<EquipamientoDTO> obtainEquipamientos() throws MarvelException {
            Set<EquipamientoDTO> equipamientosDTOs = null;
            Set<Equipamiento> equipamientoSet = daoEquipamiento.findAllEquipamiento();

            if (equipamientoSet != null) {
                equipamientosDTOs = new HashSet<>();
                for (Equipamiento equipamiento : equipamientoSet) {
                    equipamientosDTOs.add(IMapperEquipamiento.INSTANCE.equipamientoTOEquipamientoDTO(equipamiento));
                }
            }
            return equipamientosDTOs;
        }

        public boolean deletePersonaje(PersonajeDTO personajeDTO) throws MarvelException {
            return daoPersonaje.deletePersonaje(IMapperPersonaje.INSTANCE.personajeDTOToPersonaje(personajeDTO));
        }

        public boolean deletePoder(PoderDTO poderDTO, PersonajeDTO personajeDTO) throws MarvelException {
            return daoPoder.deletePoder(IMapperPoder.INSTANCE.poderDTOTOpoder(poderDTO, personajeDTO));
        }

        public boolean deleteAlias(AliasDTO aliasDTO, PersonajeDTO personajeDTO) throws MarvelException {
            return daoAlias.deleteAlias(IMapperAlias.INSTANCE.aliasDTOTOAlias(aliasDTO, personajeDTO));
        }

        public boolean deleteEquipamiento(EquipamientoDTO equipamientoDTO, PersonajeDTO personajeDTO)
                throws MarvelException {

            return daoEquipamiento.deleteEquipamiento(
                    IMapperEquipamiento.INSTANCE.equipamientoDTOTOEquipamiento(equipamientoDTO, personajeDTO));
        }
}

