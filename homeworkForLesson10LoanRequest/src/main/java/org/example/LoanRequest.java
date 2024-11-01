package org.example;

public abstract class LoanRequest {
    public static int DOCUMENTS = 1, CREDIT_HISTORY = 2, LEVEL_SOLVENCY = 3, EMPLOYMENT = 4, AGE = 5;
    protected int level;
    protected LoanRequest nextLevelLoanRequest;
    public void setNextLevelLoanRequest(LoanRequest nextLevelLoanRequest) {
        this.nextLevelLoanRequest = nextLevelLoanRequest;
    }
    public void makeLoanRequest(int level,String loanRequest) {
        if (this.level == level)
            handleLoanRequest(loanRequest);
        else if (nextLevelLoanRequest != null)
            nextLevelLoanRequest.makeLoanRequest(level, loanRequest);

    }

    protected abstract void handleLoanRequest(String loanRequest);
}


