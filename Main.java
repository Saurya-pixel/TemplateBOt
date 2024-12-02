import java.util.Scanner;

public class Main {

       // CREATE INSTANCE VARIABLES HERE. Ensure they are static.
       // May want to create an array of goodbye answers.

       static String[] randomResponses = {
                     "Sorry I don't quite understand what you're saying, please respond with E if you want to exit!",
                     "Please respond with a movie genre you're interested in watching, otherwise please respond with E if you want to exit!",
                     "I don't think thats a movie genre? Please respond with E if you want to exit!",
                     "I don't remember that being a genre to watch, please respond with E if you want to exit!",
                     "Sorry I am not aware of that genre, is it new? Please respond with E if you want to exit!" };
       static Movie[] horror = MovieGenres.Horror;
       static Movie[] comedy = { new Movie("ted",
                     "John Bennett, a man whose childhood wish of bringing his teddy bear to life came true, now must decide between keeping the relationship with the bear, Ted or his girlfriend, Lori.",
                     2012, "R"),
                     new Movie("Shrek",
                                   "A mean lord exiles fairytale creatures to the swamp of a grumpy ogre, who must go on a quest and rescue a princess for the lord in order to get his land back.",
                                   2001, "PG"),
                     new Movie("Friday",
                                   "It's Friday, and Craig and Smokey must come up with $200 they owe a local bully or there won't be a Saturday.",
                                   1995, "R") };
       static Movie[] action = { new Movie("John Wick",
                     "John Wick, a former hitman is forced to return to action and seek revenge after his home is broken into and robbed, and his dog killed.",
                     2014, "R"),
                     new Movie("Interstellar",
                                   "When Earth becomes uninhabitable in the future, a farmer and ex-NASA pilot, Joseph Cooper, are tasked with finding a new planet for humans.",
                                   2014, "PG-13"),
                     new Movie("The Hunger Games",
                                   "Katniss Everdeen is forced to participate in the Hunger Games: a televised competition in which two teenagers from each of the twelve Districts of Panem are chosen at random to fight to the death.",
                                   2012, "PG-13") };
       static Movie[] romantic = { new Movie("La La Land",
                     "When Sebastian, a pianist, and Mia, an actress, follow their passion and achieve success in their respective fields, they find themselves torn between their love for each other and their careers.",
                     2016, "PG-13"),
                     new Movie("Love Actually",
                                   "Love Actually follows the lives of eight very different couples in dealing with their love lives in various loosely interrelated tales all set during a frantic month before Christmas in London, England.",
                                   2003, "PG"),
                     new Movie("The Fault in Our Stars",
                                   "Two teenagers, Hazel and Gus, meet at a cancer support group and fall in love.",
                                   2014, "PG-13") };
       static boolean value = true;

       public static void main(String[] args) {
              Scanner in = new Scanner(System.in);// Creates scanner object.
              // Scanner in2 = new Scanner (System.in);//Creates a second scanner object.

              System.out.println(
                            "Hello movie lover! I am your popcorn pal who makes selecting a movie a lot more efficient and worthwhile. I promise you will never be disappointed with our suggestions. Which genre are you looking for?");

              while (value) {
                     String userResp = in.nextLine(); // in.nextLine() uses the scanner object to get the user's
                                                      // responnse as a String
                     System.out.println(getResponse(userResp));
              }

              // You will need to make sure your chatbot continues looping until it sees
              // certain keywords from the user such as "bye","goodbye"...
              // do you need a while loop or a for loop?

              // Consider: How do I check what the user says and compare it to my keywords?
              // What methods do I have?

       }

       // Create other methods that might be helpful down here.
       // For example a method called checkWord where the user traverses through an
       // array to check if a word matches.

       // One method you might need is getRandomResponse()
       public static String getRandomResponse() {
              return randomResponses[(int) (Math.random() * 5)];
       }
       // It'll generate a random response when the chatbot doesn't understand what to
       // say

       // Here is an example of a method you might use.
       public static String getResponse(String statement) {
              String response = "";
              String lowerCaseStatement = statement.toLowerCase();

              if (lowerCaseStatement.indexOf("action") >= 0 && statement != null) {
                     response = "I would highly recommend " + action[(int) (Math.random() * 3)].getName() +
                                   ". If you would like additional details please respond with the movie and specifically include which details you want such as summary, year, or age rating! If not please respond with E to exit!";
              } else if ((lowerCaseStatement.indexOf("horror") >= 0
                            || lowerCaseStatement.indexOf("thriller") >= 0) && statement != null) {
                     response = "You should definitely watch " + horror[(int) (Math.random() * 3)].getName() +
                                   ". If you would like additional details please respond with the movie and specifically include which details you want such as summary, year, or age rating! If not please respond with E to exit!";
              } else if (lowerCaseStatement.indexOf("comedy") >= 0 && statement != null) {
                     response = "The movie " + comedy[(int) (Math.random() * 3)].getName() + " is so funny!" +
                                   " If you would like additional details please respond with the movie and specifically include which details you want such as summary, year, or age rating! If not please respond with E to exit!";
              } else if ((lowerCaseStatement.indexOf("romantic") >= 0 || lowerCaseStatement.indexOf("romance") >= 0
                            || lowerCaseStatement.indexOf("romcom") >= 0) && statement != null) {
                     response = "Are you in the mood for " + romantic[(int) (Math.random() * 3)].getName() + "?" +
                                   " If you would like additional details please respond with the movie and specifically include which details you want such as summary, year, or age rating! If not please respond with E to exit!";
              } else if (lowerCaseStatement.indexOf("john wick") >= 0
                            && (lowerCaseStatement.indexOf("year") >= 0 || lowerCaseStatement.indexOf("released") >= 0)
                            && statement != null) {
                     response = "John Wick was released in " + action[0].getYear();
              } else if (lowerCaseStatement.indexOf("interstellar") >= 0
                            && (lowerCaseStatement.indexOf("year") >= 0 || lowerCaseStatement.indexOf("released") >= 0)
                            && statement != null) {
                     response = "Interstellar was released in " + action[1].getYear();
              } else if (lowerCaseStatement.indexOf("the hunger games") >= 0
                            && (lowerCaseStatement.indexOf("year") >= 0 || lowerCaseStatement.indexOf("released") >= 0)
                            && statement != null) {
                     response = "The Hunger Games was released in " + action[2].getYear();
              } else if (lowerCaseStatement.indexOf("john wick") >= 0 && lowerCaseStatement.indexOf("summary") >= 0
                            && statement != null) {
                     response = action[0].getSummary();
              } else if (lowerCaseStatement.indexOf("interstellar") >= 0 && lowerCaseStatement.indexOf("summary") >= 0
                            && statement != null) {
                     response = action[1].getSummary();
              } else if (lowerCaseStatement.indexOf("the hunger games") >= 0
                            && lowerCaseStatement.indexOf("summary") >= 0 && statement != null) {
                     response = action[2].getSummary();
              } else if ((lowerCaseStatement.indexOf("rating") >= 0 || lowerCaseStatement.indexOf("rated") >= 0)
                            && statement != null && lowerCaseStatement.indexOf("john wick") >= 0) {
                     response = "John Wick is rated: " + action[0].getRating();
              } else if (statement != null && lowerCaseStatement.indexOf("interstellar") >= 0
                            && (lowerCaseStatement.indexOf("rating") >= 0
                                          || lowerCaseStatement.indexOf("rated") >= 0)) {
                     response = "Interstellar is rated: " + action[1].getRating();
              } else if (statement != null && lowerCaseStatement.indexOf("the hunger games") >= 0
                            && (lowerCaseStatement.indexOf("rating") >= 0
                                          || lowerCaseStatement.indexOf("rated") >= 0)) {
                     response = "The Hunger Games is rated: " + action[2].getRating();
              } else if (statement.indexOf("la la land") >= 0
                            && (lowerCaseStatement.indexOf("year") >= 0 || lowerCaseStatement.indexOf("released") >= 0)
                            && statement != null) {
                     response = "La La Land was released in " + romantic[0].getYear();
              } else if (statement.indexOf("love actually") >= 0
                            && (lowerCaseStatement.indexOf("year") >= 0 || lowerCaseStatement.indexOf("released") >= 0)
                            && statement != null) {
                     response = "Love Actually was released in " + romantic[1].getYear();
              } else if (statement.indexOf("the fault in our stars") >= 0
                            && (lowerCaseStatement.indexOf("year") >= 0 || lowerCaseStatement.indexOf("released") >= 0)
                            && statement != null) {
                     response = "The Fault In Our Stars was released in " + romantic[2].getYear();
              } else if (lowerCaseStatement.indexOf("la la land") >= 0 && lowerCaseStatement.indexOf("summary") >= 0
                            && statement != null) {
                     response = romantic[0].getSummary();
              } else if (lowerCaseStatement.indexOf("love actually") >= 0 && lowerCaseStatement.indexOf("summary") >= 0
                            && statement != null) {
                     response = romantic[1].getSummary();
              } else if (lowerCaseStatement.indexOf("the fault in our stars") >= 0
                            && lowerCaseStatement.indexOf("summary") >= 0 && statement != null) {
                     response = romantic[2].getSummary();
              } else if (statement != null && lowerCaseStatement.indexOf("la la land") >= 0
                            && (lowerCaseStatement.indexOf("rating") >= 0
                                          || lowerCaseStatement.indexOf("rated") >= 0)) {
                     response = "La La Land is rated: " + romantic[0].getRating();
              } else if (statement != null && lowerCaseStatement.indexOf("love actually") >= 0
                            && (lowerCaseStatement.indexOf("rating") >= 0
                                          || lowerCaseStatement.indexOf("rated") >= 0)) {
                     response = "Love Actually is rated: " + romantic[1].getRating();
              } else if (statement != null && lowerCaseStatement.indexOf("the fault in our stars") >= 0
                            && (lowerCaseStatement.indexOf("rating") >= 0
                                          || lowerCaseStatement.indexOf("rated") >= 0)) {
                     response = "The Fault In Our Stars is rated: " + romantic[2].getRating();
              } else if (lowerCaseStatement.indexOf("conjuring") >= 0
                            && (lowerCaseStatement.indexOf("year") >= 0 || lowerCaseStatement.indexOf("released") >= 0)
                            && statement != null) {
                     response = "Conjuring was released in " + horror[0].getYear();
              } else if (lowerCaseStatement.indexOf("jigsaw") >= 0
                            && (lowerCaseStatement.indexOf("year") >= 0 || lowerCaseStatement.indexOf("released") >= 0)
                            && statement != null) {
                     response = "Jigsaw was released in " + horror[1].getYear();
              } else if (lowerCaseStatement.indexOf("the black phone") >= 0
                            && (lowerCaseStatement.indexOf("year") >= 0 || lowerCaseStatement.indexOf("released") >= 0)
                            && statement != null) {
                     response = "The Black Phone was released in " + horror[2].getYear();
              } else if (lowerCaseStatement.indexOf("conjuring") >= 0 && lowerCaseStatement.indexOf("summary") >= 0
                            && statement != null) {
                     response = horror[0].getSummary();
              } else if (lowerCaseStatement.indexOf("jigsaw") >= 0 && lowerCaseStatement.indexOf("summary") >= 0
                            && statement != null) {
                     response = horror[1].getSummary();
              } else if (lowerCaseStatement.indexOf("the black phone") >= 0
                            && lowerCaseStatement.indexOf("summary") >= 0 && statement != null) {
                     response = horror[2].getSummary();
              } else if (statement != null && lowerCaseStatement.indexOf("conjuring") >= 0
                            && (lowerCaseStatement.indexOf("rating") >= 0
                                          || lowerCaseStatement.indexOf("rated") >= 0)) {
                     response = "Conjuring is rated: " + horror[0].getRating();
              } else if (statement != null && lowerCaseStatement.indexOf("jigsaw") >= 0
                            && (lowerCaseStatement.indexOf("rating") >= 0
                                          || lowerCaseStatement.indexOf("rated") >= 0)) {
                     response = "Jigsaw is rated: " + horror[1].getRating();
              } else if (statement != null && lowerCaseStatement.indexOf("the black phone") >= 0
                            && (lowerCaseStatement.indexOf("rating") >= 0
                                          || lowerCaseStatement.indexOf("rated") >= 0)) {
                     response = "The Black Phone is rated: " + horror[2].getRating();
              } else if (lowerCaseStatement.indexOf("ted") >= 0
                            && (lowerCaseStatement.indexOf("year") >= 0 || lowerCaseStatement.indexOf("released") >= 0)
                            && statement != null) {
                     response = "Ted was released in " + comedy[0].getYear();
              } else if (lowerCaseStatement.indexOf("shrek") >= 0
                            && (lowerCaseStatement.indexOf("year") >= 0 || lowerCaseStatement.indexOf("released") >= 0)
                            && statement != null) {
                     response = "Shrek was released in " + comedy[1].getYear();
              } else if (lowerCaseStatement.indexOf("friday") >= 0
                            && (lowerCaseStatement.indexOf("year") >= 0 || lowerCaseStatement.indexOf("released") >= 0)
                            && statement != null) {
                     response = "Friday was released in " + comedy[2].getYear();
              } else if (lowerCaseStatement.indexOf("ted") >= 0 && lowerCaseStatement.indexOf("summary") >= 0
                            && statement != null) {
                     response = comedy[0].getSummary();
              } else if (lowerCaseStatement.indexOf("shrek") >= 0 && lowerCaseStatement.indexOf("summary") >= 0
                            && statement != null) {
                     response = comedy[1].getSummary();
              } else if (lowerCaseStatement.indexOf("friday") >= 0 && lowerCaseStatement.indexOf("summary") >= 0
                            && statement != null) {
                     response = comedy[2].getSummary();
              } else if (statement != null && lowerCaseStatement.indexOf("ted") >= 0
                            && (lowerCaseStatement.indexOf("rating") >= 0
                                          || lowerCaseStatement.indexOf("rated") >= 0)) {
                     response = "Ted is rated: " + comedy[0].getRating();
              } else if (statement != null && lowerCaseStatement.indexOf("shrek") >= 0
                            && (lowerCaseStatement.indexOf("rating") >= 0
                                          || lowerCaseStatement.indexOf("rated") >= 0)) {
                     response = "Shrek is rated: " + comedy[1].getRating();
              } else if (statement != null && lowerCaseStatement.indexOf("friday") >= 0
                            && (lowerCaseStatement.indexOf("rating") >= 0
                                          || lowerCaseStatement.indexOf("rated") >= 0)) {
                     response = "Friday is rated: " + comedy[2].getRating();
              } else if (statement != null
                            && (lowerCaseStatement.indexOf("E") >= 0 || lowerCaseStatement.indexOf("e") >= 0)
                            && lowerCaseStatement.length() == 1) {
                     response = "Enjoy your show!";
                     value = false;
              } else if (statement != null && (lowerCaseStatement.indexOf("thank you") >= 0
                            || lowerCaseStatement.indexOf("exit") >= 0)) {
                     response = "No problem, please type in E to exit!";
              } else if (statement.isEmpty() == true) {
                     response = "Please enter a genre you're interested in watching!";
              } else {
                     response = getRandomResponse();
              }
              return response;
       }

}