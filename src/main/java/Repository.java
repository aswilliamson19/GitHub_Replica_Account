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

    public void setDescription(String description) {
        this.description = description;
    }

    public RepositoryType getRepositoryType() {
        return this.repoType;
    }

    public ArrayList<Commit> getCommits() {
        return this.commits;
    }

}
