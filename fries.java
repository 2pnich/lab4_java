import java.util.Scanner;
public class fries {
    public String fries_type;
    public int fries_quantity;
    public float fries_price;


    public fries(){
        this.fries_type = "type";
        this.fries_quantity = 0;
        this.fries_price = 0;
    }

    public void input(){
        Scanner in = new Scanner(System.in);
        while (!fries_type.equalsIgnoreCase("фри") && !fries_type.equalsIgnoreCase("деревенская") && !fries_type.equalsIgnoreCase("-")) {
            System.out.println("Введите вид картошки(фри/деревенская)");
            fries_type = in.nextLine();
        }
        System.out.println("Введите количество фри");
        fries_quantity = in.nextInt();
        System.out.println("Введите цену фри");
        fries_price = in.nextFloat();
    }
    public void output(){
        System.out.println("Вид фри: " + fries_type + " количества: " + fries_quantity + " цена:" + fries_price);
    }
}
