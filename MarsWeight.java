class HelloWorld{
    public static void main(String[] args) {
        // Starting with float type.
        float marsWeightTony;
        float earthWeightTony = 78;

        marsWeightTony = (float)(earthWeightTony * 0.38);
        System.out.println(marsWeightTony + " Tony's Mars' weight in float.");

            // ------------------------------------

        // Converting to double type and limit decimal length to 4 digits.
        // double doubleMarsWeightTony;
        // DecimalFormat deFormat = new DecimalFormat("#.00");

        // doubleMarsWeightTony = (double)marsWeightTony;
        // System.out.println(deFormat.format(doubleMarsWeightTony) + " Tony's earth's weight in double.");
            
            // ------------------------------------

        // Converting double type to int type.
        // int intMarsWeightTony;

        // intMarsWeightTony = (int)marsWeightTony;
        // System.out.println(intMarsWeightTony + " Tony's Mars' weight in int.");

            // ------------------------------------

        // Converting int type to char type.
        // char charMarsWeightTony;

        // charMarsWeightTony = (char)intMarsWeightTony;
        // System.out.println(charMarsWeightTony + " Tony's Mars' weight in char.");

            // ------------------------------------
        
        // Do any math with char type and store in new int type.
        // int newCharIntType;

        // newCharIntType = charMarsWeightTony + 10;
        // System.out.println(newCharIntType);
    }
}