public class LanguageFamily {
    protected String name;
    protected String region;
    protected int numLanguages;

    public LanguageFamily(String name, String region, int numLanguages) {
        this.name = name;
        this.region = region;
        this.numLanguages = numLanguages;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public int getNumLanguages() {
        return numLanguages;
    }

    public void setNumLanguages(int numLanguages) {
        this.numLanguages = numLanguages;
    }

    public void printInfo() {
        System.out.println("Language Family: " + name + ", Region: " + region + ", Number of Languages: " + numLanguages);
    }
}
