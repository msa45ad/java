import java.util.Scanner;
class StudDetails
{
    String USN;
    String NAME;
    int[] credits=new int [6];
    int[] marks=new int[6];
    void details()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the name of the student:");
        this.NAME=sc.nextLine();
        System.out.println("Enter the USN of the student:");
        this.USN=sc.nextLine();
        int i;
        for(i=0;i<6;i++)
        {
            System.out.println("enter the marks of subject-"+(i+1));
            marks[i]=sc.nextInt();
            System.out.println("enter the credits of subject-"+(i+1));
            credits[i]=sc.nextInt();
        }
    }
    
    void display()
    {
        int j;
        System.out.println("Name:"+NAME);
        System.out.println("USN:"+USN);
        for(j=0;j<6;j++)
        {
            System.out.println("credits of subject-"+(j+1)+":"+credits[j]);
        }
        for(j=0;j<6;j++)
        {
            System.out.println("Subject-"+(j+1)+" "+"marks:"+marks[j]);
        }
    }
}
class Student
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of student details required:");
        int i=sc.nextInt();
        int j;
        StudDetails st[]=new StudDetails[i];
        for(j=0;j<i;j++)
        {
             st[j]=new StudDetails();
             st[j].details();
        }
         for(j=0;j<i;j++)
         {
             st[j].display();
         }
    }
}