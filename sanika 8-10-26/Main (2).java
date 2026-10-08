class Student {
    String name;
    int marks;
    void setName(String name) {
        this.name = name;
    }
    
    void setMarks (int marks) {
    if(marks >=0 && marks <=100) {
            this.marks = marks;
        } else{
            System.out.println("Invalid marks");
            
        }
    }
    String getName() {
        return this.name;
    }
    int getMarks(){
        return this.marks;
    }
    
}

public class Main {
    public static void main(String[] args) {
    Student s1=new Student();
        s1.setName("Sanika");
        s1.setMarks(85);
System.out.println(s1.getName());
        System.out.println(s1.getMarks());
        s1.setMarks(150);
    }
}
