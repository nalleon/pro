package ies.puerto.app;

import ies.puerto.abstrac.ConexionesAbstract;
import ies.puerto.impl.ConexionEthernet;
import ies.puerto.impl.ConexionWifi;

public class AppConexion {

    static ConexionesAbstract conexionWifi;
    static ConexionesAbstract conexionEthernet;

    public static void main(String[] args) {
        conexionWifi = new ConexionWifi(121);
        System.out.println(conexionWifi.connect());
        System.out.println(conexionWifi.toString());
        System.out.println(conexionWifi.showSpeed());

        conexionWifi.setConnectionSpeed(2);
        System.out.println("> New data: " + conexionWifi.getConnectionSpeed()+ "Mbps");
        conexionWifi.showSpeed();

        System.out.println();

        conexionEthernet = new ConexionEthernet(378);
        System.out.println(conexionEthernet.connect());
        System.out.println( conexionEthernet.toString());
        System.out.println(conexionEthernet.showSpeed());

        conexionEthernet.setConnectionSpeed(599);
        System.out.println("> New data: " + conexionEthernet.getConnectionSpeed()+ "Mbps");
        System.out.println(conexionEthernet.showSpeed());
    }
}
