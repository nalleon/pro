package ies.puerto.impl;

import ies.puerto.abstrac.ConexionesAbstract;
import ies.puerto.interfaz.IConexionRed;

public class ConexionEthernet extends ConexionesAbstract implements IConexionRed {

    public ConexionEthernet () {}

    public ConexionEthernet(float connectionSpeed) {
        super(connectionSpeed);
    }
}
