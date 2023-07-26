package Lehar;
import java.util.*;
class  student
{
    private int rollno;
    private String name;
    private String course;
    private String branch;
    private String Semester;
    private String ADate;


    student(int rollno ,String name, String course ,String branch,String Semester,String ADate)
    {
        this.rollno=rollno;
        this.name=name;
        this.course=course;
        this.branch=branch;
        this.Semester=Semester;
        this.ADate=ADate;
    }

    void printdetails()
    {

//        Arrays.stream(s).sorted(name);
        System.out.print(" ROLLNO = "+rollno);
        System.out.print(" NAME = "+name);
        System.out.print(" CLASS = "+course);
        System.out.print(" BRANCH = "+branch);
        System.out.print(" SEMESTER = "+Semester);
        System.out.print(" ADMISSIONDATE = "+ADate);

    }

//    ********************


  String sortNames(String[] userNames) {
        String temp = "";
        for (int i = 0; i < userNames.length; i++) {
            for (int j = i + 1; j < userNames.length; j++) {
                if (userNames[i].compareTo(userNames[j]) > 0) {
                    temp = userNames[i];
                    userNames[i] = userNames[j];
                    userNames[j] = temp;
                }
            }
        }
//        return userNames;
      return temp;
  }
//    ***********************************
    String aname()
    {
        int i, j;
//        System.out.println("Enter number of strings");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        String a[] = new String[n];
        System.out.println("Enter "+n +" Strings");
        for (i=0;i < n;i++)
        {
            a[i]=s.next();
        }for (i=0;i < n;i++)
    {
        for (j=i+1;j < n;j++)
        {
            if (a[i].compareTo(a[j]) > 0)
            {
                String temp=a[i];
                a[i]=a[j];
                a[j]=temp;
            }
        }
    }
        System.out.println("Names after sorting  : ");
        for (j=0;j < n;j++)
            System.out.println(a[j]);
        return null;
    }


}

class qq4
{
    public static void main(String[] args)
    {
        student s[] = new student[5];
        int i=0,ch;
        Scanner in = new Scanner(System.in);
        System.out.println("ENTER NO OF TOTAL STUDENT INFORMATION");
        ch=in.nextInt();

        for(i=1;i<=ch;i++)
        {

            System.out.println("ENTER THE NAME OF THE STUDENT");
            String name = in.next();
            System.out.println("ENTER THE COURSE OF THE STUDENT");
            String course = in.next();
            System.out.println("ENTER THE BRANCH OF THE STUDENT");
            String branch = in.next();
            System.out.println("ENTER THE SEMESTER OF THE STUDENT");
            String Semester = in.next();
            System.out.println("ENTER THE ADMISSION DATE OF THE STUDENT");
            String ADate = in.next();
            
            s[i] = new student(i,name,course,branch,Semester,ADate);

        }

        
        for(int j=1;j<=ch;j++)
        {
            s[2].printdetails();
            System.out.println();
        }

    }
}