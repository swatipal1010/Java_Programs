package Strings;

public class StringInsert {

	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer("abcdefghijk");
		sb.insert(3,  "123");
		System.out.println(sb);
		
		StringBuffer str = new StringBuffer("Hello World");
		
		//str.replace(6,11, "java");
		//System.out.println(str);
		
		//str.replace(6, 7, "java");
		//System.out.println(str);
		
		str.replace(6, 7, "extraordinary");
		System.out.println(str);
		
		StringBuffer st = new StringBuffer();
		System.out.println(st.capacity());
		
	}

}
