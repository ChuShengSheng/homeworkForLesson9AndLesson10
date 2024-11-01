package org.example;

public class Employment extends LoanRequest {
    public Employment (int level) {
        this.level = level;
    }

    @Override
    protected void handleLoanRequest(String loanRequest) {
        System.out.println("Employment handing loan request: " + loanRequest);
    }
}
