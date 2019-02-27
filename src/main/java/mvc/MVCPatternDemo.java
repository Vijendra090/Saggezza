package mvc;

public class MVCPatternDemo {
    public static void main(String[] args){

        Student model= reteriveStudentFromDatabase();

        StudentView view= new StudentView();

        StudentController controller = new StudentController(model,view);
        controller.updateView();

        //update model data
        controller.setStudentName("Ranita Bhattacharya");

        controller.updateView();
    }

    private static Student reteriveStudentFromDatabase(){
        Student student = new Student();
        student.setName("Vijendra Prasad");
        student.setRollNo("214CS1127");
        return student;
    }
}
