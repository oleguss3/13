public class CreditPaymentService {

            public int calculate(int creditSumm, double crecitProcent, int months)
        {
                double everyMountPayment = crecitProcent / 12 / 100;

                double monthlyPayment = creditSumm *
                        (everyMountPayment * Math.pow(1 + everyMountPayment, months)) /
                        (Math.pow(1 + everyMountPayment, months) - 1);

                return (int) monthlyPayment; // округляем вниз
            }

}
