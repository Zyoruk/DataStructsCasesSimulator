package interfaces;

public interface TreeInterface<K> extends DataStructure<K> {
	
	public int length();
	public boolean isEmpty();
    public boolean insert(K pk);
    public boolean delete(K pk);
    public boolean exists(K pk);
    public boolean setEmpty();
    
}