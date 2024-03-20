package ObserverPattern.repositorio;

import java.util.ArrayList;
import java.util.List;

public class GitRepository implements  Repository{

    private List<RepositoryObserver> observers=new ArrayList<>();
    @Override
    public void addObserver(RepositoryObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(RepositoryObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void commit(String commitMessage) {
        System.out.println("Realizando commit: "+ commitMessage);
        notifyCommitObservers(commitMessage);
    }


    @Override
    public void merge(String branchName) {
        System.out.println("Realizando merge en la rama: "+ branchName);
        notifyMergeObservers(branchName);
    }

    private void notifyCommitObservers(String commitMessage) {
        for(RepositoryObserver observer:observers){
            observer.onCommit(commitMessage);
        }
    }
    private void notifyMergeObservers(String branchName){
        for(RepositoryObserver observer:observers){
            observer.onMerge(branchName);
    }
        }

}
