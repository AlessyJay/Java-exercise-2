class LegoBricks{
    public static void main(String[] args) {
        int amountOfBricks = 73;
        int containerCapacity = 8;
        int fullContainer = amountOfBricks / containerCapacity;
        int remainderInContainer = amountOfBricks % containerCapacity;

        System.out.println(String.format("There are %s full containers.", fullContainer));
        System.out.println(String.format("There are 1 not full container with %s piece(s) inside.", remainderInContainer));
        // Not full container cannot be more than 1 container.
    }
}