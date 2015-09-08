package mvcdemo;

public class MVCDemo {

  public static void main(String[] args) {

      
      Student model  = retriveStudentFromDatabase();

      StudentView view = new StudentView();

      StudentController controller = new StudentController(model, view);

      controller.updateView();

      controller.setStudentName("Forrest");

      controller.updateView();
   }

   private static Student retriveStudentFromDatabase(){
      Student student = new Student();
      student.setName("Forrest");
      student.setRollNo("281");
      return student;
   }
    
}

