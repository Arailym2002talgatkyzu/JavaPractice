public class Main {
    public static void main(String[] args) {
        Student student1=new Bachelor("Arman", "Kuanyshov", "Software engineering");
        student1.setScholarship(45000);
        System.out.println(student1.toString());
        Student student2=new Master();
        student2.setName("Alima");
        student2.setSurname("Basheyeva");
        student2.setEdProgramm("Finance and Economics");
        System.out.println(student2.toString());
        System.out.println(student2);
        student2.setScholarship(160000);
        System.out.println(student2.toString());

    }
}
