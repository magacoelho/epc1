package es.upm.miw.pd.doo.polymorphism.inheritance.lackOf;

public class Subtraction extends Operation {
  
    public Subtraction(final int operator1, final int operator2) {
       super(operator1, operator2);
       this.sign="-";
        
    }

     public int subtract() {
        return this.operator1 - this.operator2;
    }

    @Override
    public String toString() {
        return "[" + operator1 + "-" + operator2 + "]";
    }

	@Override
	public int operar() {
		
		return subtract();
	}

}
