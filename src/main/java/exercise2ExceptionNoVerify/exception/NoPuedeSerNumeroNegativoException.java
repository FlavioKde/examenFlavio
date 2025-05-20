package exercise2ExceptionNoVerify.exception;

public class NoPuedeSerNumeroNegativoException extends RuntimeException {
    public NoPuedeSerNumeroNegativoException(String message) {
        super(message);
    }
}
