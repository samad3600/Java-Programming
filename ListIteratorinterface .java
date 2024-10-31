import java.util.*; 
import java.util.ListIterator; 
class Test_ ListIterator 
{ 
public static void main(String[] args) 
{ 
ArrayList< String>ar = new ArrayList<String>(); 
ar.add("ab"); 
ar.add("bc"); 
ar.add("cd"); 
ar.add("de"); 
ListIteratorlitr = ar.listIterator(); 
while(litr.hasNext()) //In forward direction 
{ 
System.out.print(litr.next()+" "); 
} 
while(litr.hasPrevious()) //In backward direction 
{ 
System.out.print(litr.previous()+" "); 
} 
} 
} 
