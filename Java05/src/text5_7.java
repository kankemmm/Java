
public class text5_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double f = 10000;
		double m ;
		double n = 0;
		double total = 0;
		while(n != 10) {
			f = f + f * 0.05;
		    n++;
		    if(n <=4 ) total += f;
		    
		}
		
		System.out.println("��ʮ��ķ��ã�" + (int)f);
		System.out.println("ǰ����ķ��ã�" + (int)total);
	}

}
