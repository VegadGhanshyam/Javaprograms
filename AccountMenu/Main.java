package AccountMenu;

import java.io.*;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        Account acc=null;
        HashMap<String,Account> hm=new HashMap<>();
        try{
            FileInputStream fi=new FileInputStream("Account.txt");
            ObjectInputStream oi=new ObjectInputStream(fi);

            int count=oi.readInt();
            for (int i=0;i<count;i++)
            {
                acc=(Account)oi.readObject();
                System.out.println(acc);
                hm.put(acc.accno,acc);
            }
            fi.close();
            oi.close();
        } catch (Exception e){}

        FileOutputStream fo=new FileOutputStream("Account.txt");
        ObjectOutputStream oo=new ObjectOutputStream(fo);

        System.out.println("MENU");
        int choise;
        String accno;
        String name;
        double balance;
        do{
            System.out.println("1.create account");
            System.out.println("2.delete account");
            System.out.println("3.view account");
            System.out.println("4.view all account");
            System.out.println("5.save account");
            System.out.println("6.Exit");
            System.out.println("Enter your Choise");
            choise=sc.nextInt();


            switch (choise) {
                case 1:
                    System.out.println("Enter detail Accno,name,balance");
                    accno = sc.next();
                    name = sc.next();
                    balance=sc.nextDouble();
                    acc=new Account(accno,name,balance);
                    hm.put(accno,acc);
                    System.out.println("Account created for "+name);
                    break;
                case 2:
                    System.out.println("Enter Accno");
                    sc.nextLine();
                    accno=sc.nextLine();
                    hm.remove(accno);
                    break;
                case 3:
                    System.out.println("Enter Acccno");
                    accno=sc.next();
                    acc=hm.get(accno);
                    System.out.println(acc);
                    break;
                case 4:
                    for(Account a:hm.values())
                        System.out.println(a);
                    break;
                case 5:
                case 6:
                    oo.writeInt(hm.size());
                    for(Account a:hm.values())
                        oo.writeObject(a);
            }

        }while (choise!=6);
        oo.close();
        oo.flush();
        fo.close();

    }
}
