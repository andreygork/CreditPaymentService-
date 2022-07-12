public class CreditPaymentService {
    public double calculate(double amount, double percent , double term) {
        double termMonth = term * 12 ;
        double percentMonth = percent / 1200;
        double month = Math.pow(1 + percentMonth, termMonth);
        double payment = amount * ((percentMonth * month) / (month - 1));

        return payment;
    }
}