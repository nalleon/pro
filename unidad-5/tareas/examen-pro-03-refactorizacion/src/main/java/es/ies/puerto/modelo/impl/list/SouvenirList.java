package es.ies.puerto.modelo.impl.list;

import es.ies.puerto.modelo.abstracts.ProductoAbstracts;
import es.ies.puerto.modelo.impl.Souvenir;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import java.util.List;

@Root(name = "root")

public class SouvenirList {
    @ElementList(inline = true, entry = "row")
    private List<Souvenir> souvenirList;

    public SouvenirList(List<Souvenir> souvenirList) {
        this.souvenirList = souvenirList;
    }

    public List<Souvenir> getSouvenirList() {
        return souvenirList;
    }

    public void setSouvenirList(List<Souvenir> souvenirList) {
        this.souvenirList = souvenirList;
    }
}
