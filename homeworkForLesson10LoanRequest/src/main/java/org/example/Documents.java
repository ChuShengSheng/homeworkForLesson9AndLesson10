package org.example;

public class Documents extends LoanRequest {
    public Documents(int level) {
        this.level = level;
    }

    @Override
    protected void handleLoanRequest(String loanRequest) {
        System.out.println("Documents handing loan request: " + loanRequest);
    }
}
