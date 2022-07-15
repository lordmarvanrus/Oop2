public class Truck extends Vehicle implements Service {
    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void check() {
        ServiceStation.updateTyres(getWheelsCount(), getModelName());
        ServiceStation.checkEngine();
        ServiceStation.checkTrailer();
        System.out.println();
    }
}
