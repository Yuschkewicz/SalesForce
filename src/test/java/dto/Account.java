package dto;

public class Account {
    String accountName;
    String website;
    String type;

    public Account(String accountName, String website, String type) {
        this.accountName = accountName;
        this.website = website;
        this.type = type;
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
