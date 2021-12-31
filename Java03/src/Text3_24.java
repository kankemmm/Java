import java.util.Scanner;
public class Text3_24 {

	public static void main(String[] args) {
		int number = (int)(Math.random() * 13 + 1 );//ÅÆµÄµãÊý
		int color = (int)(Math.random() * 3);
		
		String str_Number;
        if(number == 1)
            str_Number = "ACE";
        else if(number == 11)
            str_Number = "Jack";
        else if(number == 12)
            str_Number = "Queen";
        else if(number == 13)
            str_Number = "King";
        else
            str_Number =  "" + number;
//        
        String str_Color;
//        
//        if(color == 0)
//        	str_Color = "Clubs";
//        else if(color == 1)
//        	str_Color = "Diamonds";
//        else if (color == 2)
//        	str_Color = "Hearts";
//        else if(color == 3)
//        	str_Color = "Spades";
     
        switch (color){
            case 0:str_Color="Clubs";break;
            case 1:str_Color="Diamonds";break;
            case 2:str_Color="Heart";break;
            default:str_Color="Spades";
        }
        
        System.out.println("The card you picked is " + str_Number + " of " + str_Color );
        
        
	}
	
}
