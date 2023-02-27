package methods;

import java.util.Arrays;

public class DuplicateElimentss {

	public static void main(String[] args) {
		int a[]= {1,2,2,4,4,5,6,6,7};
		int count=1;
		Arrays.sort(a);
		for(int i = 0;i<a.length-1;i++)
		{
			for(int j = i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					count++;
					break;
				}
			if(count>1)
			{
				System.out.println(a[i]+ " " +count--);
				i+=count;
			}
				
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			}
		}
		

	}

}
