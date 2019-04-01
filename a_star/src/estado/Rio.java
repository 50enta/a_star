package estado;

/**
 *
 * @author cinquenta
 */
public class Rio {

    private Margem direita, esquerda;

    /**
     * Construtor, que inicializa o rio com as magens direita e esquerda
     *
     * @param direita
     * @param esquerda
     */
    public Rio(Margem esquerda, Margem direita) {
        this.setEsquerda(esquerda);
        this.setDireita(direita);
    }

    public Margem getDireita() {
        return direita;
    }

    public void setDireita(Margem direita) {
        this.direita = direita;
    }

    public Margem getEsquerda() {
        return esquerda;
    }

    public void setEsquerda(Margem esquerda) {
        this.esquerda = esquerda;
    }

}
