package ControleDeFluxo;

public class ParametrosInvalidosException extends Exception {
   
    public  ParametrosInvalidosException() {
        super("A variável UM é maior que a variável Dois");
    }

    public ParametrosInvalidosException(String message) {
        super(message);
    }
}


