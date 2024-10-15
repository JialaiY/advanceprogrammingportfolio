public class Pidgin extends Language {
    private String originCountry;

    public Pidgin(String name, String region, int numLanguages, String primaryLanguage, String originCountry) {
        super(name, region, numLanguages, primaryLanguage);
        this.originCountry = originCountry;
    }

    public String getOriginCountry() {
        return originCountry;
    }

    public void setOriginCountry(String originCountry) {
        this.originCountry = originCountry;
    }

    public void printInfo() {
        super.printInfo();
        System.out.println("Origin Country: " + originCountry);
    }
}