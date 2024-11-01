package org.example;

public class Main {
    public static void main(String[] args) {
        LoanRequest loanRequest = chain();

        // Актуальность документов
        loanRequest.makeLoanRequest(LoanRequest.DOCUMENTS, "The documents are checked for this loan application");

        // Кредитная история
        loanRequest.makeLoanRequest(LoanRequest.CREDIT_HISTORY, "The credit history is checked for this loan application");

        // Уровень платежеспособности
        loanRequest.makeLoanRequest(LoanRequest.LEVEL_SOLVENCY, "The level solvency is checked for this loan application");

        // Трудовая занятость
        loanRequest.makeLoanRequest(LoanRequest.EMPLOYMENT, "The employment is checked for this loan application");

        // Возраст
        loanRequest.makeLoanRequest(LoanRequest.AGE,  "The age is checked for this loan application");
    }

    private static LoanRequest chain() {
        LoanRequest documents = new Documents(LoanRequest.DOCUMENTS);
        documents.setNextLevelLoanRequest(new CreditHistory(LoanRequest.CREDIT_HISTORY));
        documents.nextLevelLoanRequest.setNextLevelLoanRequest(new LevelSolvency(LoanRequest.LEVEL_SOLVENCY));
        documents.nextLevelLoanRequest.setNextLevelLoanRequest(new Employment(LoanRequest.EMPLOYMENT));
        documents.nextLevelLoanRequest.setNextLevelLoanRequest(new Age(LoanRequest.AGE));
        return documents;
    }
}