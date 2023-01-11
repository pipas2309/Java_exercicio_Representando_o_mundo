public class Subject {
    String Name;
    Exercises exercises;
    private boolean onlyMembers = false;

    public String changeMembership() {
        this.onlyMembers = !this.onlyMembers;
        
        if(onlyMembers) {
            return "Agora essa matéria é para membros!";
        } else {
            return "Agora essa matéria é para todos!";
        }
    }
}
