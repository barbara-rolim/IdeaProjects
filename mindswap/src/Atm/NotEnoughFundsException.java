package Atm;

public class NotEnoughFundsException extends ATMException {
    public NotEnoughFundsException(String message) {
        super(message);
    }
}