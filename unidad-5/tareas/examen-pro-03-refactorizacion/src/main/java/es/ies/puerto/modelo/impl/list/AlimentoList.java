package es.ies.puerto.modelo.impl.list;

import es.ies.puerto.modelo.abstracts.ProductoAbstracts;
import es.ies.puerto.modelo.impl.Alimento;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import java.util.ArrayList;
import java.util.List;
@Root(name = "root")
public class AlimentoList {
    @ElementList(inline = true, entry = "row")
    private List<Alimento> alimentoList;

    public AlimentoList() {
        alimentoList = new ArrayList<>();
    }

    public AlimentoList(List<Alimento> alimentoList) {
        this.alimentoList = alimentoList;
    }

    public List<Alimento> alimentoList() {
        return alimentoList;
    }

    public void setAlimentoList(List<Alimento> alimentoList) {
        this.alimentoList = alimentoList;
    }
}