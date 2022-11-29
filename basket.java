import java.util.Scanner;
import static java.lang.Math.abs;

public class basket {
    public static int counter = 0;
    private static shaurma shaurma;
    private static pizza pizza;
    private static drink drink;
    private static soup soup;
    private static fries fries;

    public basket(shaurma _shaurma, pizza _pizza, drink _drink, soup _soup, fries _fries){
        shaurma = _shaurma;
        pizza = _pizza;
        drink = _drink;
        soup = _soup;
        fries = _fries;
    }

    public void input() {
        shaurma.input();
        pizza.input();
        drink.input();
        soup.input();
        fries.input();
    }

    public void output() {
        shaurma.output();
        pizza.output();
        drink.output();
        soup.output();
        fries.output();
    }

    public static void sum(help sum){
        sum.res = shaurma.sh_price + pizza.pizza_price + drink.drink_price + soup.soup_price + fries.fries_price;
        System.out.println("сумма: " + sum.res);
    }

    public static void payment(help sum){
        float money, change;
        System.out.println("Введите полученную от покупателя сумму");
        Scanner in = new Scanner(System.in);
        money = in.nextFloat();
        change = money - sum.res;
        if (change > 0)
            System.out.println("сдача " + change);
        if (change < 0)
            System.out.println("сдача " + abs(change));
        if (change == 0)
            System.out.println("Без сдачи");
    }
}
