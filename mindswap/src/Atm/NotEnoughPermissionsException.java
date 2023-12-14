package Atm;

public class NotEnoughPermissionsException extends ATMException {
    public NotEnoughPermissionsException(String message) {
        super(message);
    }
}
