import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //float sum;
        int option = 0, i = 0;

        basket[] bas = new basket[20];

        while (option != 4) {
            System.out.println("\nВвести заказ - 1");
            System.out.println("Вывести все заказы - 2");
            System.out.println("Выход - 3");
            Scanner in = new Scanner(System.in);
            option = in.nextInt();
            help res = new help();
            switch (option) {
                case (1):
                    shaurma _shaurma = new shaurma();
                    pizza _pizza = new pizza();
                    drink _drink = new drink();
                    soup _soup = new soup();
                    fries _fries = new fries();

                    //МАССИВ ОБЪЕКТОВ
                    bas[i] = new basket(_shaurma, _pizza, _drink, _soup, _fries);
                    bas[i].input();
                    bas[i].output();
                    basket.sum(res);
                    basket.payment(res);
                    i++;
                    basket.counter++;
                    break;
                case (2):
                    for (int j = 0; j < basket.counter; j++) {
                        //if (bas[j] != null) {
                        bas[j].output();
                        bas[j].sum(res);
                        System.out.println("\n");
                        //}
                    }
                    break;
                case (3):
                    System.exit(0);
            }
        }
    }
}