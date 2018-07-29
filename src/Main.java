import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        List<String> citys = new ArrayList<String>();
        String city = "";
        while((city=in.next()).equals("###") == false){
            citys.add(city);
        }
        int size = citys.size();
        int [][] dist = new int[size][size];
        int i;
        int j;
        for(i=0; i<size; i++){
            for(j=0; j<size; j++){
                dist[i][j] = in.nextInt();
            }
        }
        String a = in.next();
        String b = in.next();
        int indexOfa = citys.indexOf(a);
        int indexOfb = citys.indexOf(b);

        System.out.println(dist[indexOfa][indexOfb]);



        in.close();
    }


}

