package homeworks.homework_7;

public class Exersise_3_FractionNumbers {

    private int nominator;
    private int denominator;

    public Exersise_3_FractionNumbers(int nominator, int dominator) {
        this.nominator = nominator;
        this.denominator = dominator;
    }

    public Exersise_3_FractionNumbers plus(Exersise_3_FractionNumbers num) {
        int nom = this.nominator * num.getDominator() + num.getNominator() * this.getDominator();
        int deNom = this.denominator * num.getDominator();
        return new Exersise_3_FractionNumbers(nom, deNom);
    }

    public Exersise_3_FractionNumbers minus(Exersise_3_FractionNumbers num) {
        int nom = this.nominator * num.getDominator() - num.getNominator() * this.getDominator();
        int deNom = this.denominator * num.getDominator();
        return new Exersise_3_FractionNumbers(nom, deNom);
    }

    public Exersise_3_FractionNumbers multiply(Exersise_3_FractionNumbers num) {
        int nom = this.nominator * num.getNominator();
        int deNom = this.denominator * num.getDominator();
        return new Exersise_3_FractionNumbers(nom, deNom);
    }

    public Exersise_3_FractionNumbers derive(Exersise_3_FractionNumbers num) {
        int nom = this.nominator * num.getDominator();
        int deNom = this.denominator * num.getNominator();
        return new Exersise_3_FractionNumbers(nom, deNom);

    }

    public int getNominator() {
        return nominator;
    }

    public void setNominator(int nominator) {
        this.nominator = nominator;
    }

    public int getDominator() {
        return denominator;
    }

    public void setDominator(int dominator) {
        this.denominator = dominator;
    }

    @Override
    public String toString() {
        return nominator + "/" + denominator;
    }
}
