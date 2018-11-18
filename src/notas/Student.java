package notas;

import java.util.Scanner;

public class Student 
{
    private String name;
    private float[] vNotes;
    
    public Student(){}
    
    public Student(String name)
    {
        this.name = name;
    }
    
    public Student(int quantity)
    {
        vNotes = new float[quantity];
    }

    public Student(String name, int quantity) {
        this.name = name;
        vNotes = new float[quantity];
    }
    
    public String getName() 
    {
        return name;
    }
    
    public void insertName() 
    {
        Scanner kb = new Scanner(System.in);
        name = kb.nextLine(); 
    }
    
    public void insertNotes() 
    {
        Scanner kb = new Scanner(System.in);
        
        for (int i = 0; i < vNotes.length; i++) 
        {
            System.out.print("Note " + (i + 1) + ": ");
            vNotes[i] = kb.nextFloat();
        }
         
    }
    
    private float getAverage()
    {
        float sum = 0;
        for (int i = 0; i < vNotes.length; i++) 
        {
            sum += vNotes[i]; 
        }
        float avg = sum / vNotes.length;
        return avg;
    }
    
    public void showNotes() 
    {
        System.out.println("--------------------------------------------");
        System.out.println("NOTES REPORT FROM " + "[" + getName() + "]");
        System.out.println("--------------------------------------------");
        
        for (int i = 0; i < vNotes.length; i++) 
        {
            System.out.println(vNotes[i]);
        }
        
        System.out.println("AVERAGE --> " + getAverage());
        System.out.println("--------------------------------------------");
    }
}
