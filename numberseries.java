import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,i,pr=0;
	   System.out.printf("");
	    n=sc.nextInt();
	    for(i=1;i<=n;i++)
	    {
	        if(i%2==0)
	        {
	        	pr=(int) (Math.pow(i,2)-2);
	            System.out.print(pr+" ");
	        }
	        else
	        {
	            pr=(int) (Math.pow(i,2)-1);
	            System.out.printf(pr+" ");
	        }
	    }
	    sc.close();
	}
}
