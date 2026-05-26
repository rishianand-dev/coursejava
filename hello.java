// lecture 1
class Hello
{
    public static void main(String a[])
    {
        byte x = 10;
        short y = 20;
        long z = 30;
        int b = 5;
        double c = 6.8;
        double result = b+c;
        System.out.println("Hello, World!");
        System.out.println(result);

    }
}

// lecture 2
class Lecture2 
{
    public static void main(){
        int x = 30;
        if(x>1 && x<=25)
        {
            System.out.println("Hello number is greater");
        }
        else
            {
                System.out.println("It's not");
            }

        // ternary operator
       int result = x % 2 == 0 ? 10 : 20;

    //    switch case
    int day = 3;
    switch(day)
    {        case 1:
            System.out.println("Monday");
            break;
        case 2:
            System.out.println("Tuesday");
            break;
        case 3:
            System.out.println("Wednesday");
            break;
        default:
            System.out.println("Invalid day");  
    }

    // switch case with string
    String fruit = "Apple";
    switch(fruit)
    {   case "Apple", "apple":
            System.out.println("It's an apple");
            break;
        case "Banana":
            System.out.println("It's a banana");
            break;
        default:
            System.out.println("Unknown fruit");    
        }
    
    // or 
    String newfruits = "Banana";
    switch(newfruits)
    {   case "Apple", "apple" ->  System.out.println("Hey, It's an apple");
        case "Banana" -> System.out.println("Hey, It's a banana");
        default -> System.out.println("Unknown fruit");    
    }
    
    // yield statement in switch case
    int day2 = 3;
    String dayName = switch(day2)
    {   case 1 -> "Monday"; // or case 1: yield "Monday";
        case 2 -> "Tuesday";
        case 3 -> "Wednesday";
        default -> "Invalid day";
    };
    System.out.println(dayName);


    }
}

// Lecture 3
class Lecture3
{
    public static void main(){
        // loop--- while, do loop, for loop

        int i = 1;
        while(i<5)
        {
            System.out.println("repating..");
            i++;
        }
    }
}