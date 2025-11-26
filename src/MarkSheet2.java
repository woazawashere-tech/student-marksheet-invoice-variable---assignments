import java.util.Scanner;

public class MarkSheet2
{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // ------------------ TITLE BLOCK --------------------
        System.out.println("Dedan Kimathi University of Technology");
        System.out.println("School of Computer Science and IT");
        System.out.println("Department of Computer Science");
        System.out.println("Academic Year: 2024/2025");
        System.out.println("STUDENT MARKSHEET (SECOND YEAR RESULTS)");
        System.out.println("------------------------------------------------------------");

        // ===========================================================
        // ------------------------ STUDENT 1 -------------------------
        // ===========================================================
        System.out.println("\nEnter Student 1 Details:");

        System.out.print("Registration Number: ");
        String reg1 = input.nextLine();

        System.out.print("Full Name: ");
        String name1 = input.nextLine();

        System.out.print("Unit 1 Marks: ");
        int u1_1 = input.nextInt();

        System.out.print("Unit 2 Marks: ");
        int u1_2 = input.nextInt();

        System.out.print("Unit 3 Marks: ");
        int u1_3 = input.nextInt();

        System.out.print("Unit 4 Marks: ");
        int u1_4 = input.nextInt();

        System.out.print("Unit 5 Marks: ");
        int u1_5 = input.nextInt();

        System.out.print("Unit 6 Marks: ");
        int u1_6 = input.nextInt();

        System.out.print("Unit 7 Marks: ");
        int u1_7 = input.nextInt();

        int total1 = u1_1 + u1_2 + u1_3 + u1_4 + u1_5 + u1_6 + u1_7;
        double avg1 = total1 / 7.0;

        input.nextLine();  // clear buffer


        // ===========================================================
        // ------------------------ STUDENT 2 -------------------------
        // ===========================================================
        System.out.println("\nEnter Student 2 Details:");

        System.out.print("Registration Number: ");
        String reg2 = input.nextLine();

        System.out.print("Full Name: ");
        String name2 = input.nextLine();

        System.out.print("Unit 1 Marks: ");
        int u2_1 = input.nextInt();

        System.out.print("Unit 2 Marks: ");
        int u2_2 = input.nextInt();

        System.out.print("Unit 3 Marks: ");
        int u2_3 = input.nextInt();

        System.out.print("Unit 4 Marks: ");
        int u2_4 = input.nextInt();

        System.out.print("Unit 5 Marks: ");
        int u2_5 = input.nextInt();

        System.out.print("Unit 6 Marks: ");
        int u2_6 = input.nextInt();

        System.out.print("Unit 7 Marks: ");
        int u2_7 = input.nextInt();

        int total2 = u2_1 + u2_2 + u2_3 + u2_4 + u2_5 + u2_6 + u2_7;
        double avg2 = total2 / 7.0;

        input.nextLine();


        // ===========================================================
        // ------------------------ STUDENT 3 -------------------------
        // ===========================================================
        System.out.println("\nEnter Student 3 Details:");

        System.out.print("Registration Number: ");
        String reg3 = input.nextLine();

        System.out.print("Full Name: ");
        String name3 = input.nextLine();

        System.out.print("Unit 1 Marks: ");
        int u3_1 = input.nextInt();

        System.out.print("Unit 2 Marks: ");
        int u3_2 = input.nextInt();

        System.out.print("Unit 3 Marks: ");
        int u3_3 = input.nextInt();

        System.out.print("Unit 4 Marks: ");
        int u3_4 = input.nextInt();

        System.out.print("Unit 5 Marks: ");
        int u3_5 = input.nextInt();

        System.out.print("Unit 6 Marks: ");
        int u3_6 = input.nextInt();

        System.out.print("Unit 7 Marks: ");
        int u3_7 = input.nextInt();

        int total3 = u3_1 + u3_2 + u3_3 + u3_4 + u3_5 + u3_6 + u3_7;
        double avg3 = total3 / 7.0;

        input.nextLine();


        // ===========================================================
        // ------------------------ STUDENT 4 -------------------------
        // ===========================================================
        System.out.println("\nEnter Student 4 Details:");

        System.out.print("Registration Number: ");
        String reg4 = input.nextLine();

        System.out.print("Full Name: ");
        String name4 = input.nextLine();

        System.out.print("Unit 1 Marks: ");
        int u4_1 = input.nextInt();

        System.out.print("Unit 2 Marks: ");
        int u4_2 = input.nextInt();

        System.out.print("Unit 3 Marks: ");
        int u4_3 = input.nextInt();

        System.out.print("Unit 4 Marks: ");
        int u4_4 = input.nextInt();

        System.out.print("Unit 5 Marks: ");
        int u4_5 = input.nextInt();

        System.out.print("Unit 6 Marks: ");
        int u4_6 = input.nextInt();

        System.out.print("Unit 7 Marks: ");
        int u4_7 = input.nextInt();

        int total4 = u4_1 + u4_2 + u4_3 + u4_4 + u4_5 + u4_6 + u4_7;
        double avg4 = total4 / 7.0;

        input.nextLine();


        // ===========================================================
        // ------------------------ STUDENT 5 -------------------------
        // ===========================================================
        System.out.println("\nEnter Student 5 Details:");

        System.out.print("Registration Number: ");
        String reg5 = input.nextLine();

        System.out.print("Full Name: ");
        String name5 = input.nextLine();

        System.out.print("Unit 1 Marks: ");
        int u5_1 = input.nextInt();

        System.out.print("Unit 2 Marks: ");
        int u5_2 = input.nextInt();

        System.out.print("Unit 3 Marks: ");
        int u5_3 = input.nextInt();

        System.out.print("Unit 4 Marks: ");
        int u5_4 = input.nextInt();

        System.out.print("Unit 5 Marks: ");
        int u5_5 = input.nextInt();

        System.out.print("Unit 6 Marks: ");
        int u5_6 = input.nextInt();

        System.out.print("Unit 7 Marks: ");
        int u5_7 = input.nextInt();

        int total5 = u5_1 + u5_2 + u5_3 + u5_4 + u5_5 + u5_6 + u5_7;
        double avg5 = total5 / 7.0;

        // ------------------ OUTPUT TABLE ----------------------------
        System.out.println("\n---------------- STUDENT MARKSHEET ----------------");
        System.out.println("RegNo\t\tName\t\tTotal\tAverage\tStatus\tGrade");
        System.out.println("--------------------------------------------------------------");

        System.out.println(reg1 + "\t" + name1 + "\t" + total1 + "\t" + avg1 + "\t\t\t");
        System.out.println(reg2 + "\t" + name2 + "\t" + total2 + "\t" + avg2 + "\t\t\t");
        System.out.println(reg3 + "\t" + name3 + "\t" + total3 + "\t" + avg3 + "\t\t\t");
        System.out.println(reg4 + "\t" + name4 + "\t" + total4 + "\t" + avg4 + "\t\t\t");
        System.out.println(reg5 + "\t" + name5 + "\t" + total5 + "\t" + avg5 + "\t\t\t");

        System.out.println("--------------------------------------------------------------");

        input.close();
    }
}

