package org.example;

public class CreditHistory extends LoanRequest {
    public CreditHistory(int level) {
        this.level = level;
    }

    @Override
    protected void handleLoanRequest(String loanRequest) {
        System.out.println("Credit History handing loan request: " + loanRequest);
    }
}
