public class User {
    String name;
    private String email;
    String college;
    private int startYear;
    private int conclusionYear;
    private int age;
    private boolean member = false;

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getStartYear() {
        return this.startYear;
    }

    public void setStartYear(int year) {
        this.startYear = year;
    }

    public int getConclusionYear() {
        return this.conclusionYear;
    }

    public void setConclusionYear(int year) {
        this.conclusionYear = year;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int year) {
        this.age = year;
    }

    public boolean getIsMember() {
        return this.member;
    }

    public void changeMembership() {
        this.member = !this.member;
    }
}
