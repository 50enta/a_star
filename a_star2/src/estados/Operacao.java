package estados;

import java.util.ArrayList;

/**
 *
 * @author cinquenta
 * @author samira
 * @author lucilia
 */
public class Operacao {

    public int current_boat_node = 0;
    public ArrayList lista = new ArrayList();

    //constructor to add  node to the Agend aand include parent node id available
    public void addicionarALista(String nodeName, Estado pai, int nMiss, int nCan) {
        int direcao = pai.margem ? 1 : -1;
        String novaDesignacao = pai.getDesignacao() + nodeName;
        Estado estado = new Estado(novaDesignacao, pai.numeroCanibais + nMiss * direcao,
                pai.numeroMissionarios + nCan * direcao, !pai.margem, pai, pai.getPosicaoEstado());
        this.adicionarALista(estado);
    }

    public void adicionarALista(Estado novo) {
        if (!novo.isEstadoInvalido()) {
            this.lista.add(novo);
        }
    }

    public ArrayList processar(Estado inicio, Estado fim) {
        boolean achou = false;
        ArrayList listinha = new ArrayList();
        adicionarALista(inicio);
        while (lista.size() > 0 && !achou) {
            Estado curNode = (Estado) lista.remove(current_boat_node);
            if (curNode.isIguais(fim)) {
                listinha.add(curNode);
                achou = true;
            } else {
                this.gerarNovosEstados(curNode);
            }
        }
        return listinha;
    }

    public void gerarNovosEstados(Estado agora) {
        int nCan, nMiss = 0;
        int nodeName = 1;
        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 2; j++) {
                if (i == 0 && j == 0) {
                    continue;
                }
                if (i + j > 2) {
                    break;
                }
                nMiss = i;
                nCan = j;
                addicionarALista("_" + nodeName++, agora, nMiss, nCan);
            }
        }
    }

    //
    //
    //
    public int getCurrent_boat_node() {
        return current_boat_node;
    }

    public void setCurrent_boat_node(int current_boat_node) {
        this.current_boat_node = current_boat_node;
    }

    public ArrayList getLista() {
        return lista;
    }

    public void setLista(ArrayList lista) {
        this.lista = lista;
    }

}
