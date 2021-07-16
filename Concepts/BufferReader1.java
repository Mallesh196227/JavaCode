import java.io.*;
public class BufferReader1 {

	public static void main(String[] args) throws IOException  {
	BufferedReader br = new BufferedReader ( new InputStreamReader(System.in));
	
	System.out.println("Please enter first num");
	int x = Integer.parseInt(br.readLine());
	
	System.out.println("Please enter second num");
	int y= Integer.parseInt(br.readLine());
	
	System.out.println("Sum i s:" + (x+y) );
	
	}

}