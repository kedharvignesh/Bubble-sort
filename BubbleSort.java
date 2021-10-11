
public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {97,78,7,34,67,58,38,95,83,59,37};
		
		
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++)
				if(a[i]<a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			
		}
		
		for(int i:a) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		int[] b = {9,76,45,8,3,65,87,86,37,50,85};
		
		for(int i=0;i<b.length;i++) {
			for(int j=0;j<b.length;j++)
				if(b[i]>b[j]) {
					int temp=b[i];
					b[i]=b[j];
					b[j]=temp;
				}
			
		}
		
		for(int i:b) {
			System.out.print(i+" ");
		}

	}

}
