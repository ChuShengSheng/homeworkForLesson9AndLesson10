package org.example;

public class Age extends LoanRequest {
    public Age (int level) {
        this.level = level;
    }

    @Override
    protected void handleLoanRequest(String loanRequest) {
        System.out.println("Age handing loan request: " + loanRequest);
    }
}
