package br.edu.ifsp;

public class SomaDeVetores {
    private int[] A = new int[5];
    private int[] B = new int[5];
    private int[] C = new int[5];
    public void criarVetorA(int valor1, int valor2, int valor3, int valor4, int valor5) {
        A[0] = valor1;
        A[1] = valor2;
        A[2] = valor3;
        A[3] = valor4;
        A[4] = valor5;
    }

    public void criarVetorB(int valor1, int valor2, int valor3, int valor4, int valor5){
        B[0] = valor1;
        B[1] = valor2;
        B[2] = valor3;
        B[3] = valor4;
        B[4] = valor5;
    }

    public int[] calcularSoma() {
        for (int i = 0; i < A.length; i++) {
            C[i] = A[i] + B[i];
        }
        return C;
    }

    public void imprimirResultado() {
        System.out.print("Saida = ");
        for (int i = 0; i < C.length; i++) {
            System.out.print(C[i]);
            if (i < C.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
}
