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
	 */
	public void Enqueue(K pk);
	/**
	 * Removes the last element
	 */
	public void Dequeue();
	/**
	 * Return the last element
	 * @return
	 */
	public String Peek();
//	/**
//	 * Calculates the time an operation took to execute
//	 * @return a double .
//	 */
//	public double getExecuteTime();
}
