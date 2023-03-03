public class TaxCalculator2023 extends AbstractTaxCalculator {
    private double taxableIncome;

    public TaxCalculator2023(double taxableIncome) {
        this.taxableIncome = taxableIncome;
    }

    @Override
    public double calculateTax() {
        getTaxableIncome();
        return taxableIncome * 0.3;
    }
}
