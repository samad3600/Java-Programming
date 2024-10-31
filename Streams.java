import java.io.*; 
public class FileStreamTest { 
public static void main(String[] args) { 
try 
{ 
byte bWrite [] = {11,21,3,40,5}; 
OutputStreamos = new FileOutputStream("test.txt"); 
for(int x = 0; x <bWrite.length ; x++) 
os.write( bWrite[x] ); // writes the bytes 
InputStream is = new FileInputStream("test.txt"); 
System.out.println("Available bytes in file: "+is.available()); 
int line; 
while ((line=is.read()) != -1) { 
System.out.print((int)line+" "); 
} 
} 
catch (Exception e) { 
e.printStackTrace(); 
} 
} 
}
