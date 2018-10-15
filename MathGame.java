package mathgame;
import java.util.Scanner;

public class MathGame{
public static int int1 = 12;
public static int int2 = 12;
public static String nl = System.lineSeparator();
public static int tries = 0;
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.print("1): Multiplication" + nl);
System.out.print("2): Addition" + nl);
System.out.print("3): Subtraction" + nl);
System.out.print("4): Difficulty" + nl);
System.out.print("5): Exit" + nl);
System.out.print("Input: ");
int input = sc.nextInt();
switch(input){
    case 1:
        multiplication(args);
        break;
    case 2: 
        addition(args);
        break;
    case 3:
        subtraction(args);
        break;
    case 4:
        difficulty(args);
        break;
    case 5:
        System.out.print("Goodbye!" + nl);
        break;
    default:
        System.out.print("Unknown Input " + nl);
        main(args);
}
}
public static void multiplication(String[] args){
long multiply = Math.round((Math.random() * int1 * Math.random()));
long multiplyby = Math.round((Math.random() * int2 * Math.random()));
long answer = multiply * multiplyby;
if(tries > 4){
tries = 0;
continuemultiplication(args);
}
Scanner sc = new Scanner(System.in);
System.out.print("What is " + multiply + " x " + multiplyby + ": ");
int input = sc.nextInt();
if(input == answer){
System.out.print("Congratulations! You got the correct answer." + nl);
tries = tries + 1;
multiplication(args);
}
if(input != answer){
System.out.print("You got the wrong answer! The correct answer was " + answer + nl);
tries = tries + 1;
multiplication(args);
}
}
public static void continuemultiplication(String[] args){
Scanner sc = new Scanner(System.in);
System.out.print(nl + "1): Continue" + nl);
System.out.print("2): Exit" + nl);
System.out.print("Continue? ");
int input = sc.nextInt();
switch(input){
    case 1:
        System.out.print(nl);
        multiplication(args);
        break;
    case 2:
        System.out.print(nl);
        main(args);
        break;
    default:
        System.out.print("Unknown input " + nl);
}
}
public static void addition(String[] args){
long add = Math.round((Math.random() * int1 * Math.random()));
long addby = Math.round((Math.random() * int2 * Math.random()));
long answer = add + addby;
if(tries > 4){
tries = 0;
continueaddition(args);
}
Scanner sc = new Scanner(System.in);
System.out.print("What is " + add + " + " + addby + ": ");
int input = sc.nextInt();
if(input == answer){
System.out.print("Congratulations! You got the correct answer." + nl);
tries = tries + 1;
addition(args);
}
if(input != answer){
System.out.print("You got the wrong answer! The correct answer was " + answer + nl);
tries = tries + 1;
addition(args);
}
}
public static void continueaddition(String[] args){
Scanner sc = new Scanner(System.in);
System.out.print(nl + "1): Continue" + nl);
System.out.print("2): Exit" + nl);
System.out.print("Continue? ");
int input = sc.nextInt();
switch(input){
    case 1:
        System.out.print(nl);
        addition(args);
        break;
    case 2:
        System.out.print(nl);
        main(args);
        break;
    default:
        System.out.print("Unknown input " + nl);
}
}
public static void subtraction(String[] args){
Scanner sc = new Scanner(System.in);

long subtract = Math.round((Math.random() * int1 * Math.random()));
long subtractby = Math.round((Math.random() * int2 * Math.random()));
long answer = subtract - subtractby;
if(tries > 5){
tries = 0;
continuesubtraction(args);
}
System.out.print("What is " + subtract + " - " + subtractby + ": ");
int input = sc.nextInt();
if(input == answer){
System.out.print("Congratulations! You got the correct answer." + nl);
tries = tries + 1;
subtraction(args);
}
if(input != answer){
System.out.print("You got the wrong answer! The correct answer was " + answer + nl);
tries = tries + 1;
subtraction(args);
}
}
public static void continuesubtraction(String[] args){
Scanner sc = new Scanner(System.in);
System.out.print(nl + "1): Continue" + nl);
System.out.print("2): Exit" + nl);
System.out.print("Continue? ");
int input = sc.nextInt();
switch(input){
    case 1:
        System.out.print(nl);
        subtraction(args);
        break;
    case 2:
        System.out.print(nl);
        main(args);
        break;
    default:
        System.out.print("Unknown input " + nl);
}
}
public static void difficulty(String[] args){
Scanner sc = new Scanner(System.in);
System.out.print("1): Easy" + nl);
System.out.print("2): Normal" + nl);
System.out.print("3): Hard" + nl);
System.out.print("4): Extreme" + nl);
System.out.print("5): Custom" + nl);
System.out.print("6): Exit" + nl);
System.out.print("Difficulty: " );
int input = sc.nextInt();
switch(input){
    case 1:
        int1 = 4;
        int2 = 4;
        main(args);
        break;
    case 2:
        int1 = 6;
        int2 = 6;
        main(args);
        break;
    case 3:
        int1 = 12;
        int2 = 12;
        main(args);
        break;
    case 4:
        int1 = 18;
        int2 = 18;
        main(args);
        break;
    case 5:
        customdifficulty(args);
        break;
    case 6:
        main(args);
        break;
    default:
        System.out.print(nl + "Unknown Input" + nl);
}
}
public static void customdifficulty(String[] args){
Scanner sc = new Scanner(System.in);
System.out.print("Custom Difficulty Integer: ");
int input = sc.nextInt();
int1 = input;
int2 = input;
main(args);
}
}
