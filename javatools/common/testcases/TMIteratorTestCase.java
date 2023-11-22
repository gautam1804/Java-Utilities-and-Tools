import com.thinking.machines.util.*;

class TMIteratorTestCase
{
public static void main(String gg[])
{
TMLinkedList list1=new TMLinkedList();
list1.add(34);
list1.add(54);
list1.add(64);
list1.add(74);
list1.add(84);

TMArrayList list2=new TMArrayList();
list2.add(5);
list2.add(6);
list2.add(7);
list2.add(8);
list2.add(9);
System.out.println("Iterating the Linked list ");
TMIterator iterator1=list1.iterator();
int x;
while(iterator1.hasNext())
{
x=iterator1.next();
System.out.println(x);
}

System.out.println("Iterating the Array list ");
TMIterator iterator2=list2.iterator();

while(iterator2.hasNext())
{
x=iterator2.next();
System.out.println(x);
}
}}