package edu.itcr.startec.datastructs;

public interface ListInterface<K> {
	public int length();
	public boolean isEmpty();
    public boolean append(K pk);
    public boolean delete(K pk);
    public boolean delete();
    public boolean exists(K pk);
    public boolean insert(int pos, K pk);
    public boolean insert(K pk);
    public boolean clear();
    public boolean cut();
    public String describe();
}