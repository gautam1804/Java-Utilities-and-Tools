package com.thinking.machines.util;

import java.io.*;

public class PWPrintln
{
public static void main(String gg[])
{
try
{
String fileName=gg[0];
File file=new File(fileName);
if(!(file.exists()))
{
System.out.println("File : "+fileName+" does not exist.");
return;
}
RandomAccessFile randomAccessFile=new RandomAccessFile(file,"rw");
File tmpFile=new File("tmp.tmp");
if(tmpFile.exists()) tmpFile.delete();
RandomAccessFile tmpRandomAccessFile=new RandomAccessFile(tmpFile,"rw");
String line;
while(randomAccessFile.getFilePointer()<randomAccessFile.length())
{
line=randomAccessFile.readLine();
line=line.replaceAll("\"","\\\\\"");
tmpRandomAccessFile.writeBytes("pw.println(\""+line+"\");\r\n");
}
randomAccessFile.close();
tmpRandomAccessFile.close();
}catch(Exception e)
{
System.out.println("Problem : "+e.getMessage());
}
}
}