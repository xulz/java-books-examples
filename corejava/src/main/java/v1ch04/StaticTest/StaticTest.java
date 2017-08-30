/**
 * This program demonstrates static methods.
 * @version 1.01 2004-02-19
 * @author Cay Horstmann
 */
public class StaticTest
{
   public static void main(String[] args)
   {
      // fill the staff array with three Employee5 objects
      Employee5[] staff = new Employee5[3];

      staff[0] = new Employee5("Tom", 40000);
      staff[1] = new Employee5("Dick", 60000);
      staff[2] = new Employee5("Harry", 65000);

      // print out information about all Employee5 objects
      for (Employee5 e : staff)
      {
         e.setId();
         System.out.println("name=" + e.getName() + ",id=" + e.getId() + ",salary="
               + e.getSalary());
      }

      int n = Employee5.getNextId(); // calls static method
      System.out.println("Next available id=" + n);
   }
}

class Employee5
{
   private static int nextId = 1;

   private String name;
   private double salary;
   private int id;

   public Employee5(String n, double s)
   {
      name = n;
      salary = s;
      id = 0;
   }

   public String getName()
   {
      return name;
   }

   public double getSalary()
   {
      return salary;
   }

   public int getId()
   {
      return id;
   }

   public void setId()
   {
      id = nextId; // set id to next available id
      nextId++;
   }

   public static int getNextId()
   {
      return nextId; // returns static field
   }

   public static void main(String[] args) // unit test
   {
      Employee5 e = new Employee5("Harry", 50000);
      System.out.println(e.getName() + " " + e.getSalary());
   }
}
