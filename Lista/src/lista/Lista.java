
package lista;


public class Lista implements ListaVetor {

    private int capacidade = 0;
    private int tamanho = 0;
    private No lista[];

    @Override
    public void criarLista(int tamanho) {
        this.lista = new No[tamanho];
        this.capacidade = tamanho;
    }

    @Override
    public No[] aumentarLista() {
        No aux[] = new No[capacidade * 2];
        for (int i = 0; i < capacidade; i++) {
            aux[i] = lista[i];
        }
        capacidade *= 2;
        return aux;
    }

    @Override
    public boolean eVazia() {
        return capacidade == 0;
    }

    @Override
    public boolean eCheia() {
        return capacidade == tamanho;
    }

    @Override
    public int tamanho() {
        return tamanho;
    }

    @Override
    public int capacidade() {
        return capacidade;
    }

    @Override
    public boolean procurarElemento(int valor) {
        for (int i = 0; i < tamanho; i++) {
            if (lista[i].getValor() == valor) {
                return true;
            }
        }
        return false;
    }

    @Override
    public No pegarElemento(int indice) {
        return lista[indice];
    }

    @Override
    public void addInicio(int valor) {
        if (!eCheia()) {
            for (int i = tamanho; i > 0; i--) {
                lista[i] = lista[i - 1];
            }
            lista[0] = new No(valor);
            tamanho ++;
        }
        if (eCheia()) {
            lista = aumentarLista();
        }
    }

    @Override
    public void addFim(int valor) {
        if(!eCheia())
            lista[tamanho] = new No(valor);
    }

    @Override
    public void addPosicao(int indice, int valor) {
        if (lista[indice] == null) {
            lista[indice] = new No(valor);
        }
    }

    @Override
    public void removerInicio(int valor) {
        for (int i = 0; i <tamanho-1; i++) {
            lista[i] = lista[i + 1];
            
        }
        tamanho--;
    }

    @Override
    public void removerFim(int valor) {
        lista[tamanho-1]=null;
        tamanho--;
    }

    @Override
    public void removerPosicao(int indice) {
        for (int i = indice; i < tamanho-1; i++) {
            lista[i] = lista[i+1] ; 
        }
    }

    @Override
    public void listar() {
        for (int i = 0; i < tamanho-1; i++) {
            System.out.println(lista[i].getValor());
        }
    }

}
