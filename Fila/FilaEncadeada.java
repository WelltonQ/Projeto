
package Fila;

public class FilaEncadeada implements interfacefila{
    
    private int capacidade;
    private int inicio = 0;
    private int fim = 0;
    private NoEncadeadoSimples fila [];

    @Override
    public void criarFila(int tamanho) {
    fila = new NoEncadeadoSimples[tamanho];
    capacidade = tamanho;
    }

    @Override
    public boolean eCheia() {
    return fim == capacidade;
    }

    @Override
    public boolean eVazia() {
    return fim == inicio;
    }

    @Override
    public int tamanho() {
    return fim + 1;
    }

    @Override
    public NoEncadeadoSimples enfileirar(int valor) {
    
        if (!eCheia()){
            NoEncadeadoSimples elemento = new NoEncadeadoSimples(valor);
            fila[fim++] = elemento;
            return elemento;
        }
        System.out.println("Fila cheia");
        return null;
    }

    @Override
    public NoEncadeadoSimples desenfileirar() {
    
        if(!eVazia()){
            NoEncadeadoSimples aux = fila[inicio];
            fila[inicio++] = null;
            return aux;
        }
        System.out.println("Fila nao possui elementos");
        return null;
    }

    @Override
    public int pegarInicio() {
   
        if (inicio != 0 && fim != 0){
            return fila[inicio].getValor();
        }else{
            return -1;
        }
    }

    @Override
    public void listar() {
    
        if (!eVazia()){
            for (int i = inicio; i < fim; i++){
                System.out.println(fila[i].getValor());
            }
            System.out.println("------------------------");
        }
    }
    
}
