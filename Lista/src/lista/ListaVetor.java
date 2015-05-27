
package lista;

public interface ListaVetor {
 void criarLista(int tamanho); //cria lista com tamanho
 No [] aumentarLista(); //dobra o tamanho da lista atual
 boolean eVazia(); //verifica se a lista possui elementos
 boolean eCheia(); //verifica se a lista está cheia
 int tamanho(); //retorna o número de itens da lista
 int capacidade(); //retorna a capacidade atual da lista
 boolean procurarElemento(int valor); //verifica se o elemento está na lista
 No pegarElemento(int indice); //retorna um determinado nó de um determinado índice
 void addInicio(int valor); //insere um valor no início da lista
 void addFim(int valor); //insere um valor no fim da lista
 void addPosicao(int indice, int valor); //insere um novo nó em uma posição desejada, caso ela esteja disponível
 void removerInicio(int valor); //remove um novo nó do inicio da lista
 void removerFim(int valor); //remove um novo nó do fim da lista
 void removerPosicao(int indice); //remove o nó de uma posição desejada
 void listar(); //retorna os valores da lista 
}
