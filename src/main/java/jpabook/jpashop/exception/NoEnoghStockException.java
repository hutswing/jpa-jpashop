package jpabook.jpashop.exception;

public class NoEnoghStockException extends RuntimeException {

    public NoEnoghStockException() {
        super();
    }

    public NoEnoghStockException(String message) {
        super(message);
    }

    public NoEnoghStockException(String message, Throwable cause) {
        super(message, cause);
    }

    public NoEnoghStockException(Throwable cause) {
        super(cause);
    }
}
