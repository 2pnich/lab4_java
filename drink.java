import java.util.Scanner;
public class drink {
    public String drink_type;
    public float drink_volume;
    public float drink_price;

    public drink() {
        this.drink_type = "type";
        this.drink_volume = 0;
        this.drink_price = 0;
    }
    public void input(){
        Scanner in = new Scanner(System.in);
        while (!drink_type.equalsIgnoreCase("кофе") && !drink_type.equalsIgnoreCase("кола") && !drink_type.equalsIgnoreCase("-")) {
            System.out.println("Введите вид напитка(кофе/кола/-)");
            drink_type = in.nextLine();
        }
        System.out.println("Введите объем напитка");
        drink_volume = in.nextFloat();
        System.out.println("Введите цену напитка");
        drink_price = in.nextFloat();
    }
    public void output(){
        System.out.println("Вид напитка: " + drink_type + " объем: " + drink_volume + " цена: " + drink_price);
    }
}
