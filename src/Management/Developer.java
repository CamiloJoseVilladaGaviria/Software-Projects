package Management;

public class Developer {

    private String developerName;
    private int developerExperience;
    private String language;

    public Developer(String developerName, int developerExperience, String language) {
        this.developerName = developerName;
        this.developerExperience = developerExperience;
        this.language = language;
    }

    public String getDeveloperName() {
        return developerName;
    }

    public void setDeveloperName(String developerName) {
        this.developerName = developerName;
    }

    public int getDeveloperExperience() {
        return developerExperience;
    }

    public void setDeveloperExperience(int developerExperience) {
        this.developerExperience = developerExperience;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    @Override
    public String toString() {
        return "Developer{" + "developerName=" + developerName + ", developerExperience=" + developerExperience + ", language=" + language + '}';
    }

}

