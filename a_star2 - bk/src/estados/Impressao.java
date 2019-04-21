/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estados;

/**
 * Classe para gestao da extracao dos resultados na hora de imprimir
 *
 * @author cinquenta
 */
public class Impressao {
    //atributos
    private int missAbordo;
    private int canAbordo;
    private boolean direita;
    
    private int missDireita;
    private int canDireita;
    private int missEsquerda;
    private int canEsquerda;

    /**
     * @return the missAbordo
     */
    public int getMissAbordo() {
        return missAbordo;
    }

    /**
     * @param missAbordo the missAbordo to set
     */
    public void setMissAbordo(int missAbordo) {
        this.missAbordo = missAbordo;
    }

    /**
     * @return the canAbordo
     */
    public int getCanAbordo() {
        return canAbordo;
    }

    /**
     * @param canAbordo the canAbordo to set
     */
    public void setCanAbordo(int canAbordo) {
        this.canAbordo = canAbordo;
    }

    /**
     * @return the direita
     */
    public boolean isDireita() {
        return direita;
    }

    /**
     * @param direita the direita to set
     */
    public void setDireita(boolean direita) {
        this.direita = direita;
    }

    /**
     * @return the missDireita
     */
    public int getMissDireita() {
        return missDireita;
    }

    /**
     * @param missDireita the missDireita to set
     */
    public void setMissDireita(int missDireita) {
        this.missDireita = missDireita;
    }

    /**
     * @return the canDireita
     */
    public int getCanDireita() {
        return canDireita;
    }

    /**
     * @param canDireita the canDireita to set
     */
    public void setCanDireita(int canDireita) {
        this.canDireita = canDireita;
    }

    /**
     * @return the missEsquerda
     */
    public int getMissEsquerda() {
        return missEsquerda;
    }

    /**
     * @param missEsquerda the missEsquerda to set
     */
    public void setMissEsquerda(int missEsquerda) {
        this.missEsquerda = missEsquerda;
    }

    /**
     * @return the canEsquerda
     */
    public int getCanEsquerda() {
        return canEsquerda;
    }

    /**
     * @param canEsquerda the canEsquerda to set
     */
    public void setCanEsquerda(int canEsquerda) {
        this.canEsquerda = canEsquerda;
    }
    
    
}
