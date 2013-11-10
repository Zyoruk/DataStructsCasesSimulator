package interfaces;
/**
 * @author zyoruk
 * This is the model every List should follow.
 * @param <K> This implements Generics, which means we could build a list of 
 * any type.
 */
public interface ListInterface<K> extends DataStructure<K> {
	/**
	 * Adds at the end of the list
	 * @param pk
	 * @return
	 */
    public boolean append(K pk);
    
    /**
     * deletes the element specified as a parameter
     * @param pk
     * @return
     */
    public boolean delete(K pk);
    
    /**
     * Deletes the first element
     * @return
     */
    public boolean delete();
    
    /**
     * Inserts at the specified position
     * @param pos integer
     * @param pk element to insert
     * @return
     */
    public boolean insert(int pos, K pk);
    
    /**
     * Insert the elementn in the first position
     * @param pk
     * @return
     */
    public boolean insert(K pk);
    
    /**
     * Clears the list
     * @return
     */
    public boolean clear();
    
    /**
     * removes the last element of the list
     * @return
     */
    public K cut();
//
//	/**
//	 * calcualtes the time an operation took to execute
//	 * @return
//	 */
//    public double getExecuteTime();
}