import java.util.Arrays;

public class ArrayMethods {
		
	public static void main(String [] args) {
		
		int[] values = {1, 2, 3, 4, 5, 6};
		g(values);
		
	}
	
	public static void a(int v[]){
				
		int lngth = v.length;
		int firstNum = v[0];
		int secNum = v[lngth - 1];
		v[0] = firstNum;
		v[lngth - 1] = secNum;
		System.out.print(secNum + "\t");
		for(int i = 1; i <= secNum - 2; i++){
			System.out.print(v[i] + "\t");
		}
		System.out.print(firstNum);
		
	}
	
	public static void b(int v[]){
		
		int lngth = v.length;
		int lastNum = v[lngth - 1];
		System.out.print(lastNum + "\t");
		for(int i = 0; i < lastNum - 1; i++){
			System.out.print(v[i] + "\t");
		}
		
	}
	
	public static void c(int v[]){
			
		for(int i = 0; i < v.length; i++){
			if(v[i]%2 == 0){
				v[i] = 0;
			}
			System.out.print(v[i] + "\t");			
		}
			
	}
	
	public static void d(int v[]){
		
		int newV[]= new int[v.length];
		
		newV[0] = v[0];
		newV[v.length - 1] = v[v.length - 1];
		
		System.out.print(newV[0] + "\t");
		for(int i = 1; i < v.length - 1; i++){
				if(v[i - 1] > v[i]){
					newV[i] = v[i - 1];
				}
				if(v[i + 1] > v[i]){
					newV[i] = v[i + 1];
				}
			System.out.print(newV[i] + "\t");
		}
	}
	
	public static void e(int v[]){
		
		if(v.length%2 == 0){
			int midNums = v.length / 2;
			for(int i = 0; i < midNums - 1; i++){
				System.out.print(v[i] + "\t");
			}
			for(int j = midNums + 1; j < v.length; j++){
				System.out.print(v[j] + "\t");
			}
		}
		else{
			int midNum = v.length / 2;
			for(int i = 0; i < midNum; i++){
				System.out.print(v[i] + "\t");
			}
			for(int j = midNum + 1; j < v.length; j++){
				System.out.print(v[j] + "\t");
			}
		}
		
	}
	
	public static void f(int v[]){
		
		int even[] = new int[v.length];
		int odd[] = new int[v.length];
		int place = 0;
		int place2 = 0;
		
		for(int i = 0; i < v.length; i++){
			if(v[i]%2 == 0){
				even[place] = v[i];
				place++;
			}
			else{
				odd[place2] = v[i];
				place2++;
			}
		}
		
		for(int j = 0; j < place; j++){
			System.out.print(even[j] + "\t");
		}
		
		for(int k = 0; k < place2; k++){
			System.out.print(odd[k] + "\t");
		}
	}
	
	public static void g(int v[]){
		
		Arrays.sort(v);
		System.out.println(v[v.length - 2]);
	}
	
	public static void h(int v[]){
		
		boolean sorted = true;
		for(int i = 1; i < v.length; i++){
			if(v[i] < v[i - 1]){
				sorted = false;
			}
		}
		System.out.println(sorted);		
	}
	
	public static void i(int v[]){
		
		boolean adDupe = false;
		for(int i = 1; i < v.length; i++){
			if(v[i] == v[i - 1]){
				adDupe = true;
			}
		}
		System.out.println(adDupe);
	}
	
	public static void j(int v[]){
		
		int j;
		boolean dupe = false;
		
		for(int i = 0; i < v.length; i++){
			for(j = i + 1; j < v.length; j++){
				if(v[i] == v[j]){
					dupe = true;
				}
			}
			j = 0;
		}
		System.out.println(dupe);
	}
}
