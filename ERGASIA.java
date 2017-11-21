import java.io.*;
import java.util.*;
import java.util.Scanner;

class ERGASIA {
    public static void main(String[] args) throws FileNotFoundException {
        DictionarySearch();
    }
    public static void DictionarySearch () throws FileNotFoundException {
        Scanner scanner = new Scanner(new FileReader("src/newfile.txt"));
        HashMap<String, String> map = new HashMap<String, String>();
        while (scanner.hasNextLine()) {
            String columns = scanner.nextLine();
            map.put(columns,"\n");
        } // περνάω το λεξικό στο σύστημα
    
       String ans = "OXI"; 
       do {
        Scanner n1 = new Scanner(System.in ,"utf-8");
        System.out.print("Παρακαλώ εισάγετε τη λέξη που θέλετε να αναζητήσετε \n");
        String x = n1.next();
        if(map.containsKey(x) == true) {
           System.out.print("Η λέξη υπάρχει στο λεξικό \n");
        } else {
           System.out.print("Η λέξη δεν υπάρχει στο λεξικό \n");
        }
        System.out.print("Θέλετε να συνεχίσετε την αναζήτηση;\nΑν ναι,πληκτρολογήστε ΝΑΙ,διαφορετικά η διαδικασία θα σταματήσει.\n");
        do {
         ans = n1.next();
        } while ("NAI".equals(ans) || "OXI".equals(ans));
       } while ("ΝΑΙ".equals(ans) );
    }
} // η διαδικασία με την οποία αναζητάω τη λέξη και επικοινωνώ με τον χρήστη
    

    

