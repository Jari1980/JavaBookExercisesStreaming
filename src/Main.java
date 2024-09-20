
import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException{
        var scan = new Scanner(System.in);
        while(true){
            int num;
            System.out.println("Which exercise do you want to run 1-xx? (exit program with a non integer)?");
            try{
                num = scan.nextInt();
                switch(num){
                    case 1:
                        Exercise1();
                    case 2:
                        Exercise2();
                    case 3:
                        Exercise3();
                    case 4:
                        Exercise4();
                    case 5:
                        Exercise5();
                    case 6:
                        Exercise6();
                    default:
                        System.out.println();
                }
            }
            catch (Exception e){
                System.out.println("Recieved non integer input, exiting program");
                System.exit(0);
            }
        }
    }
    public static void Exercise6() throws IOException{
        System.out.println("In this exercise user can add names, these names will be added in separate rows in a file, " +
                "running this program again will add new names to the existing file.");
        var outstream = new PrintWriter(new BufferedWriter(new FileWriter("Exercise6.txt", true)));
        var scan = new Scanner(System.in);
        while(true){
            System.out.println("Enter a name, stop with \";\" :");
            String name = scan.nextLine();
            if (name.contains(";")){
                break;
            }
            outstream.println(name);
        }

        outstream.close();
    }

    public static void Exercise5() throws IOException{
        System.out.println("In this exercise Im reading the file \"Exercise5InData.txt\" and creating a new" +
                " document, \"Exercise5OutData.txt\" with the students passing 50 points.");
        var instream = new Scanner(new File("src/Exercise5InData.txt"));
        var outStream = new PrintWriter (new BufferedWriter (new FileWriter("Exercise5OutData.txt")));
        String nameTemp ="";
        int pointTemp = 0;
        while(true){
            nameTemp = instream.nextLine();
            pointTemp = instream.nextInt();
            if(pointTemp >= 50){
                System.out.println("Added to Exercise5OutData.txt");
                System.out.println(nameTemp + " points: " + pointTemp);
                outStream.println(nameTemp + " points: " + pointTemp);
            }
            if (!instream.hasNextLine()){
                break;
            }
            instream.nextLine(); // Needs to be added in order to jump next line from nextInt()
        }
        outStream.close();
    }

    public static void Exercise4() throws IOException{
        System.out.println("In this exercise Im reading the file \"Exercise4.txt\" where" +
                "names followed by different amount of timestamps are written. This program will " +
                "sum the time for the timestamps for all users and state the user with most time.");
        var instream = new Scanner(new File("src/Exercise4.txt"));
        String nameMostTime = "";
        int mostTime = 0;
        while(instream.hasNext()){
            String tempName = instream.next();
            int tempTime = 0;
            while (instream.hasNextInt()){
                tempTime = tempTime + instream.nextInt();
            }
            if (tempTime > mostTime){
                nameMostTime = tempName;
                mostTime = tempTime;
            }
        }
        System.out.println("User with most time: " + nameMostTime + ", total time: " + mostTime);
    }

    public static void Exercise3() throws IOException {
        System.out.println("In this program Im reading the file Exercise3.txt and finding out the percentage of lines with comment.");
        var instream = new BufferedReader(new FileReader("src/Exercise3.txt"));
        //C:\Users\jarit\Lexicon Växjö\JavaStreaming\StreamingJavaBookExercises\src\TextForExe3.java
        //File file = new File("findingFilePathForExercise3.txt");
        //System.out.println(file.getAbsoluteFile());
        //file.createNewFile();
        int rowNr = 0;
        int rowsWithComment = 0;
        while(true){
            String row = instream.readLine();
            if (row == null){
                break;
            }
            if (row.contains("//")){
                rowsWithComment++;
            }
            rowNr++;
        }
        double amount = 100 / rowNr * rowsWithComment;
        System.out.println("Rows: " + rowNr + ", Rows with comment: " + rowsWithComment + ", percentage: " + amount + "%.");
    }

    public static void Exercise2(){
        int max = Integer.MIN_VALUE;
        int num;
        System.out.println("Enter any number of integers, stop feeding integers by pressing non number, at end the program will print the largest integer");
        while(true){
            var scan = new Scanner(System.in);
            System.out.println("Enter a number:");
            try{
                num = scan.nextInt();
                if (num > max){
                    max = num;
                }
            }
            catch(Exception e){
                break;
            }
        }
        System.out.println("The largest integer is: " + max);
    }

    public static void Exercise1(){
        var scan = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        System.out.println("Enter a integer for num1:");
        try{
            num1 = scan.nextInt();
        }
        catch (Exception e){
            System.out.println("Non valid integer, exiting program");
            System.exit(0);
        }
        System.out.println("Enter a integer for num2:");
        try{
            num2 = scan.nextInt();
        }
        catch (Exception e){
            System.out.println("Non valid integer, exiting program");
            System.exit(0);
        }
        System.out.println(num1 + "!.. .." + num2 + "!:");
        for (int i = num1; i <= num2; i++){
            System.out.println(i + "! = " + Factorial.fac(i));
        }

    }
}