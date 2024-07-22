package dictionary;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Scanner;

public class SaveableDictionary {

    private HashMap<String, String> dictionary;
    private String file;
    private Scanner scanner;

    public SaveableDictionary(){
        this.dictionary = new HashMap<>();

    }

    public SaveableDictionary(String file){
        this.dictionary = new HashMap<>();
        this.file = file;

    }

    public boolean load(){
        try{
            this.scanner = new Scanner(Paths.get(this.file));

            while(this.scanner.hasNextLine()){
                String line = this.scanner.nextLine();
                String[] parts = line.split(":");
                this.dictionary.put(parts[0], parts[1]);
            }
        }catch(IOException e){
            System.out.println("Error: " + e.getMessage());
        }

        return true;
        
    }

    public boolean save(){
        String key = "";
        String value = "";
        try{
            PrintWriter writer = new PrintWriter(this.file);
            for(String existingWord: this.dictionary.keySet()){
                key = existingWord;
                value = this.dictionary.get(existingWord);
                writer.println(key + ":" + value);
            }
            writer.close();
            return true;
        }catch(FileNotFoundException e){
            System.out.println("Error: " + e.getMessage());
            return false;
        }
    }

    public void add(String words, String translation){
        if(!this.dictionary.containsKey(words)){
            this.dictionary.put(words, translation);

        }
    }

    public String translate(String word){
        //return word translation or if not exist, return null
        String wordToReturn = null;
        for(String existingWord: this.dictionary.keySet()){
            if(existingWord.equals(word)){
                wordToReturn = this.dictionary.get(existingWord);
            }
            else if(this.dictionary.get(existingWord).contains(word)){
                wordToReturn = existingWord;
            }
            
            
        }
        return wordToReturn;
    }

    public void delete(String word){
        
        this.dictionary.remove(word);

        String key = null;

        for (String x : this.dictionary.keySet()) {
            if (this.dictionary.get(x).contains(word)) {
                key = x;
            }
        }

        this.dictionary.remove(key, word);
            
    }
}
