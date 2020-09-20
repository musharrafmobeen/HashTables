import java.util.ArrayList;

public class HashTables {
//Variable Declaration
	ArrayList<ArrayList<HashNode>> arr = new ArrayList<ArrayList<HashNode>>();
	int OutterKey;
	int InnerKey;
	int ArraySize;
	int keys[] =new int[2];
	
//Add a Node to the Hash Table
	public int[] add(HashNode hashnode){
		try{
			HashingFunction(hashnode);
			arr.get(hashnode.getKey()).add(hashnode);
			innerHashingFunction(hashnode);
			keys[0] = hashnode.getKey(); 
			keys[1] = hashnode.getInnerKey(); 
			
		}
		catch(IndexOutOfBoundsException e) {
			ArrayList<HashNode> newArr = new ArrayList<HashNode>();
			HashingFunction(hashnode);
			arr.add(hashnode.getKey(), newArr);
			arr.get(hashnode.getKey()).add(hashnode);
			innerHashingFunction(hashnode);
			keys[0] = hashnode.getKey(); 
			keys[1] = hashnode.getInnerKey(); 
		}
		
		return keys;
	}

	
//Retrieve Data from the Hash Table
	public HashNode read(int key , int innerkey) throws IndexOutOfBoundsException{
		return arr.get(key).get(innerkey);
	}
	
	
//Remove Data from the Hash Table
	public void remove(int key , int innerkey) throws IndexOutOfBoundsException{
		arr.get(key).remove(innerkey);
	}
	
//Reading All Data From Hash Table
	public void readAllData() {
		for(int i=0;i<arr.size();i++) {
			System.out.println(arr.get(i));
		}
	}
	
//Hashing Function for getting the key of the hash node
	public void HashingFunction(HashNode hashnode){
		ArraySize = arr.size()+1;
		OutterKey = hashnode.getValue().hashCode() % ArraySize;
		hashnode.setKey(OutterKey);
	}
	
	
//Hashing Function for getting the Inner key of the hash node
	public void innerHashingFunction(HashNode hashnode){
		int InnerKey = arr.get(hashnode.getKey()).size() - 1;
		hashnode.setInnerKey(InnerKey);
	}
}
