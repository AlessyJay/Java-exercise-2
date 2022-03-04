class TaxCal{
    public static void main(String[] args) {
        // Tax calculator 
        double NET = 9.99;
        double VAT = 0.29;
        // double VATperPiece = NET * VAT; // This line is for verifying VAT price per piece.
        double grossValuePerPiece = ((NET * VAT) + NET);

        // Total price with 10,000 products.
        double total;
        total = grossValuePerPiece * 10_000;
        System.out.println(String.format("Total price for 10,000 products is %s", total));
    }
}