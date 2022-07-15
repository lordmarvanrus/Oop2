public class Bicycle extends Vehicle implements Service{
    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
    @Override
    public void check() {
            ServiceStation.updateTyres(getWheelsCount(), getModelName());
        System.out.println();
            }
    }
