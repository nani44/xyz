import java.util.*;
class CompareEx{
public static void main(String[] args){
	TreeSet t=new TreeSet(new MyCompare());
	t.add(45);
	t.add(14);
	t.add(45);
	t.add(-52);
	t.add(21);
	t.add(0);
	t.add(52);
	t.add(8);

	System.out.println(t);
}
}
class MyCompare implements Comparator{
public int compare(Object obj1,Object obj2)
	{
	Integer i1=(Integer)obj1;
	Integer i2=(Integer)obj2;

	if(i1<i2)
	return +1;
	else if(i1>i2)
	return -1;
	else 
	return 0;
}
}
