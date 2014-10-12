package es.upm.miw.pd.doo.polymorphism.inheritance.lackOf;

public class Operations {
    private Operation[]  operators = new Operation[10];

    public void add(Operation operator) {
        for (int i = 0; i < operators.length; i++) {
            if (operators[i] == null) {
                operators[i] = operator;

                return;
            }
        }
        return;
    }

    public void reset() {
        for (int i = 0; i < operators.length; i++) {
            operators[i] = null;
        }
    }

    // MAL DISEÑADO... MAL CODIFICADO
    public int total() {
        int result = 0;
        String separator = "";
        for (Operation operando : operators) {
            if (operando != null) {
                System.out.print(separator + operando.toString());
                 result+= operando.operar();
            }
            separator = "+";
        }
        System.out.print(">>> ");
        return result;
    }
}
