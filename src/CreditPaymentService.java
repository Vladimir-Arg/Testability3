public class CreditPaymentService {
    public double calculate(double summCredit, double creditPeriodYear) {
        double percent = 9.99;
        double creditPeriodMonth = creditPeriodYear * 12; // n
        double monthPercent = (percent / 12 / 100); // ПС
        double paymentMounth = (summCredit * monthPercent * Math.pow((1 + monthPercent), creditPeriodMonth) / (Math.pow((1 + monthPercent), creditPeriodMonth) - 1));
        return paymentMounth;
    }
}
/*
Формула расчета аннуитетного платежа:
ЕП = С * ПС * (1 + ПС)^n / ((1 + ПС)^n - 1), где
ЕП - размер ежемесячного платежа
С - сумма займа
ПС - месчная ставка по займу (годовая ставка / 12 / 100 )
n - срок кредита в месяцах

 */