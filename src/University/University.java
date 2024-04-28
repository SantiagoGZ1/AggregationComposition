package University;

import javax.swing.plaf.PanelUI;

public class University {
  private String name;
  private Student[] students;
  private int studentCounter;

  public University(String name, int maxStudents){
    // la intención es crear una universidad vacía al principio y luego agregar estudiantes a medida que sea necesario.
    this.name = name;
    this.students = new Student[maxStudents];
    this.studentCounter = 0;
  }

  //Metodos
  public void addStudents(Student student){
    if (studentCounter < students.length){
      //si el contador es menor que el tamaño de la lista
      students[studentCounter]= student;
      //la lista students en posicion contador = nuevo estudiante
      studentCounter++;
      System.out.println("Add student successful");
    }else{
      System.out.println("ERROR: Full Inscriptions ");
      System.exit(0);
    }
  }

  public Student[] getStudents() {
    return students;
  }
  public int getStudentCounter(){
    return studentCounter;
  }

  public String getName() {
    return name;
  }
}
