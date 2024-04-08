package src;
public class Case {
    private String caseId;
    private String caseType;
    private String partiesInvolved; // You could also use a List<Person> if you have a Person class
    private String caseDetails;
    private String status; // e.g., "Open", "Closed", "In Progress"

    // Constructor
    public Case(String caseId, String caseType, String partiesInvolved, String caseDetails) {
        this.caseId = caseId;
        this.caseType = caseType;
        this.partiesInvolved = partiesInvolved;
        this.caseDetails = caseDetails;
        this.status = "Open"; // default status
    }

    // Getters and Setters
    public String getCaseId() {
        return caseId;
    }

    public void setCaseId(String caseId) {
        this.caseId = caseId;
    }

    public String getCaseType() {
        return caseType;
    }

    public void setCaseType(String caseType) {
        this.caseType = caseType;
    }

    public String getPartiesInvolved() {
        return partiesInvolved;
    }

    public void setPartiesInvolved(String partiesInvolved) {
        this.partiesInvolved = partiesInvolved;
    }

    public String getCaseDetails() {
        return caseDetails;
    }

    public void setCaseDetails(String caseDetails) {
        this.caseDetails = caseDetails;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }


}
