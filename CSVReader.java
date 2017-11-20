import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import info.debatty.java.stringsimilarity.*;
public class CSVReader {

    public static void main(String[] args) {
    	

        String csvFile = "C:/Users/User/Desktop/Spell_Cheker/greek_dic.csv";
        String line = "";
        String cvsSplitBy = ",";
        
        HashSet<String> word=new HashSet<String>();        
        String[] curr;
        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
        	
        	
            while ((line = br.readLine()) != null) {
            	
                // use comma as separator
                curr = line.split(cvsSplitBy);
                word.add(curr[0]);
                
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        
        int res = 100;
        int current_distance;
        String similar = null;
        int count=0;
        
        for(String w : word){
        	DamerauLevenshtein t = new DamerauLevenshtein("÷ïôíñïò", w);
        	current_distance = t.getSimilarity();
        	if (current_distance<res){
        		res =current_distance;
        		similar =w;
        	}
       	}
        
        System.out.print(similar);
                

        
        
        
        Levenshtein l = new Levenshtein();
        NormalizedLevenshtein n = new NormalizedLevenshtein();
        Damerau d = new Damerau();
        OptimalStringAlignment osa = new OptimalStringAlignment();
        JaroWinkler jw = new JaroWinkler();
        LongestCommonSubsequence lcs = new LongestCommonSubsequence();
        info.debatty.java.stringsimilarity.MetricLCS lcc = new info.debatty.java.stringsimilarity.MetricLCS();
        NGram twogram = new NGram(2);
        QGram dig = new QGram(2);
        
        
       // System.out.println(l.distance("My string", "My $tring"));
        //System.out.println(l.distance("My string", "My $tring"));
        //System.out.println(l.distance("My string", "Leon"));
        
        
        
    }
}