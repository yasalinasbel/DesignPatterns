package ObserverPattern.repositorio;

public interface RepositoryObserver {
    void onCommit(String commitMessage);
    void onMerge(String branchName);
}
