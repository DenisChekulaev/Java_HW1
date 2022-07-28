import java.io.*;
public class objectTruck {

    public static void main(String[] args)
            throws IOException {
        Truck Gazelle = new Truck(500, "Газель");

        BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите вес вашего заказа:\n");
        String res = obj.readLine();

        System.out.println("Вес заказа: " + res);

        Gazelle.calculete(400);
        Gazelle.printParametersAvto();
        Truck Kamaz = new Truck(4500, "Камаз");
        Kamaz.printParametersAvto();
        Kamaz.calculete(3000);

    }
}
