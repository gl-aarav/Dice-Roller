class Dice {
    private int sides;
    private int rolls;

    public Dice() {
        this.sides = 6;
        this.rolls = 0;
    }

    public Dice(int sides) {
        this.sides = sides;
        this.rolls = 0;
    }

    public int roll() {
        rolls++;
        double randomNumber = Math.random();
        return (int)(randomNumber * this.sides) + 1;
    }

    public int getRolls() {
        return this.rolls;
    }
}