public abstract class Student {
    private String name;
    private String surname;
    private String edProgramm;
    public Student(String name, String surname, String edProgramm){
        this.name=name;
        this. surname=surname;
        this.edProgramm=edProgramm;
    }
    public Student(){}
    public String getEdProgramm(){
        return edProgramm;
    }
    public void setEdProgramm(String programm){
        this.edProgramm=programm;
    }
    public void setName(String name){
      this.name=name;
    }
    public String getName(){
    return name;
    }
    public String getSurname(){
        return surname;
    }
    public void setSurname(String sname){
        this.surname=sname;
    }
    public abstract void setScholarship(int amount);

    public String toString(){
        return "The student "+getName()+" "+getSurname()+" studies in the faculty "+getEdProgramm();
    }
}
