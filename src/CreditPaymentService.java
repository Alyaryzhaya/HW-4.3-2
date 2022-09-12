public class CreditPaymentService {

    public double calculate(double perYear, int credit, int n) { // метод и входные параметры (ставка в год, сумма кредита, количество платежей)

        double perMonth = perYear / 12 / 100; // ставка в месяц


        double annuity = credit * ((perMonth * Math.pow(1 + perMonth, n)) / (Math.pow(1 + perMonth, n) - 1));

        return annuity;


        //=============================================================

        
        //n = 12; // количество платежей
        //credit = 1000000;  // сумма кредита
        // double a = 1 + perMonth; // число для возведения в степень (1 + perMonth) ^ n;
        // System.out.println(Math.pow(1 + perMonth, n)); // переменная для степени числа


    }

    /*
    1_000_000  -сумма кредита
    1 год = 12 месяцев  -срок кредита
    9,99%  -процентная ставка
   + P = 9.99 / 12 /100 - ежемес ставка по процентам
    denominator = (1 + month)^12 -1

    мес платеж = сумма кредита * (ежемес.ставка по процентам + (ежем ставка по процентам / (1 + ежем ставка)^на сколько мес кредит - 1)

         */

//    public static int pow(int denominator, int powDenominator) {

//        return (int) Math.pow(p, denominator);
}






