public class main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        double summCredit = 1_000_000;
        double creditPeriodYear = 2;
        int payForMonth = (int) service.calculate(summCredit, creditPeriodYear);
        System.out.println("Ежемесячный платеж, при сумме кредита " + summCredit + "руб. и сроке кредита " + creditPeriodYear + "года, составит " + payForMonth + "руб.");

        System.out.println();
        System.out.println("Сумма платежа | Срок кредита(лет) | Ежемесячный платеж");

        int payForMonthOneYear = (int) service.calculate(1_000_000, 1);
        System.out.println("1 000 000 | 1 |" + payForMonthOneYear);

        int payForMonthTwoYears = (int) service.calculate(1_000_000, 2);
        System.out.println("1 000 000 | 2 |" + payForMonthTwoYears);

        int payForMonthThreeYears = (int) service.calculate(1_000_000, 3);
        System.out.println("1 000 000 | 3 |" + payForMonthThreeYears);

        int payForMonthFourYears = (int) service.calculate(1_000_000, 4);
        System.out.println("1 000 000 | 4 |" + payForMonthFourYears);

        int payForMonthFiveYears = (int) service.calculate(1_000_000, 5);
        System.out.println("1 000 000 | 5 |" + payForMonthFiveYears);

    }
}

