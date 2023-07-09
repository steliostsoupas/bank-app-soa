package service.exceptions;

import model.Account;

public class IbanAlreadyExistsException extends Throwable {
    private final static long serialVersionUID = 1L;

    public IbanAlreadyExistsException(Account account) {
        super("Account with iban number " + account.getIban() + " already exists");
    }
}
