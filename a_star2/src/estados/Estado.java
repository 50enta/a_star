
package estados;

/**
 *Esta classe represent o estado em que se esta. 
 * Mais concretamento uma margem, que pode ser direita ou esquerda 
 * @author cinquenta
 * @author samira
 * @author lucilia
 */
public class Estado {

    //Atributos
    int numeroCanibais, numeroMissionarios;
    boolean margem; //direita = true; esquerda = false
    public final int VALOR_DE_INICIO = 3;//cosntante
    String designacao; //uma especie do nome do no
    int posicaoEstado = 0;
    Estado previousNode;

    /**
     * Construtor primeiro, que por sua vez invoca o segundo construtor e
     * inicializa as suas propriedades, dado especial atencao ao objecto passado
     * por paramentro
     *
     * @param designacao
     * @param nM
     * @param nC
     * @param margem
     * @param posEst
     */
    public Estado(String designacao, int nM, int nC, boolean margem, int posEst) {
        this(designacao, nM, nC, margem, null, posEst);
    }

    /**
     * Segundo construtor, que inicializa o objecto com as propriedades
     * descritas no paramentro
     *
     * @param name
     * @param nM
     * @param nC
     * @param lado
     * @param est
     * @param pos
     */
    public Estado(String name, int nM, int nC, boolean lado, Estado est, int pos) {
        this.numeroMissionarios = nC;
        this.numeroCanibais = nM;
        this.designacao = name;
        this.previousNode = est;
        this.margem = lado;
        this.posicaoEstado = pos;
    }

    /**
     * Como se fosse o metodo toString. Imprime o seu estado actual
     */
    public void imprimir() {
        int n = 0;
        int c = 0;
        if (previousNode != null) {
            n = Math.abs(this.getNumeroCanibais() - previousNode.getNumeroCanibais());
            c = Math.abs(this.getNumeroMissionarios() - previousNode.getNumeroMissionarios());
            previousNode.imprimir();
        }
        String direcao = margem ? "----(" + n + "M)BARCO(" + c + "C)----->" : "<----(" + n + "M)BOAT(" + c + "C)-----";
        System.out.println(numeroCanibais + "M/" + numeroMissionarios + "C " + direcao + " "
                + (VALOR_DE_INICIO - this.getNumeroCanibais()) + "M/"
                + (VALOR_DE_INICIO - this.getNumeroMissionarios()) + "C");

    }

    /**
     * Metodo para verificar se os nos sao iguais ou nao. Nos sao iguais quando
     * tem o barco no mesmo lado e o numero de canibais e missionarios forem
     * iguais. Sendo o reto nao interessante
     *
     * @param est
     * @return
     */
    public boolean isIguais(Estado est) {
        return (numeroCanibais == est.numeroCanibais && numeroMissionarios == est.numeroMissionarios && margem == est.margem);
    }

    public boolean isEstadoInvalido() {
        if (numeroCanibais < 0 || numeroMissionarios < 0) {
            return true;
        }
        if (numeroCanibais < numeroMissionarios && numeroCanibais > 0) {
            return true;
        }
        if (3 - numeroCanibais < 3 - numeroMissionarios && 3 - numeroCanibais > 0) {
            return true;
        }
        if (numeroCanibais > VALOR_DE_INICIO || numeroMissionarios > VALOR_DE_INICIO) {
            return true;
        }
        return false;
    }

    ////
    ///
    ///
    public int getNumeroCanibais() {
        return numeroCanibais;
    }

    public void setNumeroCanibais(int numeroCanibais) {
        this.numeroCanibais = numeroCanibais;
    }

    public int getNumeroMissionarios() {
        return numeroMissionarios;
    }

    public void setNumeroMissionarios(int numeroMissionarios) {
        this.numeroMissionarios = numeroMissionarios;
    }

    public boolean isMargem() {
        return margem;
    }

    public void setMargem(boolean margem) {
        this.margem = margem;
    }

    public String getDesignacao() {
        return designacao;
    }

    public void setDesignacao(String designacao) {
        this.designacao = designacao;
    }

    public int getPosicaoEstado() {
        return posicaoEstado;
    }

    public void setPosicaoEstado(int posicaoEstado) {
        this.posicaoEstado = posicaoEstado;
    }

    public Estado getPreviousNode() {
        return previousNode;
    }

    public void setPreviousNode(Estado previousNode) {
        this.previousNode = previousNode;
    }

}
