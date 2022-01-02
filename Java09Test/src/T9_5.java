import java.util.GregorianCalendar;
public class T9_5 {
	public static void main(String[] args) {
		GregorianCalendar g = new GregorianCalendar();
		//int month = g.get(GregorianCalendar.MONTH);
		System.out.println(g.get(GregorianCalendar.YEAR)+"."+g.get(GregorianCalendar.MONTH)+"."+g.get(GregorianCalendar.DAY_OF_MONTH));
		g.setTimeInMillis(1234567898765L);
		System.out.println(g.get(GregorianCalendar.YEAR)+"/"+g.get(GregorianCalendar.MONTH)+"/"+g.get(GregorianCalendar.DAY_OF_MONTH));
		
		
	}
}
