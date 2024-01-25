package ies.puerto.impl;

import java.util.ArrayList;
import java.util.Objects;

public class RegistroClientes extends Cliente {
    private ArrayList<Cliente> clientes;

    public RegistroClientes() {
        this.clientes = new ArrayList<>();
    }

    public RegistroClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    public RegistroClientes(String name, int tlfNum, float balance, ArrayList<Cliente> clientes) {
        super(name, tlfNum, balance);
        this.clientes = clientes;
    }

    /**
     * Getters and setters
     */
    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    /**
     * Method to register a client
     * @param cliente to add
     */
    public void addCliente(Cliente cliente) {
        clientes.add(cliente);
    }
    /**
     * Method to remove a client
     * @param cliente to remove
     */
    public void eliminateCliente(Cliente cliente) {
        clientes.remove(cliente);
    }

    public Cliente searchByNum (int num){
        for (Cliente cliente : clientes) {
            if (cliente.getNum() == num){
                return cliente;
            }
        }
        return null;
    }
    public String transaction(int num, float amount) {
        Cliente cliente = searchByNum(num);
        if (cliente == null) {
            return "Client not found";
        }
        cliente.setBalance(cliente.getBalance() + amount);
        return "Transaction successful. New balance: " + cliente.getBalance();
    }

    @Override
    public String toString() {
        return "RegistroClientes{" +
                "clientes=" + clientes +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        RegistroClientes that = (RegistroClientes) o;
        return Objects.equals(clientes, that.clientes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), clientes);
    }
}
