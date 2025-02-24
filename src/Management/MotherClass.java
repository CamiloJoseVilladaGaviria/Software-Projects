package Management;

import java.util.ArrayList;
import java.util.Scanner;

public class MotherClass {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ProjectsManagement pm = new ProjectsManagement();
        boolean flag = true;
        while (flag) {
            System.out.println("Menu");
            System.out.println("1 - Add Project");
            System.out.println("2 - Show Projects");
            System.out.println("3 - Exit ");
            int option = in.nextInt();
            switch (option) {
                case 1:
                    System.out.println("In Project Name");
                    String projectName = in.next();
                    System.out.println("In Budget Project");
                    double budgetProject = in.nextDouble();

                    ArrayList<Developer> developers = new ArrayList<>();

                    System.out.println("In number of developers");
                    int numberOfDevelopers = in.nextInt();

                    for (int i = 0; i < numberOfDevelopers; i++) {
                        System.out.println("In Developer Name");
                        String developerName = in.next();
                        System.out.println("In Developer Experience");
                        int experience = in.nextInt();
                        System.out.println("In Developer Coding Language");
                        String language = in.next();
                        developers.add(new Developer(developerName, experience, language));
                    }

                    pm.addProjects(new Project(projectName, budgetProject, developers));
                    break;

                case 2:
                    pm.showProjects();
                    break;

                case 3:
                    System.out.println("Goodbye ...");
                    flag = false;
                    break;

                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
