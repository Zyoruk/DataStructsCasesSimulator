package stack;

import interfaces.StackInterface;
import simplelist.SimpleList;



public class StackWithList<K> extends SimpleList<K> implements StackInterface<K>{

	@Override
    public boolean push(K pk) {
        return insert(pk);
    }
	@Override
    public String top() {
        return describe();
    }
	@Override
    public boolean pop() {
        return delete();
    }

}
