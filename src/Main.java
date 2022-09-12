public class Main {
    public static void main(String[] args) {

        // perMonth ежемес ставка
        double perMonth = 9.99 / 12 / 100;  // i
        System.out.println("Ежемесячная ставка:" + perMonth);


        // degree (1 + i)^12
        double a = 1 + perMonth;
        double n = 36;


        double degree = (double) Math.pow(a, n);  // переменная для числа в степени
        System.out.println("Знаменатель (1 + i) ^ 12) = " +  degree);


        // формула
        double annuity = 1000000 * ((perMonth * degree) / ( degree - 1));

       //System.out.println("Аннуитетный платеж:" + annuity); // вывод на экран без округления
        System.out.printf("Аннуитетный платеж:" + "%.0f",annuity); // вывод на экран с фразой и округлением


    }







    }

