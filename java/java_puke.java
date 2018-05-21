import java.util.ArrayList;
import  java.util.Collections;

public class java_puke{

    public static void main(String[] args){
        String[] num={"A","1","2","3","4","5","6","7","8","9","10","J","Q","K"};
        String[] color={"RT","HT","FP","MH"};
        ArrayList<String> poker = new ArrayList<>();


        for(String s1:color){
            for(String s2:num){
                    poker.add(s1+s2);
            }
        }

        poker.add("small");
        poker.add("big");

        Collections.shuffle(poker);

        ArrayList<String>  pony = new ArrayList<>();
        ArrayList<String>  tom = new ArrayList<>();
        ArrayList<String>  jack = new ArrayList<>();
        ArrayList<String>  dipai = new ArrayList<>();

        for(int i=0;i< poker.size(); i++)
        {
            if(i>=poker.size()-3){
                dipai.add(poker.get(i));
            }
            else if(i%3 == 0)
                pony.add(poker.get(i));
            else if(i%3 == 1)
                tom.add(poker.get(i));
            else if(i%3 == 2)
                jack.add(poker.get(i));


        }

        Collections.sort(pony);
        Collections.sort(tom);
        Collections.sort(jack);
        Collections.sort(dipai);
        System.out.println("pony:"+pony);
        System.out.println("tom:"+tom);
        System.out.println("jack:"+jack);
        System.out.println("dipai:"+dipai);
    }
}

