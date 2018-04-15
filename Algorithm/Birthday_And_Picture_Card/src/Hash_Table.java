import java.util.Random;

public class Hash_Table {
	private int M;
	private Object[] obj;
	
	public Hash_Table(int M) {
		this.M = M;
		this.obj = new Object[M];
	}

	private int hash(Object key){ 
		return (key.hashCode() & 0x7fffffff) % M; 
	}
	
	private boolean getAndPut(Object key) {
	   //return true if the slot is occupied
	   //if the slot is empty, add the object and return false
	   int i = hash(key);
	   if(obj[i] == null) {
		   obj[i] = new Object();
		   return false;
	   }else {
		   return true;
	   }
	}
	
	private String getRandomString() {
        String SALTCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        StringBuilder salt = new StringBuilder();
        Random rnd = new Random();
        while (salt.length() < 18) { // length of the random string.
            int index = (int) (rnd.nextFloat() * SALTCHARS.length());
            salt.append(SALTCHARS.charAt(index));
        }
        String saltStr = salt.toString();
        return saltStr;

    }
	
	public static double[] getTestResults(int testNum, int M) {
		Hash_Table[] htList = new Hash_Table[testNum];
		double rstSumFirstDuplicate = 0;
		double rstSumFill = 0;
		for(int i = 0; i < testNum; i++) {
			// Doing the counting process for "testNum" times
			htList[i] = new Hash_Table(M);
			int count = 0;
			
			//Counting until first collision
			while(true){
				if(htList[i].getAndPut(htList[i].getRandomString())) 
					break;
				else 
					count++;
			}
			rstSumFirstDuplicate = (double)count + rstSumFirstDuplicate;
			
			//Counting until slots filled
			int countFill = count++;
			while(countFill < M) {
				if(!htList[i].getAndPut(htList[i].getRandomString())) countFill++;
				count++;
			}
			rstSumFill = (double)count + rstSumFill;
		}
		
		double[] rsts = new double[2];
		
		//Getting the average result
		rsts[0]= rstSumFirstDuplicate / (double)testNum;
		rsts[1] = rstSumFill / (double)testNum;
		
		//Printing out
		double theoreyFirstDuplicate = Math.sqrt(3.1415 * (double)M * 0.5);
		double theoreyFillCounts = M * Math.log(M);
		System.out.print("Theoretical value for first collision: " + theoreyFirstDuplicate + "\n");
		System.out.print("Average count: " + rsts[0] + "\n");
		System.out.print("Theoretical value for filled up the slots: " + theoreyFillCounts + "\n");
		System.out.print("Average count: " + rsts[1] + "\n");
		return rsts;
	}
	
	
	
}
