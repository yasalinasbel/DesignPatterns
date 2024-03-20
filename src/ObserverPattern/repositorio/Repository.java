package ObserverPattern.repositorio;

public interface Repository {
    void addObserver(RepositoryObserver observer);
    void removeObserver(RepositoryObserver observer);
    void commit(String commitMessage);
    void merge(String branchName);

}
