package be.vdab.composite;

import java.util.ArrayList;
import java.util.List;

public class SubProject implements Project{
    private final List<Project> projecten = new ArrayList<>();
    void add(Project project){
        projecten.add(project);

    }
   @Override
    public double getKosten() {
        return projecten.stream()
                .mapToDouble(kost -> kost.getKosten()).sum();
    }
}
