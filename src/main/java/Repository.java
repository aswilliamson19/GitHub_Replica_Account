import java.util.ArrayList;

public class Repository {

    private String name;
    private String description;
    private RepositoryType repoType;
    private ArrayList<Commit> commits;

    public Repository(String name, String description, RepositoryType repoType){
        this.name = name;
        this.description = description;
        this.repoType = repoType;
        this.commits = new ArrayList<Commit>();
    }

    public String getName() {
        return this.name;
    }

    public String getDescription() {
        return this.description;
    }

    public RepositoryType getRepositoryType() {
        return this.repoType;
    }

    public int getCommits() {
        return this.commits.size();
    }

    public void addCommit(Commit commit) {
        commits.add(commit);
    }

    public Commit findCommitById(int uniqueId, ArrayList<Commit> commits) {
        if (commits.contains(uniqueId)) {
            return Commit;
        } else {
            return null;
        }
    }


}
