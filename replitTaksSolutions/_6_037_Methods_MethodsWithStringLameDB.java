//A database (DB) is an organized collection of data. In other words, a database is used by an organization as a method of storing, managing and retrieving information.
//
//        Implement the **lameDb()** method
//
//        - This method has 4 String parameters and returns a String
//        - `db`: information in database. Each item is separated by a **#**. Each element will also have a number in the beginning about which element it is.
//        - `op`: action that will be taken on database (add, edit, or remove)
//        - `id`: The id number that will be manipulated
//        - `data`: extra data that will be used alongside operation
//
//        - The method returns the modifed database
//
//        Examples:
//
//        ```
//        m.lameDb("1etsy#2wooden#3spoon","add","4","aaa")
//
//        returns:  1etsy#2wooden#3spoon#4aaa
//        ```
//
//        ```
//        m.lameDb("1etsy#2wooden#3spoon","add","1","bbb")
//
//        returns:  1bbb#2etsy#3wooden#4spoon
//        ```
//
//        ```
//        m.lameDb("1test#2bla#3foo","edit","2","bbb")
//
//        returns:  1test#2bbb#3foo
//        ```
//
//        ```
//        m.lameDb("1tst#2bla#3foo","delete","1","")
//
//        returns:  #2bla#3foo
//        ```
//
//        Hint: use arrays


import java.util.Scanner;

public class _6_037_Methods_MethodsWithStringLameDB {
    public static String lameDb(String db, String op, String id, String data)
    {
        String tmp="";
        int startIndex=0;
        int endIndex=0;
        int index=0;
        int idIndex=0;
        int counter=1;

        if(op.equals("add"))
        {
            if(db.indexOf(id)!=-1)
            {
                if(id.equals("1"))
                {
                    tmp=id + data + "#" + db.substring(db.indexOf(id),db.length());
                }
                else
                {
                    index=db.indexOf("#" + id);
                    tmp=db.substring(0,index)+ "#" + id + data + db.substring(index,db.length());
                }

                //reorganizing numbers...
                while(idIndex != -1)
                {
                    idIndex = tmp.indexOf("#",idIndex);

                    if(idIndex != -1)
                    {
                        counter ++;
                        tmp=tmp.substring(0,idIndex+1) +
                                Integer.toString(counter) +
                                tmp.substring(idIndex+2);
                        idIndex += "#".length();
                    }
                }


            }
            else
            {
                tmp=db.concat("#"+id+data);
            }
        }
        else if(op.equals("edit"))
        {
            startIndex = db.indexOf(id,startIndex);
            tmp=db.replace(db.substring(startIndex,startIndex+(id+data).length()),id+data);
        }
        else if(op.equals("delete"))
        {
            if(id.equals("1"))
            {
                startIndex = db.indexOf(id,startIndex);
                endIndex = db.indexOf("#",startIndex + "#".length()+id.length());
            }
            else
            {
                startIndex = db.indexOf("#"+id,startIndex);
                endIndex = db.indexOf("#",startIndex + "#".length()+id.length());
            }

            tmp=db.replace(db.substring(startIndex,db.indexOf("#",endIndex)),"");
        }

        return tmp;
    }//end lameDb

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(lameDb(in.next(), in.next(), in.next(), in.next()));

    }
}
