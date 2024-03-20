package ObserverPattern.repositorio;

public class LoggerObserver implements RepositoryObserver {
    private String name;

    public LoggerObserver(String name){
        this.name=name;
    }

    @Override
    public void onCommit(String commitMessage) {
        System.out.println(name+"Se realizó un commit. Mensaje:"+ commitMessage);
    }

    @Override
    public void onMerge(String branchName) {
        System.out.println(name+":Se realizó un merge en la rama: "+ branchName);

    }
}
