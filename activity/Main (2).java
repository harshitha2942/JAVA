import java.util.*;

public class Main {

      static TreeMap<Integer, String> s = new TreeMap<>();

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("Student Management System ");
            System.out.println("1 Add Student");
            System.out.println("2 Search Student");
            System.out.println("3 Remove Student");
            System.out.println("4 Display Students");
            System.out.println("5 Display First Student");
            System.out.println("6 Display Last Student");
            System.out.println("7 Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) 
            {
                
                case 1:
                System.out.println("enter the id");
                int id = sc.nextInt();
                System.out.println("enter the name");
                String n = sc.next();
                s.put(id,n);
                System.out.println("added successfully");
                break;
                case 2:
                System.out.println("enter the id to search");
                int sid = sc.nextInt();
              if(s.containsKey(sid))
                {
                    System.out.println("student name" +s.get(sid));
                }
                else
                {
                    System.out.println("studnet not found");
                }
                case 3:
                    System.out.println("enter the id to remove");
                    int rid = sc.nextInt();
                    if(s.containsKey(rid))
                    {
                        System.out.println("removd" +s.remove(rid));
                    }
                    else
                    {
                        System.out.println("not removed");
                    }
                    break;
                case 4:
                    System.out.println("students");
                    for(Map.Entry<Integer,String> entry:s.entrySet())
                    {
                       System.out.println(entry.getKey() + " - " + entry.getValue());
                    }
                    
                    break;
                   case 5:
                    if (!s.isEmpty()) {
                        int firstId = s.firstKey();

                        System.out.println("First Student: "+ firstId + " -> "+ s.get(firstId));
                  
                    }
                    else 
                    {
                        System.out.println("No students available.");
                    }
                    break;

                case 6:
                    if (!s.isEmpty()) {
                        int lastId = s.lastKey();

                        System.out.println( "Last Student: "+ lastId + " -> "+ s.get(lastId));
        
                    } 
                    else 
                    {
                        System.out.println("No students available.");
                    }
                    break;

                case 7:
                    System.out.println("Program ended.");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
