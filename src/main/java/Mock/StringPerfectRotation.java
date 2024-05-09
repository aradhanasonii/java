package Mock;

public class StringPerfectRotation {
	public static void main(String[] args) {
		String s = "I am from Bangalore";
		String[] st = s.split(" "); //here we are spliting from the space and storing in string array.
		for(int i =0;i<st.length;i++)// I am from Bangalore
		{                             //  0  1  2    3
			String temp = st[0];
			for(int j =1;j<st.length;j++)
			{
			st[j-1]	=st[j];
			System.out.print(st[j]+" ");
			}
			st[st.length-1]= temp;
			System.out.println(temp);
		}
	}

}
