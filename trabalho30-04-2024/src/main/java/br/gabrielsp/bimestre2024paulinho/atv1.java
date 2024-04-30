

package br.gabrielsp.bimestre2024paulinho;

import java.util.Scanner;


public class atv1 {

    public static void main(String[] args) {
    
    
        Scanner scanner = new Scanner(System.in);

        // Pedir ao usuário a quantidade de elementos na lista
        System.out.print("Digite a quantidade de números na lista: ");
        int tamanhoLista = scanner.nextInt();

        // Criar um array para armazenar os números
        int[] numeros = new int[tamanhoLista];

        // Pedir ao usuário para inserir os números na lista
        for (int i = 0; i < tamanhoLista; i++) {
            System.out.print("Digite o número na posição " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        // Pedir ao usuário o método de ordenação
        System.out.println("Escolha o método de ordenação: ");
        System.out.println("1. Bubble Sort");
        System.out.println("2. Selection Sort");
        System.out.println("3. Insertion Sort");
        int metodo = scanner.nextInt();

        // Ordenar os números usando o método escolhido
        switch (metodo) {
            case 1:
                bubbleSort(numeros);
                break;
            case 2:
                selectionSort(numeros);
                break;
            case 3:
                insertionSort(numeros);
                break;
            default:
                System.out.println("Método de ordenação inválido.");
        }

        // Mostrar a lista ordenada
        System.out.print("Lista ordenada: ");
        for (int num : numeros) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Pedir ao usuário para inserir o número a ser pesquisado
        System.out.print("Digite o número a ser pesquisado: ");
        int numeroPesquisado = scanner.nextInt();

        // Realizar uma pesquisa linear para encontrar o número e sua posição
        int posicao = pesquisaLinear(numeros, numeroPesquisado);

        if (posicao != -1) {
            System.out.println("O número " + numeroPesquisado + " foi encontrado na posição " + (posicao + 1) + " da lista ordenada.");
        } else {
            System.out.println("O número " + numeroPesquisado + " não foi encontrado na lista ordenada.");
        }

        scanner.close();
    }

    // Método para ordenar os números usando Bubble Sort
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (arr[j] > arr[j+1]) {
                    // trocar arr[j] e arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    // Método para ordenar os números usando Selection Sort
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            int minIndex = i;
            for (int j = i+1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            // Trocar arr[i] e arr[minIndex]
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }

    // Método para ordenar os números usando Insertion Sort
    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    // Método para realizar uma pesquisa linear na lista ordenada
    public static int pesquisaLinear(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1; // Retorna -1 se o número não for encontrado
    }
}

