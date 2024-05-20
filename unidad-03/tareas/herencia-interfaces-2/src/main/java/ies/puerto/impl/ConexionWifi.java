package ies.puerto.impl;

import ies.puerto.abstrac.ConexionesAbstract;
import ies.puerto.interfaz.IConexionRed;

public class ConexionWifi extends ConexionesAbstract implements IConexionRed {

    public ConexionWifi () {}

    public ConexionWifi(float connectionSpeed) {
        super(connectionSpeed);
    }
}
