public class Hideout<T> {

    private T hideout;

    public Hideout(){
        
    }

    public void putIntoHideout(T toHide){
        this.hideout = toHide;
    }

    public T takeFromHideout(){
        T prevouslyInHiding = this.hideout;
        this.hideout = null;
        return prevouslyInHiding;
    }

    public boolean isInHideout(){
        return this.hideout != null;

    }

}
