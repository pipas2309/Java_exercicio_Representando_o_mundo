public class Exercises {
    String name;
    private boolean onlyMembers = false;
    private String explanation;
    private String exercise;
    private String[] answers;
    private String[] images;

    public void addExercise(String text) {
        this.exercise = text;
    }

    public void addExplanation(String text) {
        this.explanation = text;
    }

    public void addAnswers(String[] text) {
        this.answers = text;
    }
    public void addImages(String[] url) {
        this.images = url;
    }

    public String getExercise() {
        return this.exercise;
    }

    public String getExplanation() {
        return this.explanation;
    }

    public String[] getAnswers() {
        return this.answers;
    }

    public String[] getImages() {
        return this.images;
    }

    public String changeMembership() {
        this.onlyMembers = !this.onlyMembers;
        
        if(onlyMembers) {
            return "Agora esse exercício é para membros!";
        } else {
            return "Agora esse exercício é para todos!";
        }
    }
}
