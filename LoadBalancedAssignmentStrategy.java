package src;
import java.util.List;



public class LoadBalancedAssignmentStrategy implements CaseAssignmentStrategy {
    @Override
    public void assignCase(Case caseToAssign, List<Judge> judges) {
        Judge leastBusyJudge = judges.get(0);
        for (Judge judge : judges) {
            if (judge.getAssignedCases().size() < leastBusyJudge.getAssignedCases().size()) {
                leastBusyJudge = judge;
            }
        }
        leastBusyJudge.assignCase(caseToAssign);
        System.out.println("Case " + caseToAssign.getCaseId() + " assigned to Judge " + leastBusyJudge.getName() + " for load balancing.");
    }
}
