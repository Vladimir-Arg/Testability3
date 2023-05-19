public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        double summCredit = 1_000_000;
        double creditPeriodYear = 2;
        int payForMonth = (int) service.calculate(summCredit, creditPeriodYear);
        System.out.println("Ежемесячный платеж, при сумме кредита " + summCredit + "руб. и сроке кредита " + creditPeriodYear + "года, составит " + payForMonth + "руб.");
        System.out.println("Сумма платежа | Срок кредита(лет) | Ежемесячный платеж");
        System.out.println();
        int payForMonthOneYear = (int) service.calculate(1_000_000, 1);
        System.out.println("1 000 000 | 1 |" + payForMonthOneYear);
        int payForMonthTwoYears = (int) service.calculate(1_000_000, 2);
        System.out.println("1 000 000 | 1 |" + payForMonthTwoYears);
        int payForMonthThreeYears = (int) service.calculate(1_000_000, 3);
        System.out.println("1 000 000 | 1 |" + payForMonthThreeYears);
    }
}