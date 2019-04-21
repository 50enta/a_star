package view;

import estados.Estado;
import estados.Impressao;
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
        ArrayList<Impressao> imp = new ArrayList();
        Operacao op = new Operacao();
        //Iniciar os estados
        ArrayList<Estado> todosEstados
                = op.processar(
                        new Estado("Inicio", 3, 3, false, 1),
                        new Estado("fim", 0, 0, true, 0)
                );
        int numPassos = todosEstados.size()+1;
        if (todosEstados.isEmpty()) {
            System.out.println("\n\n Erro! \r\n");
        } else {
            for (int i = 0; i < todosEstados.size(); i++) {
                Estado s =  todosEstados.remove(0);
                System.out.println("Misionarios e Canibais\r\n");
                System.out.println("Margem esquerda --- Margem Direita");
                s.imprimir();
                System.out.println("Total de " + s.getPosicaoEstado() + " Passos!\n");
//                System.out.println("Total de " + numPassos + " Passos!\n");
            }
        }
    }
}
