// package Lista_Vetor;

// import java.util.Scanner;

// public class Um {

//     // Função para ler valores em um vetor
//     public static int[] carregarVetor(String nome, int tamanho) {
//         Scanner s = new Scanner(System.in);
//         int[] vetor = new int[tamanho];
//         System.out.println("Digite " + tamanho + " números inteiros para o vetor " + nome + ":");
//         for (int i = 0; i < tamanho; i++) {
//             System.out.print(nome + "[" + i + "] = ");
//             vetor[i] = s.nextInt();
//         }
//         return vetor;
//     }
    
//     // Função para somar dois vetores
//     public static int[] somaVetores(int[] vetor1, int[] vetor2) {
//         int[] resultado = new int[vetor1.length];
//         for (int i = 0; i < vetor1.length; i++) {
//             resultado[i] = vetor1[i] + vetor2[i];
//         }
//         return resultado;
//     }
    
//     public static void main(String[] args) {
//         int tamanho = 5;
        
//         int[] A = carregarVetor("A", tamanho);
//         int[] B = carregarVetor("B", tamanho);
//         int[] C = carregarVetor("C", tamanho);
//         int[] D = carregarVetor("D", tamanho);
        
//         int[] soma1 = somaVetores(A, B);
//         int[] soma2 = somaVetores(soma1, C);
//         int[] resultado = somaVetores(soma2, D);
        
//         System.out.print("A + B + C + D = [");
//         for (int i = 0; i < resultado.length; i++) {
//             System.out.print(resultado[i]);
//             if (i < resultado.length - 1) {
//                 System.out.print(", ");
//             }
//         }
//         System.out.print("]");
//     }
// }