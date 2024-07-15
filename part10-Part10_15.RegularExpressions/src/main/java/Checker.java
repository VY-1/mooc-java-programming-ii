

public class Checker {


    /*
     Use regular expressions to create the method public boolean isDayOfWeek(String string),
    which returns true if the parameter string is an abbreviation of a day of the week (mon, tue, wed, thu, fri, sat, sun)

    Example outputs of a program that uses the method:

    Sample output
    Enter a string: tue
    The form is correct.

    Enter a string: abc
    The form is incorrect.
     */
    
    public boolean isDayOfWeek(String string){
        if(string.matches("mon|tue|wed|thu|fri|sat|sun")){
            return true;
        }
        else{
            return false;
        }
    }

    /*
    For simplicity's sake, in this exercises the letters that are considered vowels are: a, e, i, o, and u.

    Create the method public boolean allVowels(String string) that uses a regular expression to check whether all the characters in the parameter string are vowels.
     */
    public boolean allVowels(String string) {
        if (string.matches("[a|e|i|o|u]+")){
            return true;
        }
        return false;
    }
    
    /*
    Regular expressions come in handy in certain situations. In some cases the expressions become too complex, and the "correctness" of the string is best checked with some other style. Or it could be beneficial to use regular expressions for only some part of the check.

    Create the method public boolean timeOfDay(String string). It should use a regular expression to check whether the parameter string expresses a time of day in the form hh:mm:ss (hours, minutes, and seconds each always take up two spaces).

    NB. In this exercise we use the 24-hour clock. So the acceptable values are between 00:00:00 and 23:59:59.
     */
    public boolean timeOfDay(String string){
        if (string.matches("([0-1][0-9]|[2][0-3]):[0-5][0-9]:[0-5][0-9]")){
            return true;
        }
        return false;
    }
}

/*
public class Checker {
 
    public boolean isDayOfWeek(String string) {
        return string.matches("mon|tue|wed|thu|fri|sat|sun");
    }
 
    public boolean allVowels(String string) {
        return string.matches("[aeiou]*");
    }
 
    public boolean timeOfDay(String string) {
        return string.matches("([01][0123456789]|2[0123]):[012345][0123456789]:[012345][0123456789]");
    }
}  
 
 */