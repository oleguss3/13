public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        int creditSumm = 1_000_000;
        double creditPercent = 9.99;

        printCreditInfo(service, creditSumm, creditPercent, 1);
        printCreditInfo(service, creditSumm, creditPercent, 2);
        printCreditInfo(service, creditSumm, creditPercent, 3);
    }

    public static void printCreditInfo(CreditPaymentService service, int amount, double percent, int years) {
        int months = years * 12;
        int monthlyPayment = service.calculate(amount, percent, months);

        System.out.println("Сумма кредита на " + years + " год(а): " +
                amount + ", Ежемесячный платёж: " + monthlyPayment +
                ", Процентная ставка: " + percent + "%");
    }
}
