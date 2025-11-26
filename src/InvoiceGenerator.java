import java.util.Scanner;
import java.text.DecimalFormat;

public class InvoiceGenerator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // DecimalFormat ensures clean output display (e.g. 120.00)
        DecimalFormat df2 = new DecimalFormat("0.00");
        DecimalFormat df0 = new DecimalFormat("0");

        // =========================================================================
        // 1. FIXED DATA (Static Info)
        // =========================================================================
        String addressLine1 = "No 23/2, SBI Colony,";
        String addressLine2 = "Ragavendra Nagar, Chennai - 600124";
        String gstin = "33APFSDFTZV";
        String contact = "+91-7869825463";
        String email = "purchase-team@thendral.com";
        String paymentDate = "7 days from date of delivery";
        String paymentTerms = "100% against invoice";

        String hsn1="34019011", hsn2="34019011", hsn3="34011100", hsn4="34011100", hsn5="34011100", hsn6="08109010", hsn7="33061020";
        String units = "nos";

        double discountRate = 0.006368; // 0.6368%

        // =========================================================================
        // 2. USER INPUT (Scanner)
        // =========================================================================

        System.out.println("--- INVOICE DATA ENTRY ---");

        System.out.print("Enter Bill To Name: ");
        String billToName = scanner.nextLine();

        System.out.print("Enter Ship To Name: ");
        String shipToName = scanner.nextLine();

        // --- ITEM 1 ---
        System.out.println("\n[Item 1 Details]");
        System.out.print("Product Code: ");
        String code1 = scanner.nextLine();
        System.out.print("Product Name: ");
        String name1 = scanner.nextLine();
        System.out.print("Quantity: ");
        int qty1 = scanner.nextInt();
        System.out.print("Rate: ");
        double rate1 = scanner.nextDouble();
        System.out.print("Tax %: ");
        int tax1 = scanner.nextInt();
        scanner.nextLine(); // FIX: Consume the leftover 'Enter' key

        // --- ITEM 2 ---
        System.out.println("\n[Item 2 Details]");
        System.out.print("Product Code: ");
        String code2 = scanner.nextLine();
        System.out.print("Product Name: ");
        String name2 = scanner.nextLine();
        System.out.print("Quantity: ");
        int qty2 = scanner.nextInt();
        System.out.print("Rate: ");
        double rate2 = scanner.nextDouble();
        System.out.print("Tax %: ");
        int tax2 = scanner.nextInt();
        scanner.nextLine(); // FIX

        // --- ITEM 3 ---
        System.out.println("\n[Item 3 Details]");
        System.out.print("Product Code: ");
        String code3 = scanner.nextLine();
        System.out.print("Product Name: ");
        String name3 = scanner.nextLine();
        System.out.print("Quantity: ");
        int qty3 = scanner.nextInt();
        System.out.print("Rate: ");
        double rate3 = scanner.nextDouble();
        System.out.print("Tax %: ");
        int tax3 = scanner.nextInt();
        scanner.nextLine(); // FIX

        // --- ITEM 4 ---
        System.out.println("\n[Item 4 Details]");
        System.out.print("Product Code: ");
        String code4 = scanner.nextLine();
        System.out.print("Product Name: ");
        String name4 = scanner.nextLine();
        System.out.print("Quantity: ");
        int qty4 = scanner.nextInt();
        System.out.print("Rate: ");
        double rate4 = scanner.nextDouble();
        System.out.print("Tax %: ");
        int tax4 = scanner.nextInt();
        scanner.nextLine(); // FIX

        // --- ITEM 5 ---
        System.out.println("\n[Item 5 Details]");
        System.out.print("Product Code: ");
        String code5 = scanner.nextLine();
        System.out.print("Product Name: ");
        String name5 = scanner.nextLine();
        System.out.print("Quantity: ");
        int qty5 = scanner.nextInt();
        System.out.print("Rate: ");
        double rate5 = scanner.nextDouble();
        System.out.print("Tax %: ");
        int tax5 = scanner.nextInt();
        scanner.nextLine(); // FIX

        // --- ITEM 6 ---
        System.out.println("\n[Item 6 Details]");
        System.out.print("Product Code: ");
        String code6 = scanner.nextLine();
        System.out.print("Product Name: ");
        String name6 = scanner.nextLine();
        System.out.print("Quantity: ");
        int qty6 = scanner.nextInt();
        System.out.print("Rate: ");
        double rate6 = scanner.nextDouble();
        System.out.print("Tax %: ");
        int tax6 = scanner.nextInt();
        scanner.nextLine(); // FIX

        // --- ITEM 7 ---
        System.out.println("\n[Item 7 Details]");
        System.out.print("Product Code: ");
        String code7 = scanner.nextLine();
        System.out.print("Product Name: ");
        String name7 = scanner.nextLine();
        System.out.print("Quantity: ");
        int qty7 = scanner.nextInt();
        System.out.print("Rate: ");
        double rate7 = scanner.nextDouble();
        System.out.print("Tax %: ");
        int tax7 = scanner.nextInt();
        // Last item doesn't need the fix if we close scanner immediately after, but good practice to keep it.
        scanner.nextLine();

        System.out.println("\n--- Processing Invoice... ---\n");
        scanner.close();

        // =========================================================================
        // 3. CALCULATIONS (Arithmetic Operators)
        // =========================================================================

        // Calculate Amount for each line: Qty * Rate * (1 + Tax/100)
        double amt1 = qty1 * rate1 * (1.0 + tax1 / 100.0);
        double amt2 = qty2 * rate2 * (1.0 + tax2 / 100.0);
        double amt3 = qty3 * rate3 * (1.0 + tax3 / 100.0);
        double amt4 = qty4 * rate4 * (1.0 + tax4 / 100.0);
        double amt5 = qty5 * rate5 * (1.0 + tax5 / 100.0);
        double amt6 = qty6 * rate6 * (1.0 + tax6 / 100.0);
        double amt7 = qty7 * rate7 * (1.0 + tax7 / 100.0);

        // Sum Total
        double total = amt1 + amt2 + amt3 + amt4 + amt5 + amt6 + amt7;

        // Calculate Discount and Grand Total
        double discountVal = total * discountRate;
        double discountDisplay = Math.round(discountVal); // Round to nearest int for clean display
        double grandTotal = total - discountDisplay;

        // =========================================================================
        // 4. OUTPUT GENERATION
        // =========================================================================

        // Header
        String hFmt = "%-40s %-40s\n"; // Header Format
        System.out.printf(hFmt, "Bill To:", "Ship To:");
        System.out.printf(hFmt, billToName, shipToName);
        System.out.printf(hFmt, addressLine1, addressLine1);
        System.out.printf(hFmt, addressLine2, addressLine2);
        System.out.printf(hFmt, "GSTIN:" + gstin, "GSTIN:" + gstin);
        System.out.printf(hFmt, "Contact: " + contact, "Contact: " + contact);
        System.out.printf(hFmt, "Email: " + email, "Email: " + email);
        System.out.println("\nPayment Date: " + paymentDate + "\t\tPayment Terms: " + paymentTerms);

        // Table
        String line = "---------------------------------------------------------------------------------------------------";
        // Table Row Format
        String rFmt = "| %-4s | %-12s | %-20s | %-10s | %-8s | %-5s | %-8s | %-4s | %-10s |\n";

        System.out.println(line);
        System.out.printf(rFmt, "S.No", "Product Code", "Product Name", "HSN code", "Quantity", "Units", "Rate", "Tax", "Amount");
        System.out.println(line);

        // Rows 1-7 (Using variable format specifiers: d=integer, s=string, f=decimal)
        System.out.printf("| %-4d | %-12s | %-20s | %-10s | %-8d | %-5s | %-8s | %-4d | %-10s |\n",
                1, code1, name1, hsn1, qty1, units, df2.format(rate1), tax1, df2.format(amt1));
        System.out.printf("| %-4d | %-12s | %-20s | %-10s | %-8d | %-5s | %-8s | %-4d | %-10s |\n",
                2, code2, name2, hsn2, qty2, units, df2.format(rate2), tax2, df2.format(amt2));
        System.out.printf("| %-4d | %-12s | %-20s | %-10s | %-8d | %-5s | %-8s | %-4d | %-10s |\n",
                3, code3, name3, hsn3, qty3, units, df2.format(rate3), tax3, df2.format(amt3));
        System.out.printf("| %-4d | %-12s | %-20s | %-10s | %-8d | %-5s | %-8s | %-4d | %-10s |\n",
                4, code4, name4, hsn4, qty4, units, df2.format(rate4), tax4, df2.format(amt4));
        System.out.printf("| %-4d | %-12s | %-20s | %-10s | %-8d | %-5s | %-8s | %-4d | %-10s |\n",
                5, code5, name5, hsn5, qty5, units, df2.format(rate5), tax5, df2.format(amt5));
        System.out.printf("| %-4d | %-12s | %-20s | %-10s | %-8d | %-5s | %-8s | %-4d | %-10s |\n",
                6, code6, name6, hsn6, qty6, units, df2.format(rate6), tax6, df2.format(amt6));
        System.out.printf("| %-4d | %-12s | %-20s | %-10s | %-8d | %-5s | %-8s | %-4d | %-10s |\n",
                7, code7, name7, hsn7, qty7, units, df2.format(rate7), tax7, df2.format(amt7));

        System.out.println(line);

        // Totals
        String tFmt = "%-75s%-15s%10s\n"; // Footer Format
        System.out.printf(tFmt, "", "Total", df2.format(total));
        System.out.printf(tFmt, "", "Discounts", df0.format(discountDisplay));
        System.out.printf(tFmt, "", "Grand Total", df2.format(grandTotal));
    }
}