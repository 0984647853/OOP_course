public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction() {
        this.numerator =0;
        this.denominator=1;
    }

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
        if (this.denominator==0) this.denominator=1;
    }
    public String toString(){
        return this.numerator+"/"+this.denominator;
    }
    public double toDouble(){
        return (double) this.numerator/this.denominator;
    }
    public Fraction multiply(Fraction multiplier){
        Fraction a = new Fraction();
        a.numerator= this.numerator*multiplier.numerator;
        a.denominator= this.denominator*multiplier.denominator;
        return a;
    }
}
