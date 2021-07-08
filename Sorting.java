public class Sorting {

	public static void main(String[] args) {
		int i,j,temp=0;
		int a[] = {56,8,9,74,62,10,54,1};
		System.out.println("Number before sorting");
		for(i=0;i<a.length-1;i++)
		{
			System.out.print(a[i] + " ");			
		}
		
		for(i=0;i<a.length-1;i++) {
			for(j=i+1;j<a.length-1;j++) {
				if(a[i]> a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println();
		System.out.println("numbers after sorting");
		for(i =0;i<a.length-1;i++) {
			System.out.print(a[i]+" ");
		}
	}
}
