package DiffElements;

/*


/*double d = Math.random()*100; math.random will return a number between 1 and 100
 */
public class GenerateRandomNumbersFunction {

    public static void main(String[] args) {
        GenerateRandomNumbers(35);
    }

    public static void GenerateRandomNumbers(int n){
        double d = Math.random()*n;

    int num = (int)d;           //this foribly converts d which is double to integer
       System.out.println(d);

        System.out.println(num);

    }
}

