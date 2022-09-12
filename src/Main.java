public class Main {
    public static void main(String[] args) {

        // perMonth ежемес ставка
        double perMonth = 9.99 / 12;  // i
        System.out.println("Ежемесячная ставка:" + perMonth);


        // degree (1 + i)^12
        double a = 1 + perMonth;
        double n = 24;
//        double a = 3;
//        double n = 3;

        double degree = (double) Math.pow(a, n);  // переменная для числа в степени
        System.out.println("Знаменатель (1 + i) ^ 12) = " +  degree);


        // формула
        int annuity = (int) (1000000000 * ((perMonth * degree) / ( degree - 1)));
        System.out.println("Аннуитетный платеж равен:" + annuity);

    }







    }

