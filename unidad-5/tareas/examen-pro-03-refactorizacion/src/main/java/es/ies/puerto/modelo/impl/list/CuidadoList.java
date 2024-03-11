package es.ies.puerto.modelo.impl.list;

import es.ies.puerto.modelo.impl.Aparato;
import es.ies.puerto.modelo.impl.CuidadoPersonal;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import java.util.List;

@Root(name = "root")
public class CuidadoList {
    @ElementList(inline = true, entry = "row")
    private List<CuidadoPersonal> cuidadoPersonalList;

    public CuidadoList(List<CuidadoPersonal> cuidadoPersonalList) {
        this.cuidadoPersonalList = cuidadoPersonalList;
    }

    public List<CuidadoPersonal> getCuidadoPersonalList() {
        return cuidadoPersonalList;
    }

    public void setCuidadoPersonalList(List<CuidadoPersonal> cuidadoPersonalList) {
        this.cuidadoPersonalList = cuidadoPersonalList;
    }
}
