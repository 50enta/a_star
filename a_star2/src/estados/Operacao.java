package estados;

import java.util.ArrayList;

/**
 *
 * @author cinquenta
 * @author samira
 * @author lucilia
 */
public class Operacao {

    private int estadoDoBarcoActual = 0;
    private ArrayList lista = new ArrayList();

    /**
     * Adiciona o estado a lista e faz a linkagem com o no pai
     *
     * @param designacao
     * @param pai
     * @param nMiss
     * @param nCan
     */
    public void addicionarALista(String designacao, Estado pai, int nMiss, int nCan) {
        int direcao = pai.isMargem() ? 1 : -1;
        String novaDesignacao = pai.getDesignacao() + designacao;
        Estado estado = new Estado(novaDesignacao, pai.getNumeroCanibais() + nMiss * direcao,
                pai.getNumeroMissionarios() + nCan * direcao, !pai.isMargem(), pai, pai.getPosicaoEstado());
        this.adicionarALista(estado);
    }

    /**
     * Reponsavel por incluir os nos possiveis para a lista. Depois da validacao
     * e tudo
     *
     * @param novo
     */
    public void adicionarALista(Estado novo) {
        if (!novo.isEstadoInvalido()) {
            this.getLista().add(novo);
        }
    }

    public ArrayList processar(Estado inicio, Estado fim) {
        boolean achou = false;
        ArrayList listinha = new ArrayList();
        adicionarALista(inicio);
        while (getLista().size() > 0 && !achou) {
            Estado curNode = (Estado) getLista().remove(getEstadoDoBarcoActual());
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
    public int getEstadoDoBarcoActual() {
        return estadoDoBarcoActual;
    }

    public void setEstadoDoBarcoActual(int estadoDoBarcoActual) {
        this.estadoDoBarcoActual = estadoDoBarcoActual;
    }

    public ArrayList getLista() {
        return lista;
    }

    public void setLista(ArrayList lista) {
        this.lista = lista;
    }

}
