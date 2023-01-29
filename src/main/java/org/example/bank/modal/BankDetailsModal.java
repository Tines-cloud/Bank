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
    private String emp_id;

    @JsonProperty("emp_name")
    private String emp_name;

    @JsonProperty("emp_email")
    private String emp_email;

    @JsonProperty("emp_photo")
    private String emp_photo;

    @JsonProperty("branch_name")
    private String branch_name;

    @JsonProperty("bank_name")
    private int bank_name;

    public String getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(String emp_id) {
        this.emp_id = emp_id;
    }

    public String getEmp_name() {
        return emp_name;
    }

    public void setEmp_name(String emp_name) {
        this.emp_name = emp_name;
    }

    public String getEmp_email() {
        return emp_email;
    }

    public void setEmp_email(String emp_email) {
        this.emp_email = emp_email;
    }

    public String getEmp_photo() {
        return emp_photo;
    }

    public void setEmp_photo(String emp_photo) {
        this.emp_photo = emp_photo;
    }

    public String getBranch_name() {
        return branch_name;
    }

    public void setBranch_name(String branch_name) {
        this.branch_name = branch_name;
    }

    public int getBank_name() {
        return bank_name;
    }

    public void setBank_name(int bank_name) {
        this.bank_name = bank_name;
    }
}
