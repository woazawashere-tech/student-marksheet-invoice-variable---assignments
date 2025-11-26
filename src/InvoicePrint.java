public class InvoicePrint {
    public static void main(String[] args) {
        // Invoice header
        System.out.println("--------------------------------------------------------------------------------");
         System.out.println("Bill To:                                Ship To:");
        System.out.println("Registration No: C026-01-0785/2023      Wayne Omumia");
        System.out.println("No 23/2, SBI Colony                     No 23/2, SBI Colony");
        System.out.println("Raghavendra Nagar                       Raghavendra Nagar");
        System.out.println("Chennai - 600124                        Chennai - 600124");
        System.out.println("GSTIN: 33AAPFSDF1Z1                     GSTIN: 33AAPFSDF1Z1");
        System.out.println("Contact: +91-7869825463                 Contact: +91-7869825463");
        System.out.println("Email: purchase-team@thendral.com       Email: purchase-team@thendral.com");
        System.out.println("--------------------------------------------------------------------------------");

        // Payment terms
        System.out.println("Payment Date: 7 days from date of delivery");
        System.out.println("Payment Terms: 100% against invoice");
        System.out.println("--------------------------------------------------------------------------------");

        // Table header
        System.out.printf("| %-4s | %-12s | %-17s | %-8s | %-8s | %-6s | %-8s | %-4s | %-9s |%n",
                "S.No", "Product Code", "Product Name", "HSN Code", "Quantity", "Units", "Rate", "Tax", "Amount");
        System.out.println("|------|--------------|-------------------|----------|----------|--------|----------|------|-----------|");

        // Invoice items with corrected calculations
        double subtotal = 0.0;

        // Item 1: Surf Excel 5 kg
        double item1Amount = calculateAmount(20, 600.00, 5);
        System.out.printf("| %-4s | %-12s | %-17s | %-8s | %-8d | %-6s | %8.2f | %-4s | %9.2f |%n",
                "1", "105", "Surf Excel 5 kg", "34019011", 20, "nos", 600.00, "5%", item1Amount);
        subtotal += item1Amount;

        // Item 2: Rin 1 kg
        double item2Amount = calculateAmount(25, 85.00, 5);
        System.out.printf("| %-4s | %-12s | %-17s | %-8s | %-8d | %-6s | %8.2f | %-4s | %9.2f |%n",
                "2", "109", "Rin 1 kg", "34019011", 25, "nos", 85.00, "5%", item2Amount);
        subtotal += item2Amount;

        // Item 3: Hamam soap 150 g
        double item3Amount = calculateAmount(25, 60.00, 5);
        System.out.printf("| %-4s | %-12s | %-17s | %-8s | %-8d | %-6s | %8.2f | %-4s | %9.2f |%n",
                "3", "115", "Hamam soap 150 g", "34011100", 25, "nos", 60.00, "5%", item3Amount);
        subtotal += item3Amount;

        // Item 4: Lux Soap 150 g
        double item4Amount = calculateAmount(30, 53.00, 5);
        System.out.printf("| %-4s | %-12s | %-17s | %-8s | %-8d | %-6s | %8.2f | %-4s | %9.2f |%n",
                "4", "120", "Lux Soap 150 g", "34011100", 30, "nos", 53.00, "5%", item4Amount);
        subtotal += item4Amount;

        // Item 5: Dove soap 125 g
        double item5Amount = calculateAmount(25, 75.00, 5);
        System.out.printf("| %-4s | %-12s | %-17s | %-8s | %-8d | %-6s | %8.2f | %-4s | %9.2f |%n",
                "5", "125", "Dove soap 125 g", "34011100", 25, "nos", 75.00, "5%", item5Amount);
        subtotal += item5Amount;

        // Item 6: Vim bar 200 g
        double item6Amount = calculateAmount(20, 15.00, 5);
        System.out.printf("| %-4s | %-12s | %-17s | %-8s | %-8d | %-6s | %8.2f | %-4s | %9.2f |%n",
                "6", "129", "Vim bar 200 g", "08109010", 20, "nos", 15.00, "5%", item6Amount);
        subtotal += item6Amount;

        // Item 7: Pepsodent 150 g
        double item7Amount = calculateAmount(30, 85.00, 18);
        System.out.printf("| %-4s | %-12s | %-17s | %-8s | %-8d | %-6s | %8.2f | %-4s | %9.2f |%n",
                "7", "131", "Pepsodent 150 g", "33061020", 30, "nos", 85.00, "18%", item7Amount);
        subtotal += item7Amount;

        System.out.println("--------------------------------------------------------------------------------");

        // Calculate totals
        double discounts = 141.00;
        double grandTotal = subtotal - discounts;

        // Display totals
        System.out.printf("Total:       ₹%.2f%n", subtotal);
        System.out.printf("Discounts:   ₹%.2f%n", discounts);
        System.out.printf("Grand Total: ₹%.2f%n", grandTotal);
        System.out.println("--------------------------------------------------------------------------------");
    }

    /**
     * Calculate the total amount including tax for an item
     * @param quantity Number of items
     * @param rate Price per item (excluding tax)
     * @param taxPercent Tax percentage
     * @return Total amount including tax
     */
    private static double calculateAmount(int quantity, double rate, int taxPercent) {
        double baseAmount = quantity * rate;
        double taxAmount = baseAmount * taxPercent / 100.0;
        return baseAmount + taxAmount;
    }
}
