/**
 * 
 */
package interfaces;

/**
 * @author zyoruk
 *
 */
public interface DataStructure <K> {
	/**
	 * Return the size of the list
	 * @return an integer
	 */
	public int length();
	
	/**
	 * checks if the list is empty
	 * @return true or false
	 */
	public boolean isEmpty();
	
    /**
     * Describes the list. Length, head , list, tail.
     * @return a description of the list.
     */
    public String describe();
	
    /**
     * Checks if the element is already in the list
     * @param pk
     * @return
     */
    public boolean exists(K pk);
}
