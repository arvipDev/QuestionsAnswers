package exam.prep;

public class Trouble {
    public int calculate(int number) throws Exception{
        if (number <= 10) throw new Exception("Number is not greater than 10");
        return number - 10;
    }
}
