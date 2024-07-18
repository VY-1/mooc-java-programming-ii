package mooc.ui;

public class TextInterface implements UserInterface{

    public TextInterface(){

    }

    @Override
    public void update(){
        System.out.println("Updateing UI");
    }

}
