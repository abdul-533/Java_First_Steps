public class _02_EscapeCharacters {

    public static void main(String[] args) {

//          ESCAPE CHARACTERS:

//        \n open new line.
//        \t -> returns a space as if the tab key was pressed.
//        \b-> back-space deletes one character back.
//        \" -> Used to write quotes.
//        \\-> \ screen to write.
//        \r-> returns to the beginning of the line and deletes the line from beginning to end.

        System.out.println("Hello World");                // Write  Hello World  on screen.
        System.out.println("Hello\nWorld");               // World  goes to the bottom line
        System.out.println("Hello\tWorld");               // Hello  World
        System.out.println("Hello\bWorld");               // HelloWorld
        System.out.println("Hello\"World");               // Hello"World
        System.out.println("Hello\\World");               // Hello\World
        System.out.println("Hello\rWorld");               // World


        // For Example

        System.out.println("\"Hello\t\",\t\"World\t\\/\"");    //  "Hello ", "World  \ /"


    }
}
