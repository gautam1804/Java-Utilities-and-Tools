package com.thinking.machines.util;

public class TMLinkedList<T> implements TMList<T>
{
class TMNode<T>
{
public T data;
public TMNode<T> next;
TMNode()
{
this.data=null;
this.next=null;
}
}

private TMNode<T> start,end;
private int size;

public class TMLinkedListIterator<T> implements TMIterator<T>
{
private TMNode<T> ptr;
public TMLinkedListIterator(TMNode<T> ptr)
{
this.ptr=ptr;
}
public boolean hasNext()
{
return this.ptr!=null;
}
public T next()
{
if(ptr==null) throw new InvalidIteratorException("Iterator has no more elements");
T data=this.ptr.data;
this.ptr=this.ptr.next;
return data;
}
}
public TMIterator iterator()
{
return new TMLinkedListIterator<T>(this.start);
}
public TMLinkedList()
{
this.start=null;
this.end=null;
this.size=0;
}
public void add(T data)
{
TMNode<T> t=new TMNode<T>();
t.data=data;
if(this.start==null)
{
this.start=t;
this.end=t;
}
else
{
this.end.next=t;
end=t;
}
this.size++;
}
public void add(int index,T data)
{
insert(index,data);
}
public void insert(int index,T data)
{
if(index<0) throw new ArrayIndexOutOfBoundsException("INVALID INDEX : "+index);
if(index>=size)
{
add(data);
return;
}
TMNode<T> node=new TMNode<T>();
node.data=data;
if(index==0)
{
node.next=this.start;
this.start=node;
}
else
{
TMNode<T> j,k;
int i=0;
j=this.start;
k=null;
while(i<index)
{
k=j;
j=j.next;
i++;
}
k.next=node;
node.next=j;
}
this.size++;
}
public void removeAll()
{
this.clear();
}

public T removeAt(int index)
{
if(index<0||index>=this.size) throw new ArrayIndexOutOfBoundsException("INVALID INDEX : "+index);
T data;
if(start==end)
{
data=this.start.data;
this.start=null;
this.end=null;
this.size=0;
return data;
}
if(index==0)
{
data=this.start.data;
this.start=this.start.next;
this.size--;
return data;
}
TMNode<T> j,k;
j=this.start;
k=null;
int i=0;
while(i<index)
{
k=j;
j=j.next;
i++;
}
data=j.data;
k.next=j.next;
if(this.end==j) this.end=k;
this.size--;
return data;
}

public void clear()
{
this.size=0;
this.start=null;
this.end=null;
}

public int size()
{
return this.size;
}

public T get(int index)
{
if(index<0|| index>=this.size()) throw new ArrayIndexOutOfBoundsException("INVALID INDEX : "+index );
TMNode<T> t;
t=start;
int x=0;
while(x<index)
{
t=t.next;
x++;
}
return t.data;
}
public void update(int index,T data)
{
if(index<0||index>=size) throw new ArrayIndexOutOfBoundsException("INVALID INDEX : "+index);
if(index==0)
{
this.start.data=data;
return;
}
if(index==this.size-1)
{
this.end.data=data;
return;
}
TMNode<T> j;
int i=0;
j=this.start;
while(i<index)
{
j=j.next;
i++;
}
j.data=data;
return;
}
public void copyTo(TMList<T> other)
{
other.clear();
for(int r=0;r<this.size();r++)
{
other.add(this.get(r));
}
}
public void copyFrom(TMList<T> other)
{
this.clear();
for(int r=0;r<other.size();r++)
{
this.add(other.get(r));
}}
public void appendTo(TMList<T> other)
{
for(int r=0;r<this.size();r++)
{
other.add(this.get(r));
}
}
public void appendFrom(TMList<T> other)
{
for(int r=0;r<other.size();r++)
{
this.add(other.get(r));
}
}
public void forEach(TMListItemAcceptor<T> a)
{
if(a==null) return;
TMNode<T> t;
for(t=start; t!=null;t=t.next)
{
a.accept(t.data);
}
}
}