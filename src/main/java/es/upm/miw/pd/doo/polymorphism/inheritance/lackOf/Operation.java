package es.upm.miw.pd.doo.polymorphism.inheritance.lackOf;

public abstract class Operation {

	protected final int operator1;
	protected final int operator2;
	protected String sign;
    public Operation(int operator1, int operator2) {
		this.operator1 = operator1;
		this.operator2 = operator2;
	}

	public int getOperator1() {
	    return operator1;
	}

	public int getOperator2() {
	    return operator2;
	}
    abstract public int operar();
	@Override
	public String toString() {
	    return "[" + operator1 + sign + operator2 + "]";
	}

}