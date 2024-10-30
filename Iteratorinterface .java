import java.util.*; 
import java.util.Iterator; 
class Test_Iterator 
{ 
public static void main(String[] args) 
{ 
ArrayList< String>ar = new ArrayList<String>(); 
ar.add("ab"); 
ar.add("bc"); 
ar.add("cd"); 
ar.add("de"); 
Iterator it = ar.iterator(); 
//Declaring Iterator 
while(it.hasNext()) 
{ 
System.out.print(it.next()+" "); 
} 
} 
}
