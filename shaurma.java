import java.util.Scanner;
public class shaurma {
    public String sh_type;
    public float sh_weight;
    public float sh_price;

    public shaurma(){
        this.sh_type = "type";
        this.sh_weight = 0;
        this.sh_price = 0;
    }

    public void input(){
        Scanner in = new Scanner(System.in);
        do {
            System.out.println("Введите вид шаурмы(пролетарская/студенческая/-)");
            sh_type = in.nextLine();
        } while (!sh_type.equalsIgnoreCase("пролетарская") && !sh_type.equalsIgnoreCase("студенческая") && !sh_type.equalsIgnoreCase("-"));
        System.out.println("Введите вес шаурмы");
        sh_weight = in.nextFloat();
        System.out.println("Введите цену шаурмы");
        sh_price = in.nextFloat();
    }

    public void output(){
        System.out.println("Вид шаурмы: " + sh_type + " Вес: " + sh_weight + " цена " + sh_price);
    }
}
