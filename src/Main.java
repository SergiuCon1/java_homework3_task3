public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        double loanTermIsOneYear = service.calculate(12);
        System.out.println("Ежемесячный платеж = " + loanTermIsOneYear + " рублей");

        double loanTermIsTwoYear = service.calculate(24);
        System.out.println("Ежемесячный платеж = " + loanTermIsTwoYear + " рублей");

        double loanTermIsThreeYear = service.calculate(36);
        System.out.println("Ежемесячный платеж = " + loanTermIsThreeYear + " рублей");
    }
}
