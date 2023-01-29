public class _03_Verialbes {
    public static void main(String[] args) {
        //if I am going to store some data in the program (number, counter, some total and so on)
        // I need to say how much space I want on my computer and the name of the variable
        // int number -> INTEGER new integer
        // int number; // allocates an int in memory ( RAM < volatile memory)
        // the name of this reserved place is called a number -> number=5;

        int number; // give me a place to store an integer as an int, name it "number".
        int Number; // number The number is completely different, like a and z
        int number1; // totally different
        int numberSums;

        number=5; // I gave the number 5
        System.out.println("say"); // writes the number word
        System.out.println(number); // 5
        System.out.print("number="); // number=
        System.out.println(number); // count=5

        System.out.println("number="+number); // put the value of the number next to the number= constant
        System.out.println("**************************************************************");

        //For Example

        int shortEdge=5;
        int longEdge=7;
        int circumferenc;

        circumferenc=2*(shortEdge+longEdge);

        System.out.println("Circumference = " + circumferenc);



    }
}
