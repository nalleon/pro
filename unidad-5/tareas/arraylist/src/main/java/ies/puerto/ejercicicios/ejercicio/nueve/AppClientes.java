package ies.puerto.ejercicicios.ejercicio.nueve;

import ies.puerto.ejercicicios.ejercicio.nueve.Cliente;
import ies.puerto.ejercicicios.ejercicio.nueve.RegistroClientes;

public class AppClientes {

   static RegistroClientes registroClientes = new RegistroClientes();
    public static void main(String[] args) {
    Cliente cliente = new Cliente("Nabil", 776, 500.5f);
        Cliente cliente2 = new Cliente("Idaira", 7, 700f);

        registroClientes.addCliente(cliente);
        registroClientes.addCliente(cliente2);
        System.out.println(registroClientes.toString());
        registroClientes.eliminateCliente(cliente2);
        System.out.println(registroClientes.toString());

        System.out.println("Cliente search by num 7: " + registroClientes.searchByNum(7));
        System.out.println("Cliente search by num 776: " + registroClientes.searchByNum(776));
        System.out.println("Transaction: " + registroClientes.transaction(776, 30f));
    }
}
