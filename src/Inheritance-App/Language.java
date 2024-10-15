public class Language extends LanguageFamily {
    private String primaryLanguage;

    public Language(String name, String region, int numLanguages, String primaryLanguage) {
        super(name, region, numLanguages);
        this.primaryLanguage = primaryLanguage;
    }

    public String getPrimaryLanguage() {
        return primaryLanguage;
    }

    public void setPrimaryLanguage(String primaryLanguage) {
        this.primaryLanguage = primaryLanguage;
    }

    public void printInfo() {
        super.printInfo();
        System.out.println("Primary Language: " + primaryLanguage);
    }
}