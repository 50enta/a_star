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

    public Rio getRio() {
        return rio;
    }

    public void setRio(Rio rio) {
        this.rio = rio;
    }

}
