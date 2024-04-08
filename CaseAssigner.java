package src;

import java.util.List;



public class CaseAssigner {
    private CaseAssignmentStrategy strategy;

    public CaseAssigner(CaseAssignmentStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(CaseAssignmentStrategy strategy) {
        this.strategy = strategy;
    }

    public void assignCaseToJudge(Case caseToAssign, List<Judge> judges) {
        strategy.assignCase(caseToAssign, judges);
    }
}
