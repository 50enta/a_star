/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estado;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author cinquenta
 */
public class Estado {

    @Override
    public String toString() {
        return "["+this.getRio().getEsquerda().getCanibais()+"C "+this.getRio().getEsquerda().getMissionarios()+"M <=> "+
               this.getRio().getDireita().getCanibais()+"C "+this.getRio().getDireita().getMissionarios()+"M]";
    }
    

//    Atributos
    private Rio rio;
    private boolean obectivo; //true or false 
    private Integer gn;
    private HashMap<Estado, Integer> proximosEstadosPossiveis = new HashMap();

    //para controle da operacao
    private ArrayList<Estado> caminho = new ArrayList();
    private boolean visitado = false;

    public Estado(Rio rio) {
        this.setRio(rio);
    }

    //outros metodos
    public void adicionarProximoEstadoPossivel(Estado estado, Integer pesoArresta) {
        this.getProximosEstadosPossiveis().put(estado, pesoArresta);
    }

    public Rio getRio() {
        return rio;
    }

    public void setRio(Rio rio) {
        this.rio = rio;
    }

    public boolean isObectivo() {
        return obectivo;
    }

    public void setObectivo(boolean obectivo) {
        this.obectivo = obectivo;
    }

    public Integer getGn() {
        return gn;
    }

    public void setGn(Integer gn) {
        this.gn = gn;
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
