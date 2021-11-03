import java.util.Scanner;
class Maxmin
{
	public static void main(String args[])
	{
	Scanner s=new Scanner(System.in);
	int n;
	n=s.nextInt();
	int a[]=new int[n];
    int b[]=new int[n];
	for(int i=0;i<n;i++)
	{
      a[i]=s.nextInt();
	}
	int temp=0;
	for(int i=0;i<n;i++)
	{
		b[i]=a[i];
	}
	for(int i=0;i<a.length;i++)
	{
		for(int j=i+1;j<a.length;j++)
		{
			if(a[i]>a[j])
			{
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
	}
	
	for(int i=0;i<b.length;i++)
	{
		for(int j=i+1;j<b.length;j++)
		{
			if(b[i]<b[j])
			{
				temp=b[i];
				b[i]=b[j];
				b[j]=temp;
			}
		}
	}
	
	double mid=Math.floor(n/2);
	int middle=(int) mid;
	for(int i=0;i<middle;i++)
	{
		System.out.print(b[i]+" ");
		System.out.print(a[i]+" ");
	}
	if(n%2==1)
	{
		System.out.print(a[middle]);
	}


	}
}
