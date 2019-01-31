package employee;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadCSVWithScanner {
    public static void main(String[] args) throws IOException {
        //open file input stream
        BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\vijendra.prasad\\IdeaProjects\\Saggezza\\src\\main\\java\\employee\\employee.csv"));
        String line="";
        int index;
        List<Employee> empList = new ArrayList<Employee>();

        while ((line=reader.readLine())!=null) {
            //System.out.println(line);
            index=0;
            Employee employee =new Employee();

            for(String col :line.split(",")){
                if(index==0)
                    employee.setId(Integer.parseInt(col));
                if(index==1)
                    employee.setName(col);
                if(index==2)
                    employee.setRole(col);
                if(index==3)
                    employee.setSalary(col);
                index++;
            }
            empList.add(employee);
        }

        for(int i=0;i<empList.size();i++)
            System.out.println(empList.get(i));
    }
}
