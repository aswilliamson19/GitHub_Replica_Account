import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RepositoryTest {

    public Repository repository1;
    public Commit commit1;
    public Commit commit2;
    public Commit commit3;

    @Before
    public void before(){
        repository1 = new Repository("Card_Game_Lab", "Black Jack card game developed using Java", RepositoryType.PUBLIC);
        commit1 = new Commit("Initial commit", CommitType.WORKING, 123);
        commit2 = new Commit("Enums created", CommitType.TESTED, 124);
        commit3 = new Commit("5 tests passed", CommitType.TESTED, 125);

        repository1.addCommit(commit1);
        repository1.addCommit(commit2);
        repository1.addCommit(commit3);
    }

    @Test
    public void canGetRepoName(){
        assertEquals("Card_Game_Lab", repository1.getName());
    }

    @Test
    public void canGetDescription(){
        assertEquals("Black Jack card game developed using Java", repository1.getDescription());
    }

    @Test
    public void canGetRepoType(){
        assertEquals(RepositoryType.PUBLIC, repository1.getRepositoryType());
    }

    @Test
    public void canGetCommits(){
        assertEquals(3, repository1.getCommits());
    }

    @Test
    public void canGetCommitById(){
        assertEquals(commit1, repository1.findCommitById(123));
    }

}
