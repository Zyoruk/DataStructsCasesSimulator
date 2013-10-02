package edu.itcr.startec.datastructs.serializing;

import edu.itcr.startec.datastructs.simplelist.SimpleList;

public class Stack<K> extends SimpleList<K>{

    public boolean push(K pk) {
        return insert(pk);
    }

    public String top() {
        return describe();
    }

    public boolean pop() {
        return delete();
    }

}
