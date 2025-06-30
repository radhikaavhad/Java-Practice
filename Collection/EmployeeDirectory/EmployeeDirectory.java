package CollectionAPI.EmployeeDirectory;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class EmployeeDirectory {
   private HashMap<Integer,String> employeeList;

   public EmployeeDirectory(){
       employeeList = new HashMap<>();
   }

   public void addEmployee(int id, String name){
       employeeList.put(id, name);
   }

   public void removeEmployee(int id){
       if(employeeList.remove(id) != null)
           System.out.println("Removed Employee with ID "+id);
       System.out.println("Employee does not exist");
   }

   public void fetchEmployee(int id){
       if(employeeList.containsKey(id))
           System.out.println("Employee ID: "+id+"\nEmployee name: "+employeeList.get(id));
       System.out.println("Employee does not exist");
   }

   public void display(){
       Set<Map.Entry<Integer,String>> entrySet = employeeList.entrySet();

       if(employeeList.isEmpty())
           System.out.println("No Employees to display");
       else {
                for(Map.Entry<Integer, String> entry : entrySet){
                    System.out.println("Employee ID: "+entry.getKey()+" , Employee Name: "+entry.getValue());
                }
       }
   }
}
