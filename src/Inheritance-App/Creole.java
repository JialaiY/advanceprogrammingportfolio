public class Creole extends Language {
    private String baseLanguages;
    private boolean officialStatus;
    private int speakers;

    public Creole(String name, String region, int numLanguages, String primaryLanguage, String baseLanguages, boolean officialStatus, int speakers) {
        super(name, region, numLanguages, primaryLanguage);
        this.baseLanguages = baseLanguages;
        this.officialStatus = officialStatus;
        this.speakers = speakers;
    }

    public String getBaseLanguages() {
        return baseLanguages;
    }

    public void setBaseLanguages(String baseLanguages) {
        this.baseLanguages = baseLanguages;
    }

    public boolean hasOfficialStatus() {
        return officialStatus;
    }

    public void setOfficialStatus(boolean officialStatus) {
        this.officialStatus = officialStatus;
    }

    public int getSpeakers() {
        return speakers;
    }

    public void setSpeakers(int speakers) {
        this.speakers = speakers;
    }

    public void printInfo() {
        super.printInfo();
        System.out.println("Base Languages: " + baseLanguages + ", Official Status: " + (officialStatus ? "Yes" : "No") + ", Speakers: " + speakers);
    }
}