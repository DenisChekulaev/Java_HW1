public class Truck {
    int maxMass;
    String model;


    public Truck(int maxMass, String model) { // Конструктор
        this.maxMass = maxMass;
        this.model = model;

    }

    void calculete(int res) {                 // Подор машины в завимости от веса груза
        if (res < 500) {
            System.out.println("На заказ приедет Газель");
        } else if (res >= 500 && res < 4500) {
            System.out.println("На заказ приедет Камаз");
        } else {
            System.out.println("Груз слишком большой, нет подходящих машин");
        }
    }

    void printParametersAvto() {      // Вывод парметров автомобиля
        System.out.println("Модель машины: " + model + "\nМаксимальная масса: " + maxMass);
    }
}
