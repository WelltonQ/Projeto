
package Fila;


public class NoEncadeadoSimples {
   int valor;
   NoEncadeadoSimples ponteiro;

    public NoEncadeadoSimples(int valor, NoEncadeadoSimples ponteiro) {
        this.valor = valor;
        this.ponteiro = ponteiro;
    }

    NoEncadeadoSimples(int valor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public NoEncadeadoSimples getPonteiro() {
        return ponteiro;
    }

    public void setPonteiro(NoEncadeadoSimples ponteiro) {
        this.ponteiro = ponteiro;
    }
   
    
   
}
