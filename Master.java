public class Master extends Student {
    private String degree="master";
    private int scholarship=100000;
    public String getDegree(){
        return degree;
    }
    public Master(String name, String surname, String faculty){
        super(name, surname, faculty);
    }
    public Master(){};
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
