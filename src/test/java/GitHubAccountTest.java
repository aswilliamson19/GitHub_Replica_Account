import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GitHubAccountTest {

    public GitHubAccount account;

    @Before
    public void before(){
        account = new GitHubAccount("aswilliamson19", "Amanda Williamson", "Free");
    }

    @Test
    public void canGetUsername(){
        assertEquals("aswilliamson19", account.getUsername());
    }

    @Test
    public void canGetName(){
        assertEquals("Amanda Williamson", account.getName());
    }

    @Test
    public void canGetAccountType(){
        assertEquals("Free", account.getAccountType());
    }

    @Test
    public void canUpgradeAccountTyoe(){
        assertEquals("Pro", account.upgradeAccount());
    }

    @Test
    public void canDowngradeAccountType(){
        account = new GitHubAccount("aswilliamson19", "Amanda Williamson", "Pro");
        assertEquals("Free", account.downgradeAccount());
    }
}
