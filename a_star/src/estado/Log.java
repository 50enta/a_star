/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estado;

import java.util.ArrayList;

/**
 *
 * @author cinquenta
 */
public class Log {

    private int fn;
    private boolean usado = false;
    private int somatorioCustoChegada;   
    private ArrayList<String> caminho = new ArrayList<>();

    public Log() {                                             
        this.setUsado(false);
    }

    public Log(int fn, int sum,ArrayList<String> caminho ){
        this.setUsado(false);
        this.fn = fn;
        this.setCaminho(caminho);
        this.setSomatorioCustoChegada(somatorioCustoChegada);
    }
        
    
    public int getSomatorioCustoChegada() {
        return somatorioCustoChegada;
    }

    public void setSomatorioCustoChegada(int somatorioCustoChegada) {
        this.somatorioCustoChegada = somatorioCustoChegada;
    }
    public void adicionarEstadoNoCaminho(String estado) {
        this.getCaminho().add(estado);
    }

    public int getFn() {
        return fn;
    }

    public boolean isUsado() {
        return usado;
    }

    public void setUsado(boolean usado) {
        this.usado = usado;
    }

    public void setFn(int fn) {
        this.fn = fn;
    }

    public ArrayList<String> getCaminho() {
        return caminho;
    }

    public void setCaminho(ArrayList<String> caminho) {
        this.caminho = caminho;
    }

}
