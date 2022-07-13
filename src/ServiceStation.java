public interface ServiceStation {
            static void check(Car car) {
                System.out.println("Обслуживаем " + car.getModelName());
                for (int i = 0; i < car.getWheelsCount(); i++) {
                    car.updateTyre();
                }
                car.checkEngine();
            }
            static void check(Truck truck) {
                System.out.println("Обслуживаем " + truck.getModelName());
                for (int i = 0; i < truck.getWheelsCount(); i++) {
                    truck.updateTyre();
                }
                truck.checkEngine();
                truck.checkTrailer();
            }
            static void check (Bicycle bicycle) {
            System.out.println("Обслуживаем " + bicycle.getModelName());
            for (int i = 0; i < bicycle.getWheelsCount(); i++) {
                bicycle.updateTyre();
            }
        }
    }
