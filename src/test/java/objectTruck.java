import java.io.*;
public class ObjectTruck {

    public static void main(String[] args)
            throws IOException {
        Truck gazelle = new Truck(500, "Газель");

        BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите вес вашего заказа:\n");
        String res = obj.readLine();

        System.out.println("Вес заказа: " + res);

        Gazelle.calculate(400);
        Gazelle.printParameters();
        Truck kamaz = new Truck(4500, "Камаз");
        Kamaz.printParameters();
        Kamaz.calculate(3000);

    }
}
