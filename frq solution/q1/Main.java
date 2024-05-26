public class Main {
  public static void main(String[] args){

    Feeder feeder = new Feeder(1000);
    System.out.println(feeder.simulateManyDays(10,100));
  }
}
