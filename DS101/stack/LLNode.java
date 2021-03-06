package stack;

public class LLNode<T> {

    protected T info;
    protected LLNode<T> link;

    public LLNode(T info){
        this.info = info;
        link = null;
    }

    public T getInfo(){return info;}
    public void setInfo(T info){this.info = info;}
    public void setLink(LLNode<T> link){ this.link = link;}
    public LLNode<T> getNode(){return this.link;}
    @Override
    public String toString(){ return getInfo().toString();}

}
