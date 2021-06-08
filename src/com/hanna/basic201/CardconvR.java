package com.hanna.basic201;

public class CardconvR {

	public int cardconvR( int no, int cd, char[] cno) {
		
		// no = 59
		// cd = 2
		
		int dno = 0;
		String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		do {
			System.out.println(cd +"|" + "   " + no + "  ..." + no % cd) ;
			System.out.println(" +----------") ;
			
			
			cno[dno++] = dchar.charAt(no % cd);
			no /= cd ;
			// rÀ» x¶û ³ª´«°ªÀ» ³ÖÀ½
		}while ( no != 0 );
		
		return dno;
		
		
	}
}
