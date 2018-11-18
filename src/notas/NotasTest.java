package notas;

import java.util.Scanner;

public class NotasTest 
{
    public static void main(String[] args) 
    {   
        Scanner kb = new Scanner(System.in);
        
        System.out.println("=====================================");
        System.out.println("       Welcome to Academy SYS:       ");
        System.out.println("=====================================");
        
        System.out.print("How many students do you want to register?: ");
        Student[] vStudents = new Student[kb.nextInt()];
        
        for (int i = 0; i < vStudents.length; i++)
        {
            System.out.print("How many notes do you want to enter?: ");
            int notesQTY = kb.nextInt();
            
            System.out.print("Enter the name: ");
            String name = kb.nextLine();
            
            Student s = new Student(name, notesQTY);
            s.insertName();
            s.insertNotes();
            
            vStudents[i] = s;
        }
        
        for (Student vStudent : vStudents) {
            vStudent.showNotes();
        }
    }
}
