package be.vdab.composite;

public class Main {
    public static void main(String[] args) {
        var project= new SubProject();
        project.add(new Grondstofkosten(12.3,59.1));
        project.add(new Arbeidskosten(14.5,40));
        var subProject = new SubProject();
        subProject.add(new Grondstofkosten(12.3,100));
        subProject.add(new Arbeidskosten(12.5,80));
        project.add(subProject);
        System.out.println(project.getKosten());
    }

}
