import java.util.Date;
public class AlfredQuotes {
    
    public String basicGreeting() {
        // You do not need to code here, this is an example method
        return "Hello, lovely to see you. How are you?";
    }
    
    public String guestGreeting(String name) {

        return "Hello," + name +".Lovely to see you.";
    }
    
    public String dateAnnouncement() {
        Date d = new Date();
        return "It is currently " + d +".";
    }
    
    public String respondBeforeAlexis(String conversation) {

        String newline = System.lineSeparator();
        int alexis = conversation.indexOf("Alexis");
        int alfred = conversation.indexOf("Alfred");

        if(alexis > -1) {
        return conversation + newline + "Right away, sir. She certainly isn't sophisticated enough for that.";
        }
        else if (alfred > -1) {
            return conversation + newline + "At your service. As you wish, naturally.";
        }
        else {
            return "Right. And with that I shall retire.";
        }
    }

	// NINJA BONUS
	// See the specs to overload the guessGreeting method
    // SENSEI BONUS
    // Write your own AlfredQuote method using any of the String methods you have learned!
}