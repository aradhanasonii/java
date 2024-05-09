package Abstraction;




public class Travel {
	public static void main(String[] args) {
		Capital c = new Capital();
		c.karnataka();
		c.Maharastra();
		c.tamilNadu();
		
		System.out.println(c.a);
		System.out.println(c.b);
		
		India i = new Capital();
		i.karnataka();
		i.Maharastra();
		System.out.println(i.a);
		//cannot do this 
		//system.out.println(i.b);

}
}
