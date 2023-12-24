package InterviewPrograms;

public class RemovingLeadingAndTrailingSpaces {
// 1-using trim
//	2-using strip(java11)
//	-strip()
//	-stripLeading()
//	-stripTrailing()
//	3-using regix
//	-  ^[ \t]+| [ \t]+$  -->leading and trailing
//	- ^[ \t]+ -->leading
//	 [ \t]+$ --->trailing
	
	public static void main(String[] args) {
		String input= " hello world ";
		System.out.println(input.trim());
		System.out.println(input.stripTrailing());
		System.out.println(input.replaceAll("^[ \t]+| [ \t]$", ""));
		System.out.println(input.replaceAll("^[ \t]", ""));
		System.out.println(input.replaceAll("[ \t]+$", ""));


	}

}
