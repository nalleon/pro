package es.ies.puerto.mapper;

import es.ies.puerto.intercambio.AliasInt;
import es.ies.puerto.modelo.db.entidades.Alias;

public class MapperAlias {

    public static Alias aliasIntToAliasEntity(AliasInt aliasInt){
        Alias alias = null;
        if (aliasInt == null){
            return null;
        }

        alias = new Alias();
        alias.setId(aliasInt.getId());
        alias.setDescripcion(aliasInt.getDescripcion());

        return alias;
    }

    public static AliasInt aliasEntityToAliasInt(Alias alias){
        AliasInt aliasInt = null;
        if (alias == null){
            return null;
        }

        aliasInt = new AliasInt();
        aliasInt.setId(alias.getId());
        aliasInt.setDescripcion(aliasInt.getDescripcion());

        return aliasInt;
    }


}
