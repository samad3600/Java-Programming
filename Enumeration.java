import java.util.Enumeration; 
import java.util.Vector; 
class EnumerationTest 
{ 
public static void main(String arg[]) 
{ 
Enumeration<String> days; 
Vector<String>dayNames =newVector<String>(); 
dayNames.add("Monday"); 
dayNames.add("Tuesday"); 
dayNames.add("Wednesday"); 
dayNames.add("Thursday"); 
dayNames.add("Friday"); 
dayNames.add("Saturday"); 
dayNames.add("Sunday"); 
// Assigns vector elements to enumeration 
days = dayNames.elements(); 
while(days.hasMoreElements()){// LINE A 
System.out.println(days.nextElement());// LINE B 
} 
} 
}
