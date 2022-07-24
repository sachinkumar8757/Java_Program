import java.util.Scanner;
public class Stack {
    int top=-1;
    int Smax=5;
    int a[]=new int[10];
    Scanner sc = new Scanner(System.in);
    void push()
    {
        System.out.println("Enter element");
        int item=sc.nextInt();
        if(top==Smax-1)
        {
            System.out.println("overflow");
        }
        else{
            top++;
            a[top]=item;
        }
    }
    void pop()
    {
       int item=a[top];
       if(top==-1)
       {
        System.out.println("underflow");
       }
       else{
        top--;
        System.out.println("popped element is "+item);
       }
    }
    void display()
    {
        int i;
        if(top==-1)
        {
            System.out.println("Empty");
        }
        else
        {
            System.out.println("Elements are:");
            for(i=top;i>=0;i--)
            {
                System.out.println(a[i]);
            }
        }
    }
    public static void main(String arg[]){
        int ch;
        Scanner sc = new Scanner(System.in);
        Stack s1=new Stack();
        for(;;)
        {
           System.out.println("Stack menu");
           System.out.println("1:push\n2:pop\n3:Display\n4:Exit");
           System.out.println("Enter your choice");
           ch=sc.nextInt();
           switch(ch)
           {
            case 1:s1.push();
            break;
            case 2:s1.pop();
            break;
            case 3:s1.display();
            break;
            case 4:System.exit(0);
            break;
            default:System.out.println("Invalid choice");
           }
        }
    }
}
