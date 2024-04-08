package src;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Initialize scanner and controllers
        Scanner scanner = new Scanner(System.in);
        LoginController loginController = new LoginController();
        LoginView loginView = new LoginView(loginController);

        // Show login view
        loginView.showLogin();

        // Check if the login was successful before proceeding
        if (loginController.getCurrentUser() != null) {
            // Create judges
            Judge judge1 = new Judge("J001", "Judge Judy", "Small Claims");
            Judge judge2 = new Judge("J002", "Judge Brown", "Criminal Law");
            // List of all judges for assignment strategies to use
            List<Judge> judges = Arrays.asList(judge1, judge2);

            // Create cases
            Case case1 = new Case("C001", "Theft", "Party A vs. Party B", "Details of the case");
            Case case2 = new Case("C002", "Contract Dispute", "Party C vs. Party D", "Details of the case");

            // Instantiate the context (CaseAssigner) with a RandomAssignmentStrategy
            CaseAssigner caseAssigner = new CaseAssigner(new RandomAssignmentStrategy());

            // Assign cases using the initial strategy
            System.out.println("Using Random Assignment Strategy:");
            caseAssigner.assignCaseToJudge(case1, judges);
            caseAssigner.assignCaseToJudge(case2, judges);

            // Print the assigned judges
            printAssignedJudges(judges);

            // Change the strategy to LoadBalancedAssignmentStrategy
            caseAssigner.setStrategy(new LoadBalancedAssignmentStrategy());
            
            // Clear the assigned cases from judges for demonstration purposes
            clearAssignedCasesFromJudges(judges);

            // Assign cases using the new strategy
            System.out.println("\nSwitching to Load Balanced Assignment Strategy:");
            caseAssigner.assignCaseToJudge(case1, judges);
            caseAssigner.assignCaseToJudge(case2, judges);

            // Print the assigned judges again
            printAssignedJudges(judges);
        } else {
            System.out.println("Authentication failed. Exiting the application.");
        }

        scanner.close();
    }

    private static void clearAssignedCasesFromJudges(List<Judge> judges) {
        for (Judge judge : judges) {
            judge.clearAssignedCases();
        }
    }

    private static void printAssignedJudges(List<Judge> judges) {
        for (Judge judge : judges) {
            System.out.println("Judge " + judge.getName() + " has been assigned the following cases: ");
            for (Case c : judge.getAssignedCases()) {
                System.out.println(c.getCaseId());
            }
        }
    }
}
