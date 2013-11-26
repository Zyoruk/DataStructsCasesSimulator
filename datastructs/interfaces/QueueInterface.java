/**
 * 
 */
package interfaces;

/**
 * @author zyoruk
 * this interface is to specify the methods every queue should implement.
 */
public interface QueueInterface<K> extends DataStructure<K> {
	/**
	 * Adds the element in the first position
	 * @param pk
	 * @return 
	 */
	public void Enqueue(K pk);
	/**
	 * Removes the last element
	 */
	public int Dequeue();
}
