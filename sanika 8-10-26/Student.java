class Student {
    String name;
    int marks;
    public static void main(String []args){
        StudentFactory f1=new StudentFactory ();
       Student s1=f1.create();
        System.out.println("Name:"+s1.name);
        System.out.println("Marks:"+s1.marks);
    }
}
class StudentFactory {
    Student create (){
        Student s=new Student();
        s.name="Sanika";
        s.marks=95;
        return s;
    }
}
