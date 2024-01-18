package ies.puerto.app;

import ies.puerto.impl.ConexionEthernet;
import ies.puerto.impl.ConexionWifi;

public class AppConexion {

    static ConexionWifi conexionWifi;
    static ConexionEthernet conexionEthernet;

    public static void main(String[] args) {
        conexionWifi = new ConexionWifi(121);
        conexionWifi.connect();
        System.out.println(conexionWifi.toString());
        conexionWifi.showSpeed();

        conexionWifi.setConnectionSpeed(2);
        System.out.println("> New data: " + conexionWifi.getConnectionSpeed()+ "Mbps");
        conexionWifi.showSpeed();

        System.out.println();

        conexionEthernet = new ConexionEthernet(378);
        conexionEthernet.connect();
        System.out.println( conexionEthernet.toString());
        conexionEthernet.showSpeed();

        conexionEthernet.setConnectionSpeed(599);
        System.out.println("> New data: " + conexionEthernet.getConnectionSpeed()+ "Mbps");
        conexionEthernet.showSpeed();
    }
}
