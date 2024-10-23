import java.util.StringTokenizer; 
public class Main 
{ 
public static void main(String[] args) { 
StringTokenizerst = new StringTokenizer("5 6 7"); 
int sum=0; 
while (st.hasMoreTokens()) { 
int num=Integer.valueOf(st.nextToken()); 
sum=sum+num; 
} 
System.out.println(sum); 
} 
}
