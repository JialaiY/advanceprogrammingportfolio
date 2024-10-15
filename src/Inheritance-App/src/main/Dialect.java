public class Dialect extends Language {
    private String dialectName;
    private int speakers;
    private boolean writtenForm;

    public Dialect(String name, String region, int numLanguages, String primaryLanguage, String dialectName, int speakers, boolean writtenForm) {
        super(name, region, numLanguages, primaryLanguage);
        this.dialectName = dialectName;
        this.speakers = speakers;
        this.writtenForm = writtenForm;
    }

    public String getDialectName() {
        return dialectName;
    }

    public void setDialectName(String dialectName) {
        this.dialectName = dialectName;
    }

    public int getSpeakers() {
        return speakers;
    }

    public void setSpeakers(int speakers) {
        this.speakers = speakers;
    }

    public boolean hasWrittenForm() {
        return writtenForm;
    }

    public void setWrittenForm(boolean writtenForm) {
        this.writtenForm = writtenForm;
    }

    public void printInfo() {
        super.printInfo();
        System.out.println("Dialect: " + dialectName + ", Speakers: " + speakers + ", Written Form: " + (writtenForm ? "Yes" : "No"));
    }
}
