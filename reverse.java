package assignment1;
import java.io.* ;

public class reverse {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				String inp=br.readLine();
		        String words[]=inp.split(" ") ;
		        
		        //String reverse[]=new String[words.length] ;
		       String fin="";
		       for(int i=0;i<words.length;i++)
		       {
		        	String rev="" ;
		        	for(int j=words[i].length()-1;j>=0;j--)
                    {
	                    rev+=words[i].charAt(j) ;
                    }
                    //reverse[i]=rev ;
                    fin+=rev+" ";
		        }
		        System.out.print(fin) ;
}
}
