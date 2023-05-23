package microComputerScienceAssignmen;
import java.util.Random;

public class Fully_Associative_Mapping {
	public static <random_device> void main(String[] args) {

		int cache [] = {-1,-1,-1,-1,-1,-1,-1,-1};
		int Address [] = { 2,10,4,2,3,1,3,8,12,4} ;
		int miss, accesses , hit ;
		 hit = 0 ;
		 miss = 0 ;
		accesses = 0;
		for ( int i = 0 ; i <Address.length; i++){
		
		int addr = Address [ i ] ;
		accesses ++;
		int tag;
		tag = addr/8 ;
		Boolean found =false ;
		Boolean empty_line=false;
		
		     for ( int j= 0 ; j<cache.length ; j++){
		          if (cache[j]==tag ){
			          hit++;
		              found = true;
		                   break;
		}
	
    } 
	
		if (!found )
		{
			miss++;
		for (int r =0 ; r<cache.length;r++) {
			if (cache[r]==-1){
				cache[r]=tag;
				empty_line=true;
				break;

		}
		if (!empty_line)
		{
			int z = (int)(Math.random()*cache.length);
			cache[z]= tag ;
		}
		
		
		
		}
		System.out.println("the hit number " +hit);
		System.out.println("the miss number " +miss ) ;
		
		}
		System.out.println("the access number " +accesses) ;
				}
	

}
}
