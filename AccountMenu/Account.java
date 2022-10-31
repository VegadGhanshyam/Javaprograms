package AccountMenu;

import java.io.Serializable;

class Account implements Serializable {
    String accno;
    String name;
    double balnace;
    Account(){}
    Account (String a, String n,double b){
        accno=a;
        name=n;
        balnace=b;
    }
    public String toString(){
        return "Account no: "+accno+"\nName "+name+"\nBalance "+balnace+"\n";
    }
}
