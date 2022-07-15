public class ServiceStation {
            static void checkEngine() {
                System.out.println("Проверяем двигатель");
            }
            static void updateTyres(int tires, String modelName) {
                System.out.println("Обслуживаем " + modelName);
                for (int i = 0; i < tires; i++) {
                    System.out.println("Меняем покрышку");
                }
            }
            static void checkTrailer () {
                System.out.println("Проверяем прицеп");
            }
        }