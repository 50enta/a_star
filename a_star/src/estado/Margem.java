package estado;

import java.util.ArrayList;

/**
 *
 * @author cinquenta
 */
public class Margem {
    
    private ArrayList<Canibal> canibais;
    
    private ArrayList<Missionario> missionarios;
    
    private boolean barco;
    
    public Margem(ArrayList<Canibal> canibais, ArrayList<Missionario> missionarios, boolean barco) {
        this.setBarco(barco);
        this.setCanibais(canibais);
        this.setMissionarios(missionarios);
    }    
    
    public ArrayList<Canibal> getCanibais() {
        return canibais;
    }
    
    public void setCanibais(ArrayList<Canibal> canibais) {
        this.canibais = canibais;
    }
    
    public ArrayList<Missionario> getMissionarios() {
        return missionarios;
    }
    
    public void setMissionarios(ArrayList<Missionario> missionarios) {
        this.missionarios = missionarios;
    }
    
    public boolean isBarco() {
        return barco;
    }
    
    public void setBarco(boolean barco) {
        this.barco = barco;
    }
    
}
