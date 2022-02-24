import java.io.*;
import java.util.*;
class Arrayopr
{
	public static void main(String args[])
	{
		ArrayList<Integer> al= new ArrayList<>();
		int[] a=new int[10];
		System.out.println("Enter Number of Elements in ArrayList : ");
		Scanner obj=new Scanner(System.in);
		int n=obj.nextInt();
                int select;
		System.out.println("Enter the elements : ");
		for(int i=0;i<n;i++)
		{
			a[i]=obj.nextInt();
			al.add(a[i]);
		}
		System.out.println("Array Operations\n1. Insertion\n2. Deletion\n3. Display\n4. Exit");
		do
                {
			System.out.println("Enter your choice : ");
			select=obj.nextInt();
			switch(select)
			{
				case 1:
				System.out.println("Enter element and position for insertion : ");
				int ele=obj.nextInt();
				int pos=obj.nextInt();
				al.add(pos-1,ele);
				System.out.println(ele+" added");
				break;
				case 2:
				System.out.println("Enter position of element to be deleted : ");
				int del=obj.nextInt();
				al.remove(del-1);
				System.out.println("Element deleted");
				break;
				case 3:
				System.out.println("Elements in the list are : "+al);
				break;
				case 4:
				System.exit(0);

                                default:
				System.out.println("Enter valid operation ");
				break;
                      }
                } while(select < 5);
        }

}
