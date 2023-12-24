package InterviewPrograms;

public class SwapNumbers {
	
	private void UsingThirdVar() {
		
		int mysalary = 20;
		int supsalary = 50;
		System.out.println("Before Swapping"+ "Mine :"+ mysalary +" superior:"+supsalary);
		int temp = mysalary;
		mysalary = supsalary;
		supsalary = temp;
		System.out.println("After Swapping"+ "Mine :"+mysalary +" superior:"+supsalary);

	} 
	private void WithoutThirdVar() {
		
//		division and multiplication can also be used 
//		first= first * second;  
//		second= first/second;   
//		first= first/second;  
		int first = 20; int second = 50;
		System.out.println("Before Swapping"+ "first :"+ first +" second:"+second);
		first = first - second;      
		second = first + second;
		first = second - first;
		System.out.println("Before Swapping"+ "first :"+ first +" second:"+second);
		

	}
	public static void main(String[] args) {
		SwapNumbers num = new SwapNumbers();
		num.WithoutThirdVar();
	}
		
		
}
