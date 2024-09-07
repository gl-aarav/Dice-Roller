public class TestDice {
  public static void main(String[] args) {
    Dice dice1 = new Dice(6);
    for (int i = 0; i < 10; i++) {
      int roll = dice1.roll();
      System.out.println("Rolled a " + roll);
    }

    System.out.println("Number of rolls: " + dice1.getRolls());

    Dice dice2 = new Dice(100);
    for (int i = 0; i < 10; i++) {
      int roll = dice2.roll();
      System.out.println("Rolled a " + roll);
    }
    System.out.println("Number of rolls: " + dice2.getRolls());
  }
}
