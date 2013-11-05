package interfaces;


public interface StackInterface<K> extends ListInterface<K>{
    public boolean push(K pk);
    public String top();
    public boolean pop();
    public float getExecuteTime();
}
