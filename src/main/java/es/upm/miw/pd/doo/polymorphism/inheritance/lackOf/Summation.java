package es.upm.miw.pd.doo.polymorphism.inheritance.lackOf;

public class Summation extends Operation {
    public Summation(final int operator1, final int operator2) {
        super(operator1, operator2);
        this.sign= "+";
    }

    private int sum() {
        return this.operator1 + this.operator2;
    }

	@Override
	public int operar() {
		return sum();
	}

}
