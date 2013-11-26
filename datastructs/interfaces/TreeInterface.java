package interfaces;

public interface TreeInterface<K> extends DataStructure<K> {
	/**
	 * @return returns the length
	 */
	public int length();
	/**
	 * @return boolean if tree is empty
	 */
	public boolean isEmpty();
	/**
	 * inserts a node
	 * @param pk
	 * @return able or not
	 */
    public boolean insert(K pk);
    /**
     * deletes a node
     * @param pk
     * @return able or not
     */
    public boolean delete(K pk);
    /**
     * Searches a node
     * @return existed or not
     */
    public boolean exists(K pk);
    /**
     * Clears the tree
     * @return able or not
     */
    public boolean setEmpty();
    
}