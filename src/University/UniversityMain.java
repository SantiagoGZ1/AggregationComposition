package University;

public class UniversityMain {
  public static void main(String[] args) {
    University university1 = new University("University XYZ", 100);
    Student student1 = new Student("Jose", 22, 11);
    Student student2 = new Student("Santi", 18, 10);
    university1.addStudents(student1);
    System.out.println(university1.getName());

//    for (int i = 0; i <){
//
//    }

  }
}