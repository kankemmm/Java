public class ShowCurrentTime {
	public static void main(String[] args) {
		long totalMillisecond = System.currentTimeMillis();
		//总秒数
		long totalSeconds = totalMillisecond /1000;
		//秒数
		long currentSecond = totalSeconds % 60;
		//总分数
		long totalMintues = totalSeconds / 60;
		
		long currentMintues = totalMintues %60;
		
		long totalHour = totalMintues / 60;
		
		long currentHour = totalHour % 24;
		
		System.out.println("Current time is " + currentHour + ":"+
				currentMintues + ":" + currentSecond + " GMT");
	    

	}

}
