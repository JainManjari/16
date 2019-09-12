import java.util.*;

public class Map<K,V> {
	ArrayList<MapNode<K,V>> buckets;
	int size;
	int numBuckets;
	
	public Map()
	{
		numBuckets=20;
		size=0;
		buckets=new ArrayList<>();
		for(int i=0;i<20;i++)
		{
			buckets.add(null);
		}
	}
	
	private int getBucketIndex(K key)
	{
		int bucket=key.hashCode();
		return bucket%numBuckets;
	}
	
	public void insert(K key, V value)
	{
		int bucketIndex=getBucketIndex(key);
		MapNode<K,V> head=buckets.get(bucketIndex);
		while(head!=null)
		{
			if(head.key.equals(key))
			{
				head.value=value;
				return;
			}
			head=head.next;
		}
		size++;
		head=buckets.get(bucketIndex);
		MapNode<K,V> newNode=new MapNode<>(key,value);
		newNode.next=head;
		buckets.set(bucketIndex, newNode);
		double loadFactor=(1.0*size)/numBuckets;
		if(loadFactor>0.7)
		{
			rehash();
		}
		
	}
	
	private void rehash()
	{
		System.out.println(numBuckets+" "+size);
		ArrayList<MapNode<K,V>> temp=buckets;
		buckets=new ArrayList<>();
		for(int i=0;i<2*numBuckets;i++)
		{
			buckets.add(null);
		}
		size=0;
		numBuckets*=2;
		for(int i=0;i<temp.size();i++)
		{
			MapNode<K,V> head=temp.get(i);
			while(head!=null)
			{
				K key=head.key;
				V value=head.value;
				insert(key,value);
				head=head.next;
			}
		}
		
		
	}
	
	public double loadFactor()
	{
		return (1.0*size)/numBuckets;
	}
	
	public int size()
	{
		return size;
	}
	
	public V getValue(K key)
	{
		int bucketIndex=getBucketIndex(key);
		MapNode<K,V> head=buckets.get(bucketIndex);
		while(head!=null)
		{
			if(head.key.equals(key))
			{
				return head.value;
			}
			head=head.next;
		}
		return null;
	}
	
	public V removeKey(K key)
	{
		int bucketIndex=getBucketIndex(key);
		MapNode<K,V> head=buckets.get(bucketIndex);
		MapNode<K,V> prev=null;
		while(head!=null)
		{
			if(head.key.equals(key))
			{
				if(prev==null)
				{
					buckets.set(bucketIndex, head.next);
				}
				else
				{
					prev.next=head.next;
				}
				size--;
				return head.value;
			}
			prev=head;
			head=head.next;
		}

		return null;
	}
	
	public static void main(String args[])
	{
		
	}

}

