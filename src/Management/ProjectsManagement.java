package Management;

import java.util.ArrayList;

public class ProjectsManagement {

    private final ArrayList<Project> projects;

    public ProjectsManagement() {
        projects = new ArrayList<>();
    }

    public void addProjects(Project project) {
        projects.add(project);
    }

    public void showProjects() {
        if (projects.isEmpty()) {
            System.out.println("No projects available.");
        } else {
            for (Project project : projects) {
                System.out.println("Project Name: " + project.getProjectName() + ", Budget: " + project.getBudgetProject() + "Developers: " + project.getDevelopers());
            }
        }
    }
}
