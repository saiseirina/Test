import java.io.FileReader;
import java.util.Scanner;
import java.util.Vector;
import java.util.Collections;

class Main {
    public static void main(String[] args) throws Exception{
        Scanner scan        = new Scanner(System.in);
        String path         = scan.nextLine();
        FileReader fr       = new FileReader(path);
        scan                = new Scanner(fr);
        Vector<Integer> vec = new Vector<Integer>();
        int sum             = 0;

        while(scan.hasNextLine()){
            int num  = Integer.parseInt(scan.nextLine());
            sum     += num;

            vec.addElement(num);
        };
        fr.close();

        Collections.sort(vec);

        int median = vec.get(vec.size() / 2);
        int steps  = 0;

        for (int i = 0; i < vec.size(); ++i){
            steps += Math.abs(vec.get(i) - median);
        }

        System.out.println("Steps: " + steps);
    }
}