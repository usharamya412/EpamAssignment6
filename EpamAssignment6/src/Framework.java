import java.util.*;
public class Framework{
   public static void main(String[] args){
	   TreeSet<String> set=new TreeSet<>();
	   //adding elements to the TreeSet
	   set.add("subha");
	   set.add("sravani");
	   set.add("ramya");
	   set.add("lucky");
	   set.add("usha");
	   set.add("lakshmi");
	   set.add("janu");
	   set.add("priya");
	   set.add("dharani"); 
	   set.add("pavani");
	   Iterator<String> itr=set.iterator();  
	   while(itr.hasNext()){  
	   System.out.println(itr.next());  
	   }
	   set.remove("pavani");
	   System.out.println("***after removing an element from treeset****");
	   System.out.println(set);
	   set.remove("lucky");
	   System.out.println("***after removing another element from treeset****");
	   System.out.println(set);
	   System.out.println("***headSet method gives elements which are less than the given");
       System.out.println(set.headSet("janu"));
	   System.out.println("***tailSet method gives elements which are greater than the given");
       System.out.println(set.tailSet("usha"));
	   System.out.println("***The size of treeset is*** ");
	   System.out.println(set.size());
	   System.out.println("***pollfirst method retrieves and removes lowest element");
	   System.out.println(set.pollFirst());
     }
}