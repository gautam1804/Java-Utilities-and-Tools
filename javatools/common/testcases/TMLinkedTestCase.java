import com.thinking.machines.util.*;

class TMLinkedTestCase
{
public static void main(String gg[])
{
TMLinkedList list1=new TMLinkedList();
int x; 
list1.add(40);
list1.add(30);
list1.add(20);
for( x=0;x<list1.size();x++) 
{
System.out.println(list1.get(x));
}
System.out.println("AFTER INSERTING ");
list1.insert(2,5);
list1.insert(3,6);
list1.insert(25,9);
for(x=0;x<list1.size();x++) System.out.println(list1.get(x));
System.out.println("REMOVING : "+list1.removeAt(2));
System.out.println("ELEMENT OF THE 2 INDEX IS REMOVED ");
for(x=0;x<list1.size();x++) System.out.println(list1.get(x));
System.out.println("REMOVING : "+list1.removeAt(4));
System.out.println("ELEMENT OF THE 4 INDEX IS REMOVED ");
for(x=0;x<list1.size();x++) System.out.println(list1.get(x));
System.out.println("UPDATING 3 INDEX ");
list1.update(3,3003);
System.out.println("UPDATING 2 INDEX ");
list1.update(2,4003);
for(x=0;x<list1.size();x++) System.out.println(list1.get(x));
TMLinkedList list2=new TMLinkedList();
list2.add(20);
list2.add(30);
list2.add(240);
System.out.println("APPENDING FROM LIST1 TO LIST2 :");
list2.appendFrom(list1);
for(x=0;x<list2.size();x++) System.out.println(list2.get(x));
System.out.println("APPENDING TO LIST1 FROM LIST2 :");
list2.appendTo(list1);
for(x=0;x<list1.size();x++) System.out.println(list1.get(x));
}
}