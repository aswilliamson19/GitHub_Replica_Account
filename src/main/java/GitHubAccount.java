public class GitHubAccount {

    private String username;
    private String name;
    private String accountType;

    public GitHubAccount(String username, String name, String accountType){
        this.username = username;
        this.name = name;
        this.accountType = "Free";
    }

    public String getUsername(){
        return this.username;
    }

    public String getName() {
        return this.name;
    }

    public String getAccountType() {
        return this.accountType;
    }

    public String upgradeAccount() {
        return this.accountType = "Pro";
    }

    public String downgradeAccount() {
        return this.accountType = "Free";
    }
}
