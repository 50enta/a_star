package estados;

import java.util.ArrayList;

/**
 * Nesta classe, estao os metodos responsaveis por operacoes que nao estao
 * ligadas directamente a cada estado/no. ou seja, as operacoes que podem
 * envolver varios estado/nos em simultario. Como por exemplo a busca pela
 * solucao, envolve todos os estados possiveis dado o estado inicial
 *
 * @author cinquenta
 * @author samira
 * @author lucilia
 */
public class Operacao {

    private int estadoDoBarcoActual = 0;
    private ArrayList<Estado> lista = new ArrayList();

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
                pai.getNumeroMissionarios() + nCan * direcao, !pai.isMargem(), pai, pai.getPosicaoEstado()+1);
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

    /**
     * Basicamento o metodo principal que por sua vez iterliga os outros metodos
     * na busca da solucao.
     *
     * @param inicio
     * @param fim
     * @return
     */
    public ArrayList processar(Estado inicio, Estado fim) {
        boolean achou = false;
        ArrayList auxiliar = new ArrayList();
        adicionarALista(inicio);
        while (getLista().size() > 0 && !achou) {
            Estado estActual = (Estado) getLista().remove(this.getEstadoDoBarcoActual());
            if (estActual.isIguais(fim)) {
                auxiliar.add(estActual);
                achou = true;
            } else {
                this.gerarNovosEstados(estActual);
            }
        }
        return auxiliar;
    }

    /**
     * Os estados sao gerados aleatoriamente e de seguida sao validados, para
     * verificar se podem fazer parte da lista ou nao.
     *
     * @param agora
     */
    public void gerarNovosEstados(Estado agora) {
        int nCan, nMiss = 0;
        int designacao = 1;
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
                addicionarALista(("_" + designacao++), agora, nMiss, nCan);
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
