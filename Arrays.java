
/**
 * Write a description of class RenameThisClass here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Arrays
{
    public static void main(String[] args) {
        System.out.println("Hello World!");
        int i;
        float f = 2.5f;
        boolean flag = true;
        i = 10;
        f += i;
        flag = !flag;
        i++;
        System.out.println(i);
        System.out.println(f);
        System.out.println(flag);
        String string1 = "I am a string";
        String string2 = string1;
        String string3 = "I am also a string";
        boolean stringsEqual = string1.equals(string3);
        String[] strArray = {"Alpha","Bravo","Charlie","Delta","Echo"
        };
        for (int iterate = 0; iterate < strArray.length; iterate++) {
            System.out.println(strArray[iterate]);
        }
        for (int iterate = 0; iterate < strArray.length; iterate++) {
            System.out.print(strArray[iterate]);
        }
        for (int iterate = 0; iterate < strArray.length; iterate++) {
            System.out.print(strArray[iterate]);
            System.out.print("-");
        }
        }
    }