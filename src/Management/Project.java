package Management;

import java.util.ArrayList;

public class Project {

    private String projectName;
    private double budgetProject;
    private final ArrayList<Developer> developers;

    public Project(String projectName, double budgetProject, ArrayList<Developer> developers) {
        this.projectName = projectName;
        this.budgetProject = budgetProject;
        this.developers = developers;
    }

    public ArrayList<Developer> getDevelopers() {
        return developers;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public double getBudgetProject() {
        return budgetProject;
    }

    public void setBudgetProject(double budgetProject) {
        this.budgetProject = budgetProject;
    }

    public void addDeveloper(Developer d) {
        developers.add(d);
    }

    @Override
    public String toString() {
        return "Project{" + "projectName=" + projectName + ", budgetProject=" + budgetProject + ", developers=" + developers + '}';
    }

}
