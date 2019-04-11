package estados;

/**
 * Esta classe represent o estado em que se esta. Mais concretamento uma margem,
 * que pode ser direita ou esquerda
 *
 * @author cinquenta
 * @author samira
 * @author lucilia
 */
public class Estado {

    //atributos
    private int numeroCanibais; //direita = true; esquerda = false
    private int numeroMissionarios;//cosntante
    private boolean margem; //uma especie do nome do no
    private int VALOR_DE_INICIO = 3;
    private String designacao;
    private int posicaoEstado = 0;
    private Estado noAnterior;

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
     * @param designacao
     * @param nM
     * @param nC
     * @param lado
     * @param est
     * @param pos
     */
    public Estado(String designacao, int nM, int nC, boolean lado, Estado est, int pos) {
        this.numeroMissionarios = nC;
        this.numeroCanibais = nM;
        this.designacao = designacao;
        this.noAnterior = est;
        this.margem = lado;
        this.posicaoEstado = pos;
    }

    /**
     * Como se fosse o metodo toString. Imprime o seu estado actual
     */
    public void imprimir() {
        int n = 0;
        int c = 0;
        if (this.getNoAnterior() != null) {
            n = Math.abs(this.getNumeroCanibais() - this.getNoAnterior().getNumeroCanibais());
            c = Math.abs(this.getNumeroMissionarios() - this.getNoAnterior().getNumeroMissionarios());
            getNoAnterior().imprimir();
        }
        String direcao = this.isMargem() ? "----(" + n + "M)BARCO(" + c + "C)----->" : "<----(" + n + "M)BOAT(" + c + "C)-----";
        System.out.println(getNumeroCanibais() + "M/" + getNumeroMissionarios() + "C " + direcao + " "
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
        return (this.getNumeroCanibais() == est.getNumeroCanibais() && this.getNumeroMissionarios() == est.getNumeroMissionarios() && isMargem() == est.isMargem());
    }

    /**
     * Para questoes de validacao, e' basicamento onde se verifica a restricao
     * sobre o numero de missionarios em relacao ao numeros de canibasi, numeros
     * negativos e absurdos entre tantos outros
     *
     * @return
     */
    public boolean isEstadoInvalido() {
        if (getNumeroCanibais() < 0 || getNumeroMissionarios() < 0) {
            return true;
        }
        if (getNumeroCanibais() < getNumeroMissionarios() && getNumeroCanibais() > 0) {
            return true;
        }
        if (3 - getNumeroCanibais() < 3 - getNumeroMissionarios() && 3 - getNumeroCanibais() > 0) {
            return true;
        }
        if (getNumeroCanibais() > VALOR_DE_INICIO || getNumeroMissionarios() > VALOR_DE_INICIO) {
            return true;
        }
        return false;
    }

    //metodos especiais
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

    public Estado getNoAnterior() {
        return noAnterior;
    }

    public void setNoAnterior(Estado noAnterior) {
        this.noAnterior = noAnterior;
    }

    /**
     * @param VALOR_DE_INICIO the VALOR_DE_INICIO to set
     */
    public void setVALOR_DE_INICIO(int VALOR_DE_INICIO) {
        this.VALOR_DE_INICIO = VALOR_DE_INICIO;
    }

}
