public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        double amount = 1_000_000;
        double term = 1;
        double percent = 9.99;

        System.out.println();
        System.out.println("Сумма ежемесячного платежа при расчете кредита на 12 месяцев и процентной ставкой 9,99% составляет: ");
        System.out.println((int) service.calculate(1_000_000, 9.99, 1));
        System.out.println();
        System.out.println("Сумма ежемесячного платежа при расчете кредита на 24 месяцев и процентной ставкой 9,99% составляет: ");
        System.out.println((int) service.calculate(1_000_000, 9.99, 2));
        System.out.println();
        System.out.println("Сумма ежемесячного платежа при расчете кредита на 36 месяцев и процентной ставкой 9,99% составляет: ");
        System.out.println((int) service.calculate(1_000_000, 9.99, 3));
    }
}