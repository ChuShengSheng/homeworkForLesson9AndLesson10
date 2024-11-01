package org.example;

public class LevelSolvency extends LoanRequest {
    public LevelSolvency (int level) {
        this.level = level;
    }

    @Override
    protected void handleLoanRequest(String loanRequest) {
        System.out.println("Level Solvency handing loan request: " + loanRequest);
    }
}
