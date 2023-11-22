import com.thinking.machines.util.*;

class TMArrayTestCase
{
public static void main(String gg[])
{
TMArrayList list1=new TMArrayList();
list1.add(40);
list1.add(30);
list1.add(20);
for(int x=0;x<list1.size();x++) 
{
System.out.println(list1.get(x));
}
TMArrayList list2=new TMArrayList();
list2.copyFrom(list1);
for(int x=0;x<list2.size();x++) 
{
System.out.println(list2.get(x));
}
}
}