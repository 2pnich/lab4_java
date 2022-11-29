import java.util.Scanner;
public class soup {
    public String soup_type;
    public float soup_price;

    public soup(){
        this.soup_type = "type";
        this.soup_price = 0;
    }

    public void input(){
        Scanner in = new Scanner(System.in);
        while (!soup_type.equalsIgnoreCase("борщ") && !soup_type.equalsIgnoreCase("харча") && !soup_type.equalsIgnoreCase("-")) {
            System.out.println("Введите вид супа(борщ/харча/-");
            soup_type = in.nextLine();
        }
        System.out.println("Введите цену супа");
        soup_price = in.nextFloat();
    }
    public void output(){
        System.out.println("Вид супа: " + soup_type + " цена: " + soup_price);
    }
}
