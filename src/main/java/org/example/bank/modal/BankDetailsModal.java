package org.example.bank.modal;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "emp_id",
        "emp_name",
        "emp_email",
        "emp_photo",
        "branch_name",
        "bank_name"
})
public class BankDetailsModal {
    @JsonProperty("emp_id")
    private String empId;

    @JsonProperty("emp_name")
    private String empName;

    @JsonProperty("emp_email")
    private String empEmail;

    @JsonProperty("emp_photo")
    private String empPhoto;

    @JsonProperty("branch_name")
    private String branchName;

    @JsonProperty("bank_name")
    private int bankName;

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpEmail() {
        return empEmail;
    }

    public void setEmpEmail(String empEmail) {
        this.empEmail = empEmail;
    }

    public String getEmpPhoto() {
        return empPhoto;
    }

    public void setEmpPhoto(String empPhoto) {
        this.empPhoto = empPhoto;
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public int getBankName() {
        return bankName;
    }

    public void setBankName(int bankName) {
        this.bankName = bankName;
    }
}
