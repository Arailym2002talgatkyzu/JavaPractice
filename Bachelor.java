public class Bachelor extends Student {
    private String degree="bachelor";
    private int scholarship=30000;
    public Bachelor(String name, String surname, String faculty){
        super(name, surname, faculty);
    }
    public String getDegree(){
        return degree;
    }

    public int getScholarship(){
        return scholarship;
    }
    @Override
    public void setScholarship(int amount){
        this.scholarship=amount;
    }

    public String toString(){
        return super.toString()+" of degree "+getDegree()+" gets scholarship of amount "+getScholarship()+"tg";
    }

}
