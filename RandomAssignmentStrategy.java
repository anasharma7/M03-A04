package src;

import java.util.List;
import java.util.Random;

public class RandomAssignmentStrategy implements CaseAssignmentStrategy {
    @Override
    public void assignCase(Case caseToAssign, List<Judge> judges) {
        Random random = new Random();
        Judge selectedJudge = judges.get(random.nextInt(judges.size()));
        selectedJudge.assignCase(caseToAssign);
        System.out.println("Case " + caseToAssign.getCaseId() + " assigned to Judge " + selectedJudge.getName() + " randomly.");
    }
}
