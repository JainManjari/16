import java.util.*;


class DoubleNode{
    Node<Integer> head;
    Node<Integer> tail;
}
public class LinkedList {

	public static Node<Integer> kReverse(Node<Integer> head, int k) {
       
        int count=0;
        Node<Integer> h1=null;
        Node<Integer> t1=null;
        Node<Integer> temp=head;
        while(count!=k && temp!=null)
        {
            if(h1==null)
            {
                h1=temp;
                t1=temp;
            }
            else
            {
                t1=temp;
            }
            temp=temp.next;
            count++;
        }
        DoubleNode h3=reversebetter(h1);
        Node<Integer> h2=temp.next;
        if(h2!=null)
        {
        	 h3.tail.next =kReverse(h2, k);
        }  
        return h3.head;
    }
	public static Node<Integer> reverse(Node<Integer> head)
	{
		if(head==null || head.next==null)
		{
			return head;
		}
		Node<Integer> finalhead=reverse(head.next);
		Node<Integer> temp=finalhead;
		while(temp.next!=null)
		{
			temp=temp.next;
		}
		temp.next=head;
		head.next=null;
		return finalhead;
		
	}
	
 
	
	public static DoubleNode reversebetter(Node<Integer> head)
	{
		if(head==null || head.next==null)
		{
			DoubleNode ans=new DoubleNode();
			ans.head=head;
			ans.tail=head;
			return ans;
		}
		DoubleNode smallans=reversebetter(head.next);
		smallans.tail.next=head;
		head.next=null;
		
		DoubleNode ans=new DoubleNode();
		ans.head=smallans.head;
		ans.tail=head;
		return ans;
		
	}
	
	public static Node<Integer> reversei(Node<Integer> head)
	{
		Node<Integer> current=head;
		Node<Integer> prev=null;
		Node<Integer> temp;
		
		while(current!=null)
		{
			temp=current.next;
			current.next=prev;
			prev=current;
			current=temp;
		}
		return prev;
	}
	
	public static Node<Integer> insertrec(Node<Integer> head, int pos,int ele)
	{
		if(pos==0)
		{
			Node<Integer> newnode=new Node<Integer>(ele);
			head.next=newnode;
			return newnode;
		}
		if(head==null)
		{
			return head;
		}
		head.next=insertrec(head.next,pos-1,ele);
		return head;
	}
	public static Node<Integer> reverseBet(Node<Integer> head)
	{
		if(head==null || head.next==null)
		{
			return head;
		}
		Node<Integer> finalhead=reverseBet(head.next);
		head.next.next=head;
		head.next=null;
		return finalhead;
	}
	public static Node<Integer> takeinput()
	{
		Node<Integer> head=null,tail=null;
		Scanner in=new Scanner(System.in);
		int data=in.nextInt();
		
		while(data!=-1)
		{
			Node<Integer> newnode=new Node<Integer>(data);
			if(head==null)
			{
				head=newnode;
				tail=newnode;
			}
			else
			{
				Node<Integer> temp=tail;
				temp.next=newnode;
				tail=newnode;
			}
			
			data=in.nextInt();
		}
		return head;
	}
	
	public static Node<Integer> insert(Node<Integer> head,int data,int pos)
	{
		Node<Integer> newnode=new Node<Integer>(data);
		if(pos==0)
		{
			newnode.next=head;
			return newnode;
		}
		int i=0;
		Node<Integer> temp=head;
		while(i!=pos-1)
		{
			temp=temp.next;
			i++;
		}
		newnode.next=temp.next;
		temp.next=newnode;
		return head;
		
	}
	
	public static void print(Node<Integer> temp)
	{
		while(temp!=null)
		{
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
	}
	
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		/*Node<String> n1=new Node<String>("a");
		Node<String> n2=new Node<String>("b");
		Node<String> n3=new Node<String>("c");
		n1.next=n2;
		n2.next=n3;
		Node<String> head=n1;
		print(head);
		print(head);*/
		Node<Integer> head=takeinput();
		//print(head);
		//head=insert(head,80,0);
		//Node<Integer> head1=reverse(head);
		 int k=in.nextInt();
		 head=kReverse(head,k);
		//Node<Integer> head1=reverseBet(head);
		//print(head1);
		//Node<Integer> head1=reversei(head);
		//head=insertrec(head,2,10);
		print(head);
		//print(head1.head);

	}


}

