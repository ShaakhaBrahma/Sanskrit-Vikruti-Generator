package Sanskrit;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
public class GhanaPaata
{

	public static void main(String args[]) throws IOException
	{
		 GhanaPaata obj = new GhanaPaata();
		//Testing HAcktober fest
		//FileReader fr=new FileReader("C:\\Users\\srivatsa\\Desktop\\shloka.txt");  
		String src =obj.readFile(new BufferedReader( new InputStreamReader(new FileInputStream("C:\\Users\\srivatsa\\Desktop\\shloka.txt"),"UTF-8")));
		String dest=new String();
		
		String comp []=src.split("\\|\\|");
		for(int j=0;j<comp.length-1;j++)
		{
			//System.out.println("Sholka before[]:"+j+" "+comp[j]);
			comp[j] = comp[j].replaceAll("[\\n\\r]+","");
			comp[j] = comp[j].replaceAll("[\\|]+"," ");
			//System.out.println("Sholka[] after:"+j+" "+comp[j]);
            String s[] =  comp[j].split(" ");//splitting each shloka to words
            //System.out.println(Arrays.toString(s)+":"+s.length);
            
            //System.out.println(s.length);
            //for(String b:s)
            //{
            	//System.out.println("singleword:");
            	//System.out.println(b);
            //}
		    int lineLen=(s.length-2);
		    //System.out.print(lineLen);
		    
		    for(int i = 0;i<lineLen;i++)
		    {
			dest+=s[i]+"  "+s[i+1]+","+s[i+1]+"  "+s[i]+","+s[i]+"  "+s[i+1]+"  "+s[i+2]+","+s[i+2]+"  "+s[i+1]+"  "+s[i]+","+s[i]+"  "+s[i+1]+"  "+s[i+2]+"||\r\n";
			//System.out.println("dest:");
			//System.out.println(dest);
		    }
		    //System.out.println(Arrays.toString(s));
		dest+=s[s.length-2]+"  "+s[s.length-1]+","+s[s.length-1]+"  "+s[s.length-2]+","+s[s.length-2]+"  "+s[s.length-1]+"||\r\n";
		
		}//end of for loop
		for(int j=0;j<comp.length;j++)
		{
			System.out.println(comp[j]);//it should print
		} 
		FileWriter writer = new FileWriter("C:\\Users\\srivatsa\\Desktop\\output.txt"); 
         
         // Writes the content to the file
         writer.write(dest); 
         writer.flush();
         writer.close();
		}

	String readFile(BufferedReader bufferedReader) throws IOException {
	    BufferedReader br= bufferedReader;
	    try {
	        StringBuilder sb = new StringBuilder();
	       br.mark(1);
	        if (br.read() != 0xFEFF)
	          br.reset();
            String line = br.readLine();
	        while ((line)!=null) {
	        	
	            sb.append(line);
	            sb.append("\n");
	            line = br.readLine();
	        }
	        return sb.toString();
	    } finally {
	        br.close();

	    }
	}

}
