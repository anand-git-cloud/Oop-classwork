import java.util.*;
class Result
{
    public static void main(String[] args)
    {
        int subject1;
        int subject2;
        int subject3;
        int subject4;
        int subject5;
        int total;
        int per;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Subject-1 marks:");
        subject1=sc.nextInt();
        System.out.print("Enter Subject-2 marks:");
        subject2=sc.nextInt();
        System.out.print("Enter Subject-3 marks:");
        subject3=sc.nextInt();
        System.out.print("Enter Subject-4 marks:");
        subject4=sc.nextInt();
        System.out.print("Enter Subject-5 marks:");
        subject5=sc.nextInt();
        total=subject1+subject2+subject3+subject4+subject5;
        per=total/5;
        System.out.println("Total is:"+total);
        System.out.println("Per is:"+per);
        if(per>=90)
        {
            System.out.println("A grade");
        }
        if(per<=90 && per>=80)
        {
            System.out.println("B grade");
        }
        else if(per<=80 && per>=60)
        {
            System.out.println("C grade");
        }
        else if(per>=59 && per<=35)
        {
            System.out.println("D grade");
        }
        else
        {
            System.out.println("F grade");
        }
        sc.close();
    }
}
