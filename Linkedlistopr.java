import java.io.*;
import java.util.*;
class Linkedlistopr
{
    public static void main(String args[])
    {
        LinkedList<Integer> ll=new LinkedList<Integer>();
        System.out.println("List Operations\n1. Insertion\n2. Deletion\n3. Display\n4. Exit");
		while(true){
			System.out.println("Enter your choice : ");
            Scanner obj=new Scanner(System.in);
			int select=obj.nextInt();
			switch(select)
			{
				case 1:
				System.out.println("Enter element and position for insertion : ");
				int ele=obj.nextInt();
				int pos=obj.nextInt();
				ll.add(pos-1,ele);
				System.out.println(ele+" added");
				break;

				case 2:
				System.out.println("Enter position of element to be deleted : ");
				int del=obj.nextInt();
				ll.remove(del-1);
				System.out.println("Element deleted");
				break;

				case 3:
				System.out.println("Elements in the list are : "+ll);
				break;

				case 4:
				System.exit(0);

				default:
				System.out.println("Enter valid operation ");
				break;

			}
		}

    }
}
