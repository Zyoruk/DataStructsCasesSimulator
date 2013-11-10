package array;

import java.util.ArrayList;

import interfaces.DataStructure;

@SuppressWarnings("serial")
public class Array<K> extends ArrayList<K> implements DataStructure<K> {	
	public Array(){
		super();
	}
	@Override
	public int length() {
		return this.size();
	}

	@Override
	public boolean isEmpty() {
		if(length()== 0){
			return true;
		}else{
			return false;
		}
	}

	@Override
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
	public boolean exists(K pk) {		
		return super.contains(pk);
	}
	
	public boolean append(K pk){
		return super.add(pk);
	}
	
	public boolean delete(K pk){
		return super.remove(pk);
	}

	public boolean search(K pk){
		return super.contains(pk);
	}
}
