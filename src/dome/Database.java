package dome;

import java.sql.Time;
import java.util.ArrayList;

public class Database {
    private ArrayList<Item> listItem = new ArrayList<Item>();

    public void add(Item Item){
        listItem.add(Item);
    }

    public void list(){
        for (Item item : listItem){
            item.print();
        }
    }



    public static void main(String[] args){

       /* Database db = new Database();
          db.list();*/
        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = "Hellp";
        s3 = s3.replace('p', 'o');
        System.out.println(s1==s2);
        System.out.println(s1==s3);

    }


}
