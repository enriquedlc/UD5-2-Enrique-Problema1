public class VeredaGT implements Vehicle{

    public String matricula;
    static final private float MAX_ENERGY = 10000.0f;
    public float energy = 10000.f;
    public int movementCount = 0;
    public final float ENERGY_DELTA;



    public VeredaGT(String matricula, float ENERGY_DELTA) {
        this.matricula = matricula;
        this.ENERGY_DELTA = ENERGY_DELTA;
    }

    @Override
    public float energyLevel() {
        return energy;
    }

    @Override
    public void recharge() {
        this.energy = MAX_ENERGY;
    }

    @Override
    public void move() {

    }

    @Override
    public String status() {
        return "El vehiulo " + this.matricula + "\t" +
               " tiene una carga de: " + energy + " (kWh)";
    }
}
