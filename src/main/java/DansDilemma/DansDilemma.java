package DansDilemma;

import java.util.HashSet;
import java.util.Set;

public class DansDilemma {

    public Integer dilemmaOfTwo(Double input1, Double input2) {
        return dilemmaOfN(new Double[]{input1, input2});
    }

    public Integer dilemmaOfThree(Double input1, Double input2, Double input3) {
        return dilemmaOfN(new Double[]{input1, input2, input3});
    }

    public Integer dilemmaOfN(Double... args){
        Set<Double> set = new HashSet<Double>();
        for(int i=0; i<args.length; i++) {
            for(int j=i+1; j<args.length; j++) {
                set.add(args[i]+args[j]);
                set.add(args[i]-args[j]);
                set.add(args[j]-args[i]);
                set.add(args[i]*args[j]);
                if(args[j]!=0) set.add(args[i]/args[j]);
                if(args[i]!=0) set.add(args[j]/args[i]);
            }
        }
        return set.size();
    }
}
