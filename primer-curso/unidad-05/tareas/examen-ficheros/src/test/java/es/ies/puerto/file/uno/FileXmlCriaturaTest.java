package es.ies.puerto.file.uno;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static utilidades.UtilClassTest.MESSAGE_ERROR;

public class FileXmlCriaturaTest {
    Criatura criatura;
    FileXmlCriatura persistencia;
    List<Criatura> criaturas;

    @BeforeEach
    public void beforeEach() {
        persistencia = new FileXmlCriatura();
        criaturas = persistencia.obtenerCriaturas();
        criatura = new Criatura();
        /**
         criatura. setId("001");
         criatura.setNombre("Dragón");
         criatura.setDescripcion("Una criatura legendaria con alas y aliento de fuego.");
         criatura.setCategoria("Fantasía");
         **/
    }

    @Test
    public void obtenerCriaturasTest() {
        Assertions.assertFalse(criaturas.isEmpty(),
                MESSAGE_ERROR);
        Assertions.assertEquals(5,criaturas.size(),
                MESSAGE_ERROR);
    }

    @Test
    public void obtenerCriaturaTest() {
        String idBuscar = "DG001";
        Criatura critaturaBuscar = new Criatura(idBuscar);
        critaturaBuscar = persistencia.obtener(critaturaBuscar);
        Assertions.assertEquals(critaturaBuscar.getId(),idBuscar,
                MESSAGE_ERROR);
        Assertions.assertNotNull(critaturaBuscar.getNombre(),
                MESSAGE_ERROR);
        Assertions.assertTrue (critaturaBuscar.getCategoria().equals("Dragones"),
                MESSAGE_ERROR);
        Assertions.assertNotNull(critaturaBuscar.getDescripcion().equals("Un imponente dragón que escupe fuego."),
                MESSAGE_ERROR);
    }

    @Test
    public void addDeleteCriaturaTest() {

        int numCriaturasInicial = criaturas.size();
        Criatura criaturaInsertar = new Criatura("TES023", "test", "testing", "junit");

        persistencia.addCriatura(criaturaInsertar);
        criaturas = persistencia.obtenerCriaturas();
        int numCriaturasInsertar = criaturas.size();
        Assertions.assertTrue(criaturas.contains(criaturaInsertar),
                MESSAGE_ERROR);
        Assertions.assertEquals(numCriaturasInicial +1 ,
                numCriaturasInsertar, MESSAGE_ERROR);
        persistencia.deleteCriatura(criaturaInsertar);
        criaturas = persistencia.obtenerCriaturas();
        int numCritaturasBorrado = criaturas.size();
        Assertions.assertEquals(numCriaturasInicial ,
                numCritaturasBorrado,
                MESSAGE_ERROR);
    }

    @Test
    public void actualizarCriatura() {
        String idActualizar = "DG001";
        Criatura CriaturaBuscar = new Criatura(idActualizar);
        Criatura CriaturaActualizar = persistencia.obtener(CriaturaBuscar);
        CriaturaActualizar.setNombre("nombreActualizar");
        CriaturaActualizar.setDescripcion("edadActualizar");
        CriaturaActualizar.setCategoria("emailActualizar");
        persistencia.updateCriatura(CriaturaActualizar);

        CriaturaBuscar = persistencia.obtener(CriaturaBuscar);
        Assertions.assertEquals(CriaturaBuscar.toString(), CriaturaActualizar.toString(),
                MESSAGE_ERROR);
        persistencia.loadBackUp();

    }



}
