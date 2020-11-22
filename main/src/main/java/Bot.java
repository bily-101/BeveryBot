import net.dv8tion.jda.core.JDA;
import net.dv8tion.jda.core.JDABuilder;

public class Bot {
    public static void main(String[] args) throws Exception {
        JDA jda = new JDABuilder("SAMPLE_TOKEN").build();
    }
}
