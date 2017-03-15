import edu.cmu.meteor.scorer.MeteorConfiguration;
import edu.cmu.meteor.scorer.MeteorScorer;
import edu.cmu.meteor.scorer.MeteorStats;

public class Sample {
    public static void main(String[] args) {
        MeteorConfiguration config = new MeteorConfiguration();
        MeteorScorer scorer = new MeteorScorer(config);
        MeteorStats stats = scorer.getMeteorStats("these include actitvies", "those include actitvies");
        System.out.println(stats.score);
    }
}
