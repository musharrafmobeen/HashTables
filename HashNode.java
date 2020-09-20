public class HashNode {
//Variable Declaration
	private Object Value;
	private int OutterKey;
	private int InnerKey;
	
	
//Parameterized Constructor
	public HashNode(Object value) {
		Value = value;
		OutterKey = value.hashCode();
		InnerKey = 0;
	}
	
	
// Getter and Setters for Attributes
	public Object getValue() {
		return Value;
	}
	
	
	public void setValue(Object value) {
		Value = value;
		OutterKey = value.hashCode();
		InnerKey = 0;
	}
	
	
	public void setInnerKey(int innerKey) {
		InnerKey = innerKey;
	}


	public void setKey(int key) {
		OutterKey = key;
	}


	public int getInnerKey() {
		return InnerKey;
	}


	public int getKey() {
		return OutterKey;
	}
}
