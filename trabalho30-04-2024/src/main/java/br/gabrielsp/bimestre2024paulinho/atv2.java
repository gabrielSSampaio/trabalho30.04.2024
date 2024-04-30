
package br.gabrielsp.bimestre2024paulinho;

import br.gabrielsp.bimestre2024paulinho.newpackage.Cliente;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;


public class atv2 {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Cliente> clientes = new ArrayList<>();

        System.out.println("Bem-vindo ao Cadastro de Clientes!");
        System.out.println("Por favor, insira os dados dos clientes.");

        while (true) {
            System.out.print("\nDigite o código do cliente (ou -1 para encerrar): ");
            int id = input.nextInt();
            if (id == -1) {
                break;
            }
            input.nextLine(); 

            System.out.print("Digite o nome do cliente: ");
            String nome = input.nextLine();

            System.out.print("Digite a data de nascimento do cliente (dd/mm/aaaa): ");
            String nascimento = input.nextLine();

            System.out.print("Digite o CPF do cliente: ");
            String cpf = input.nextLine();

            Cliente cliente = new Cliente(id, nome, nascimento, cpf);
            clientes.add(cliente);
        }

        Collections.sort(clientes, Comparator.comparingInt(Cliente::getId));

        System.out.println("\nClientes cadastrados (ordenados pelo código):");
        for (Cliente cliente : clientes) {
            System.out.println(cliente);
        }

        System.out.print("\nDigite o código do cliente para pesquisa: ");
        int idPesquisa = input.nextInt();

        Cliente clienteEncontrado = null;
        for (Cliente cliente : clientes) {
            if (cliente.getId() == idPesquisa) {
                clienteEncontrado = cliente;
                break;
            }
        }

        if (clienteEncontrado != null) {
            System.out.println("\nCliente encontrado:");
            System.out.println(clienteEncontrado);
        } else {
            System.out.println("\nCliente não encontrado.");
        }

        input.close();
    }
}

