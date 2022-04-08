package dto;

public class Account {
    String accountName;
    String website;
    String type;
    String phone;
    String fax;
    String parentAccount;
    String employees;
    String industry;
    String description;
    String shippingStreet;

    public Account(String accountName, String website, String type, String phone, String fax, String parentAccount,
                   String employees, String industry, String description, String shippingStreet) {
        this.accountName = accountName;
        this.website = website;
        this.type = type;
        this.phone = phone;
        this.fax = fax;
        this.parentAccount = parentAccount;
        this.employees = employees;
        this.industry = industry;
        this.description = description;
        this.shippingStreet = shippingStreet;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
