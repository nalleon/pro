package es.ies.puerto.modelo.impl.list;

import es.ies.puerto.modelo.abstracts.ProductoAbstracts;
import es.ies.puerto.modelo.impl.Aparato;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import java.util.List;

@Root(name = "root")
public class AparatoList {
    @ElementList(inline = true, entry = "row")
    private List<Aparato> aparatoList;

    public AparatoList(List<Aparato> aparatoList) {
        this.aparatoList = aparatoList;
    }

    public List<Aparato> getAparatoList() {
        return aparatoList;
    }

    public void setAparatoList(List<Aparato> aparatoList) {
        this.aparatoList = aparatoList;
    }
}
