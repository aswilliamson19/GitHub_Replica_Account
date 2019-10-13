import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CommitTest {

    public Commit commit1;
    public Commit commit2;
    public Commit commit3;

    @Before
    public void before(){
        commit1 = new Commit("Initial commit", CommitType.WORKING, 123);
        commit2 = new Commit("Enums created", CommitType.TESTED, 124);
        commit3 = new Commit("5 tests passed", CommitType.TESTED, 125);
    }

    @Test
    public void canGetDescripton(){
        assertEquals("Initial commit", commit1.getDescription());
    }

    @Test
    public void canGetCommitType(){
        assertEquals(CommitType.TESTED, commit2.getCommitType());
    }

    @Test
    public void canGetUniqueId(){
        assertEquals(125, commit3.getUniqueId());
    }

}
