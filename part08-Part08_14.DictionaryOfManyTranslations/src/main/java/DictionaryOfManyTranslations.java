import java.util.ArrayList;
import java.util.HashMap;

public class DictionaryOfManyTranslations {

    private HashMap <String, ArrayList<String>> dictionaryList;

    public DictionaryOfManyTranslations(){
        this.dictionaryList = new HashMap<>();
    }

    public void add(String word, String translation){
        // an empty list has to be added for a new word if one has not already been added
        this.dictionaryList.putIfAbsent(word, new ArrayList<>());
        
        //let's first retrieve the list containing the translation by word
        ArrayList<String> translationList = dictionaryList.get(word);
        translationList.add(translation);

        //can be done in a single line
        //this.dictionaryList.get(word).add(translation);


    }

    public ArrayList<String> translate(String word){
        //returns a list of the translations added for the word. If the word has no translations, the method should return an empty list.

        // if(!this.dictionaryList.containsKey(word)){
        //     return new ArrayList<>();
        // }
        // return this.dictionaryList.get(word);

        return dictionaryList.getOrDefault(word, new ArrayList<>());
    }

    public void remove(String word){
        this.dictionaryList.remove(word);
    }
}
