import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RepositoryTest {

    public Repository repository1;

    @Before
    public void before(){
        repository1 = new Repository("Card_Game_Lab", "Black Jack card game developed using Java", RepositoryType.PUBLIC);
    }

    @Test
    public void canGetRepoName(){
        assertEquals("Card_Game_Lab", repository1.getName());
    }
}
