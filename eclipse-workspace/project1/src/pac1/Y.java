package pac1;

public class Y {
	public static void main(String[] args) {
		
		int[] arr= {5,0,6,8};
		
		for(int i:arr)
		{
			System.out.println(i);
		}	
	
        Map<String, String>m1=new TreeMap<String, String>();
        m1.put("name", "tom");
        m1.put("city", "meerut");
        m1.put("address", "btm");

       for(Map.Entry<String, String>aaa:m1.entrySet())
        {
            System.out.println(aaa.getKey() + " " + aaa.getValue());
        }
		

		System.out.println(m1.size());		
	
		
	StringBuffer s=new StringBuffer("de");

	
	
	String s1="asc";
	
	String h=s1.replace("s", "s1");
	
	
	System.out.println(h);
	s.reverse();
	
	System.out.println(s);
	
	}
}
