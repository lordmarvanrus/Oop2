public class Bicycle extends Vehicle implements Service{
    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
    @Override
    public void check() {
            System.out.println("Обслуживаем " + getModelName());
            for (int i = 0; i < getWheelsCount(); i++) {
                System.out.println("Меняем покрышку");
            }
        System.out.println();
            }
    }
