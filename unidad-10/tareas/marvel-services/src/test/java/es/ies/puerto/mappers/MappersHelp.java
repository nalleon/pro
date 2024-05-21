package es.ies.puerto.mappers;

import es.ies.puerto.dto.AliasDTO;
import es.ies.puerto.dto.EquipamientoDTO;
import es.ies.puerto.dto.PersonajeDTO;
import es.ies.puerto.dto.PoderDTO;
import es.ies.puerto.modelo.db.entidades.Alias;
import es.ies.puerto.modelo.db.entidades.Equipamiento;
import es.ies.puerto.modelo.db.entidades.Personaje;
import es.ies.puerto.modelo.db.entidades.Poder;
import es.ies.puerto.utilities.TestUtilities;
import org.junit.jupiter.api.BeforeEach;

import java.util.Arrays;
import java.util.HashSet;

public class MappersHelp extends TestUtilities {
    public static final String NOMBRE_TEST = "nombreTest";
    public static final String PODER_ID = "P1";
    public static final String ALIAS_ID = "A1";
    public static final String DESCRIPCION = "descripcionTest";
    public static final String PERSONAJE_ID = "Per1";
    public static final String EQUIPAMIENTO_ID = "E1";
    public static final String GENERO = "generoTest";
    public Poder poderEntity;
    public PoderDTO poderDTO;

    public Alias aliasEntity;
    public AliasDTO aliasDTO;

    public Equipamiento equipamientoEntity;
    public EquipamientoDTO equipamientoDTO;

    public Personaje personajeEntity;
    public PersonajeDTO personajeDTO;

    @BeforeEach
    public void beforeEach(){
        poderDTO = new PoderDTO();
        poderDTO.setId(PODER_ID);
        poderDTO.setNombre(NOMBRE_TEST);

        poderEntity = new Poder();
        poderEntity.setId(PODER_ID);
        poderEntity.setNombre(NOMBRE_TEST);

        aliasDTO = new AliasDTO();
        aliasDTO.setId(ALIAS_ID);
        aliasDTO.setDescripcion(DESCRIPCION);
        aliasDTO.setPersonaje_id(PERSONAJE_ID);

        aliasEntity = new Alias();
        aliasEntity.setId(ALIAS_ID);
        aliasEntity.setDescripcion(DESCRIPCION);
        aliasEntity.setPersonaje_id(PERSONAJE_ID);

        equipamientoDTO = new EquipamientoDTO();
        equipamientoDTO.setId(EQUIPAMIENTO_ID);
        equipamientoDTO.setPersonaje_id(PERSONAJE_ID);
        equipamientoDTO.setDescripcion(DESCRIPCION);
        equipamientoDTO.setNombre(NOMBRE_TEST);

        equipamientoEntity = new Equipamiento();
        equipamientoEntity.setId(EQUIPAMIENTO_ID);
        equipamientoEntity.setPersonaje_id(PERSONAJE_ID);
        equipamientoEntity.setDescripcion(DESCRIPCION);
        equipamientoEntity.setNombre(NOMBRE_TEST);

        personajeDTO = new PersonajeDTO();
        personajeDTO.setId(PERSONAJE_ID);
        personajeDTO.setAlias(aliasEntity);
        personajeDTO.setGenero(GENERO);
        personajeDTO.setNombre(NOMBRE_TEST);
        personajeDTO.setPoderes(new HashSet<>(Arrays.asList(poderEntity)));
        personajeDTO.setEquipamientos(new HashSet<>(Arrays.asList(equipamientoEntity)));

        personajeEntity = new Personaje();
        personajeEntity.setId(PERSONAJE_ID);
        personajeEntity.setAlias(aliasEntity);
        personajeEntity.setGenero(GENERO);
        personajeEntity.setNombre(NOMBRE_TEST);
        personajeEntity.setPoderes(new HashSet<>(Arrays.asList(poderEntity)));
        personajeEntity.setEquipamientos(new HashSet<>(Arrays.asList(equipamientoEntity)));
    }
}
