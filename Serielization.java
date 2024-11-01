import java.io.*; 
class Studentinfo implements Serializable 
{ 
String name; 
int rid; 
static String contact; 
studentinfo(String n, int r, String c) 
{ 
this.name = n; 
this.rid = r; 
this.contact = c; 
} 
} 
public class SerializableDemo 
{ 
public static void main(String args[])throws Exception 
{ 
Studentinfosi = new Studentinfo("Abhi", 104, "110044"); 
System.out.println("Serialization started"); 
FileOutputStreamfos = new FileOutputStream("student.ser"); 
ObjectOutputStreamoos = new ObjectOutputStream(fos); 
oos.writeObject(si); 
System.out.println("Serialization ended"); 
System.out.println("Deserialization started"); 
FileInputStreamfis = new FileInputStream("student.ser"); 
ObjectInputStreamois = new ObjectInputStream(fis); 
si = (studentinfo)ois.readObject(); 
System.out.println("Deserialization ended"); 
System.out.println("student object details:"); 
System.out.println(si.name); 
System.out. println(si.rid); 
System.out.println(si.contact); 
} 
} 
