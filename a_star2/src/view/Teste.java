package view;

import estados.Estado;
import estados.Operacao;
import java.util.ArrayList;

/**
 * 
 * @author cinquenta
 * @author samira
 * @author lucilia
 */
public class Teste {

    public static void main(String[] args) {

        Operacao op = new Operacao();
        //Start states
        ArrayList todosEstados = op.processar(
                new Estado("Start", 3, 3, false, 1),
                new Estado("End", 0, 0, true, 0));

        if (todosEstados.isEmpty()) {
            System.out.println("\n\nND SOLUCAO \r\n");
        } else {
            for (int i = 0; i < todosEstados.size(); i++) {
                Estado s = (Estado) todosEstados.remove(0);
                System.out.println("Misionarios e Canibais\r\n");
                System.out.println("Margem esquerda ---------- Margem Direita");
                s.imprimir();
                System.out.println("Total de " + s.getPosicaoEstado() + " Passos!\n");
            }
        }
    }
}
