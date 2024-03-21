/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package recursão;

/**
 *
 * @author FATEC ZONA LESTE
 */
public class Recursão {

    // somatório feio
    /*public static int S(int n ) {
        int soma = 0;
        for(int i = 1; i <= n; i++) {
            soma += i;
        }
        return soma;
    }*/
    
    // somatório
    public static int S(int n) {
        if(n == 1) return 1;
        return S(n-1) + n;
    }
    
    // fatorial
    public static int F(int n) {
        if (n == 0 || n == 1) return 1;
        return F(n-1) * n;
    }
    
    // potenciação
    public static int P(int x, int y) {
        if (y == 0) return 1;
        return x * P(x, y - 1);
    }
    
    // fibbonaci
    public static int Fibo(int v[], int n) {
        if (v[0] == 1) return 1;
        return v[n-2] + v[n -1];   
    }
    
    // pega o maior numero (pesquisa binaria) -> sem usar nenhum laço
    public static int x(int v[], int inicio, int fim) {
        int meio = (inicio + fim)/2;
        int n1, n2;
        if(meio>inicio) {
            n1 = x(v, inicio, meio);
            n2 = x(v, meio+1, fim);
        }
        else {
            n1 = v[inicio];
            n2 = v[fim];
        }
        if(n1>n2) return n1; else return n2;
    }
    
    // pesquisa binária (recursividade = elegante)
    public static int PesquisaBinaria(int valor, int v[], int e, int d){
 	int meio = (e + d)/2;
 	if (v[meio] == valor) return meio;
 	if (e >= d) return -1; //não encontrado
 	if (v[meio] < valor) return PesquisaBinaria(valor, v, meio+1, d);
 	return PesquisaBinaria(valor, v, e, meio-1);
}
    
    public static void main(String[] args) {
        int n = 10;
       int v[] = new int[n];
       int i;
       
       for (i = 0; i <n; i++) {
           v[i] = i;
       }
       
        System.out.println( PesquisaBinaria(10, v, 5, 6));
        
        
    }
    
}
