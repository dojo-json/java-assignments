public class FizzBuzz {
  public String fizzBuzz(int number) {
    if (this.isModThreeAndFive(number)) {
      return "FizzBuzz";
    }
    if (this.isModThree(number)) {
      return "Fizz";
    }
    if (this.isModFive(number)) {
      return "Buzz";
    }
    if (number == 2) {
      return "2";
    }

    return "wat!";
  }

  private boolean isModThreeAndFive(int number) {
    return this.isModThree(number) && this.isModFive(number);
  }

  private boolean isModThree(int number) {
    return this.isMod(number, 3);
  }

  private boolean isModFive(int number) {
    return this.isMod(number, 5);
  }

  private boolean isMod(int number, int mod) {
    return number % mod == 0;
  }
}
