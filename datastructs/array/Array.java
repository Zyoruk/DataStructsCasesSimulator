package array;

import java.util.ArrayList;

import interfaces.DataStructure;

/**
 * 
 * @author zyoruk
 *
 * Class that takes the already implemented ArrayList in java and makes it implement
 * from data structure merely for project purposes, since we need that every structure
 * implements the same interface.
 * @param <K>
 */
@SuppressWarnings("serial")
public class Array<K> extends ArrayList<K> implements DataStructure<K> {	
	public Array(){
		super();
	}
	@Override
	/**
	 * Takes the size of the array.
	 * @return the length
	 */
	public int length() {
		return this.size();
	}

	@Override
	/**
	 * Checks if the size is 0.
	 * return true if 0, otherwise false
	 */
	public boolean isEmpty() {
		if(length()== 0){
			return true;
		}else{
			return false;
		}
	}

	@Override
	
	/**
	 * Build a string with every element of the array and its length.
	 * @return the string built.
	 */
	public String describe() {
        StringBuilder result = new StringBuilder();

        result.append("List: ");
        for(int i = 0 ; i < this.length(); i++) {
            result.append(String.format("%s ", this.get(i).toString()));
        }
        result.append("\n");

        result.append(String.format("Length: %d\n", this.length()));
        return result.toString();
	}

	@Override
	/**
	 * Checks if the data already exists into the array
	 * @return True if it exists.
	 */
	public boolean exists(K pk) {		
		return super.contains(pk);
	}
	
	/**
	 * Add the element to the last position of the array
	 * @param pk element to add
	 * @return if it was able to add
	 */
	public boolean append(K pk){
		return super.add(pk);
	}
	
	/**
	 * Delete the element
	 * @param pk element to delete
	 * @return if it was able to delete
	 */
	public boolean delete(K pk){
		return super.remove(pk);
	}
}
