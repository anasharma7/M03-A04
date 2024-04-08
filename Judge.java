package src;

import java.util.ArrayList;
import java.util.List;

public class Judge {
    private String judgeId;
    private String name;
    private String specialization;
    private List<Case> assignedCases;

    // Constructor
    public Judge(String judgeId, String name, String specialization) {
        this.judgeId = judgeId;
        this.name = name;
        this.specialization = specialization;
        this.assignedCases = new ArrayList<>();
    }

    // Assign a new case to the judge
    public void assignCase(Case newCase) {
        assignedCases.add(newCase);
    }

    // Clear all assigned cases
    public void clearAssignedCases() {
        assignedCases.clear();
    }

    // Getters and Setters
    public String getJudgeId() {
        return judgeId;
    }

    public void setJudgeId(String judgeId) {
        this.judgeId = judgeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public List<Case> getAssignedCases() {
        return assignedCases;
    }

    // toString override for better readability when printing Judge objects
    @Override
    public String toString() {
        return "Judge{" +
                "judgeId='" + judgeId + '\'' +
                ", name='" + name + '\'' +
                ", specialization='" + specialization + '\'' +
                ", assignedCases=" + assignedCases +
                '}';
    }
}
