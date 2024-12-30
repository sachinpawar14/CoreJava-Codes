public class StringDemo {
	public static void main(String[] args) {
		/*String str = "Infoway";
		System.out.println(str.hashCode());
		str = str.concat(" Technologies");
		System.out.println(str);
		System.out.println(str.hashCode());*/
		
		
		String s1 = "Java";
		String s2 = "java";
		String s3 = "Java";
		String s4 = " Java";
		
		System.out.println(s1 == s3);//true
		System.out.println(s1 == s2);//false
		System.out.println(s1 == s4);//false
		
		System.out.println(s1.hashCode()+" "+s3.hashCode());
		System.out.println(s2.hashCode()+" "+s4.hashCode());
		
		 String s = " abc ";
		 System.out.println(s.length());
		 s = s.trim();
		System.out.println(s.length());
		
		/*s.charAt(0);
		s.compareTo(s);
		s.compareToIgnoreCase(s);
		s.contains(s);
		s.endsWith(s);
		s.isEmpty();
		s.replace(0, 0);
		s.startsWith(s);
		s.toCharArray();
		s.toLowerCase();*/
		
		
		String str = new String("abc");
		String str1 = new String("pqr");
		
		System.out.println(str.hashCode()+" "+str1.hashCode());
		
		
		
	}

}
