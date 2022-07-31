import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

class copy
{
      FileInputStream instram = null;
      FileOutputStream outstram = null;        

      try{
	File infile = new File("C:\Users\Shubhangi\Documents\JAVA\inputfile.txt");
	File infile = new File("C:\Users\Shubhangi\Documents\JAVA\outputfile.txt");

	instream = new FileInputStream(infile);
	outstream = new FileOutputStream(infile);
	
	byte[] buffer = new byte[1024];

	int l;

	while((l = instream.read(buffer)>0)
	{
 	        outstream.write(buffer,0,l);
	}

	System.out.println("copying");
          }catch(Exception e){
e.printStackTrace();	

}
public static void main(String args[])