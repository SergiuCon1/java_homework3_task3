public class CreditPaymentService {
    public double calculate(int loanTerm) {
        long loanAmount = 1_000_000;
        double interestRateForOneMonth = 9.99 / (100 * 12);
        int interestPeriodsUntilTheEndOfTheLoanTerm = loanTerm * (-1);
        double exponentiation = Math.pow((1 + interestRateForOneMonth), interestPeriodsUntilTheEndOfTheLoanTerm);

        long monthlyPaymentAmount = (long) (loanAmount * (interestRateForOneMonth / (1 - (exponentiation))));
        return monthlyPaymentAmount;
    }
}
