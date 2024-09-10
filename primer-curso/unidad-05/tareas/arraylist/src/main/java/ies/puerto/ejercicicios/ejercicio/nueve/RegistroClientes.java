package ies.puerto.ejercicicios.ejercicio.nueve;

import java.util.ArrayList;
import java.util.Objects;

/**
 * Implementa una clase RegistroClientes que contenga un ArrayList de objetos Cliente. Cada cliente tiene un nombre, un número de cliente y un saldo. Escribe métodos para agregar clientes, buscar clientes
 * por número y realizar una transacción (actualizar el saldo).
 */
public class RegistroClientes extends Cliente {
    private ArrayList<Cliente> clienteList;

    /**
     * Default constructor of the class
     */
    public RegistroClientes() {
        this.clienteList = new ArrayList<>();
    }

    /**
     * Constructor of the class
     * @param clienteList of the register
     */
    public RegistroClientes(ArrayList<Cliente> clienteList) {
        this.clienteList = clienteList;
    }

    public RegistroClientes(String name, String num, float balance, ArrayList<Cliente> clienteList) {
        super(name, num, balance);
        this.clienteList = clienteList;
    }

    /**
     * Getters and setters
     */
    public ArrayList<Cliente> getClienteList() {
        return clienteList;
    }

    public void setClienteList(ArrayList<Cliente> clienteList) {
        this.clienteList = clienteList;
    }

    /**
     * Method to register a customer
     * @param cliente customer to add
     */
    public void addCliente(Cliente cliente) {
        if (!clienteList.contains(cliente)){
             clienteList.add(cliente);
        }
    }
    /**
     * Method to remove a customer
     * @param cliente customer to remove
     */
    public void eliminateCliente(Cliente cliente) {
        clienteList.remove(cliente);
    }

    /**
     * Method to search a customer by number
     * @param num of the customer
     * @return customer if found, null if not
     */
    public Cliente searchCustomerByNum (String num){
        for (Cliente cliente : clienteList) {
            if (cliente.getNum().equals(num)){
                return cliente;
            }
        }
        return null;
    }

    public Cliente searchCustomer (Cliente customerSearch){
        for (Cliente customer : clienteList) {
            if (customer.equals(customerSearch)){
                return customerSearch;
            }
        }
        return null;
    }


    /**
     * Method to allow a customer do a transaction
     * @param num of the customer
     * @param amount of money
     */
    public String transaction(String num, float amount) {
        Cliente customer = searchCustomerByNum(num);
        if (customer == null) {
            return "Client not found";
        }
        customer.setBalance(customer.getBalance() + amount);
        return "Transaction successful. New balance: " + customer.getBalance();
    }

    public String transaction2 (String num, float amount){
        Cliente updateCustomer = new Cliente(num);
        if (!clienteList.contains(updateCustomer)){
            return "Client not found";
        }
        /** First option; Optimization++ **/

       int customerPosition = clienteList.indexOf(updateCustomer);
        updateCustomer = searchCustomer(updateCustomer);
        updateCustomer.updateBalance(amount);
        clienteList.add(customerPosition, updateCustomer);

        /** Second option **/
        for (Cliente customerList: clienteList){
            if (customerList.equals(updateCustomer)){
                customerList.updateBalance(amount);
            }
        }
        return "Transaction successful. Your new info is: " + updateCustomer ;
    }

    @Override
    public String toString() {
        return "RegistroClientes{" +
                "clientes=" + clienteList +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        RegistroClientes that = (RegistroClientes) o;
        return Objects.equals(clienteList, that.clienteList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), clienteList);
    }
}
