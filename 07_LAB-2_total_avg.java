import java.util.*;
class Mark
{
    public static void main(String[] args)
    {
        int mark;
        int total=0;
        float avg;
        float count=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter mark");
        while(true)
        {
            mark=sc.nextInt();
            if(mark==999)
            {
                break;
            }
            else if(mark%5==0)
            {
                continue;
            }
            total=mark+total;
            count++;
        }
        avg=total/count;
        System.out.println("Total is "+total);
        System.out.println("Avg is "+avg);
        sc.close();
    }
}
