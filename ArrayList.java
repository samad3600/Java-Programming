import java.util.*; 
classJavaExample{ 
public static void main(String args[]){ 
ArrayList<String>alist=newArrayList<String>(); 
alist.add("Steve"); 
alist.add("Tim"); 
alist.add("Lucy"); 
alist.add("Pat"); 
alist.add("Angela"); 
alist.add("Tom"); 
//displaying elements 
System.out.println(alist); 
//Adding "Steve" at the fourth position 
alist.add(3, "Steve"); 
//displaying elements 
System.out.println(alist); 
} 
}
