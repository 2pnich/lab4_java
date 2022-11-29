import java.util.Scanner;
public class pizza {
    public String pizza_type;
    public float pizza_diameter;
    public float pizza_price;

    public pizza(){
        this.pizza_type = "type";
        this.pizza_diameter = 0;
        this.pizza_price = 0;
    }

    public void input(){
        Scanner in = new Scanner(System.in);
        while (!pizza_type.equalsIgnoreCase("гавайская") && !pizza_type.equalsIgnoreCase("пепперони") && !pizza_type.equalsIgnoreCase("-")) {
            System.out.println("Введите вид пиццы(пепперони/гавайская/-");
            pizza_type = in.nextLine();
        }
        System.out.println("Введите диаметр пиццы");
        pizza_diameter = in.nextFloat();
        System.out.println("Введите цену пиццы");
        pizza_price = in.nextFloat();
    }

    public void output(){
        System.out.println("Вид пиццы: " + pizza_type + " диаметр: " + pizza_diameter + " цена: " + pizza_price);
    }
}
