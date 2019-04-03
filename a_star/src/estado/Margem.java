package estado;

/**
 *
 * @author cinquenta
 */
public class Margem {

    private int canibais;

    private int missionarios;

    private boolean barco;

    public Margem(int canibais, int missionarios, boolean barco) {
        this.setBarco(barco);
        this.setCanibais(canibais);
        this.setMissionarios(missionarios);
    }

    public int getCanibais() {
        return canibais;
    }

    public void setCanibais(int canibais) {
        this.canibais = canibais;
    }

    public int getMissionarios() {
        return missionarios;
    }

    public void setMissionarios(int missionarios) {
        this.missionarios = missionarios;
    }

    public boolean isBarco() {
        return barco;
    }

    public void setBarco(boolean barco) {
        this.barco = barco;
    }

}
