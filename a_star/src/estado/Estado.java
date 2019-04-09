package estado;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author cinquenta
 */
public class Estado {

    //    Atributos
    private String designacao;
    private Rio rio = new Rio();
    private Boolean objectivo = false;
    private Integer hn;
    private HashMap<Estado, Integer> proximosEstadosPossiveis = new HashMap(5);

    //para controle da operacao
    private ArrayList<Estado> caminho = new ArrayList();
    private boolean visitado = false;
    private boolean avaliado = false;

    private ArrayList<Log> logs = new ArrayList();

    public Estado(String designacao, Rio rio, Integer hn) {
        this.setDesignacao(designacao);
        this.setRio(rio);
        this.setHn(hn);
    }

    public Estado() {
    }

    @Override
    public String toString() {
//        return "[" + this.getRio().getEsquerda().getCanibais() + "C " + this.getRio().getEsquerda().getMissionarios() + "M <=> "
//                + this.getRio().getDireita().getCanibais() + "C " + this.getRio().getDireita().getMissionarios() + "M]";
        return this.getDesignacao();
    }

    //outros metodos
    public void adicionarProximoEstadoPossivel(Estado estado, Integer pesoArresta) {
        this.getProximosEstadosPossiveis().put(estado, pesoArresta);
    }

    /**
     * Verifica se o no em causa tem ou nao filhos
     *
     * @param est
     * @return
     */
    public Boolean temFilhos() {
        return !this.getProximosEstadosPossiveis().isEmpty();
    }

    public Rio getRio() {
        return rio;
    }

    public void setRio(Rio rio) {
        this.rio = rio;
    }

    public String getDesignacao() {
        return designacao;
    }

    public void setDesignacao(String designacao) {
        this.designacao = designacao;
    }

    public boolean isObjectivo() {
        return objectivo;
    }

    public boolean isAvaliado() {
        return avaliado;
    }

    public void setAvaliado(boolean avaliado) {
        this.avaliado = avaliado;
    }

    public void setObjectivo(boolean objectivo) {
        this.objectivo = objectivo;
    }

    public ArrayList<Log> getLogs() {
        return logs;
    }

    public void setLogs(ArrayList<Log> logs) {
        this.logs = logs;
    }

    public Integer getHn() {
        return hn;
    }

    public void setHn(Integer hn) {
        this.hn = hn;
    }

    public HashMap<Estado, Integer> getProximosEstadosPossiveis() {
        return proximosEstadosPossiveis;
    }

    public void setProximosEstadosPossiveis(HashMap<Estado, Integer> proximosEstadosPossiveis) {
        this.proximosEstadosPossiveis = proximosEstadosPossiveis;
    }

    public ArrayList<Estado> getCaminho() {
        return caminho;
    }

    public void setCaminho(ArrayList<Estado> caminho) {
        this.caminho = caminho;
    }

    public boolean isVisitado() {
        return visitado;
    }

    public void setVisitado(boolean visitado) {
        this.visitado = visitado;
    }

}
