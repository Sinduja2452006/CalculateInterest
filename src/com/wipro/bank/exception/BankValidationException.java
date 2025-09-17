package com.wipro.bank.exception;

public class BankValidationException extends Exception {
    private static final long serialVersionUID = 1L; // Prevents serialization warning

    @Override
    public String toString() {
        return "Invalid data"; 
    }
}
