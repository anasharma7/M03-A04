package src;
import java.util.List;

public interface CaseAssignmentStrategy {
    void assignCase(Case caseToAssign, List<Judge> judges);
}
