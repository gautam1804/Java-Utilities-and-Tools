import com.thinking.machines.util.*;

class KeyboardTestCase
{
public static void main(String gg[])
{
Keyboard k=new Keyboard();
String a;
System.out.print("ENTER A STRING : ");
a = k.getString();
String b;
b=k.getString("ENTER ANOTHER STRING : ");
char c;
c=k.getCharacter("ENTER GENDER (M/F) : ");
long d=k.getLong("ENTER A LONG TYPE VALUE : ");
int e=k.getInt("ENTER A INT TYPE VALUE : ");
short f=k.getShort("ENTER A SHORT TYPE VALUE : ");
byte g=k.getByte("ENTER A BYTE TYPE VALUE : ");
double h=k.getDouble("ENTER A DOUBLE TYPE VALUE : ");
float i=k.getFloat("ENTER A FLOAT TYPE VALUE : ");
boolean j=k.getBoolean("ENTER A BOOLEAN TYPE VALUE : ");
System.out.println(a);
System.out.println(b);
System.out.println(c);
System.out.println(d);
System.out.println(e);
System.out.println(f);
System.out.println(g);
System.out.println(h);
System.out.println(i);
System.out.println(j);
}
}