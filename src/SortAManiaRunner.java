public class SortAManiaRunner {
    public static void main(String[] args) {
        Team0SortCompetition team0 = new Team0SortCompetition(); //create an instance of your class
        int[] randIntArr = randomIntsArr(10000); //initialize  a random int array
        String[] randStringArr = randomStringArr(10000, 5); //init a random string array

        System.out.println("Unsorted");
        printArr(randIntArr); //print out the unsorted array

        long time = System.currentTimeMillis(); //start the timer
        int median = team0.challengeOne(randIntArr); //run your challenge one code
        time = System.currentTimeMillis() - time; //stop the timer
        System.out.println("Challenge One Time Taken: " + time * 0.001 + " Seconds"); //print the time
        System.out.println("Median equals: " + median); //print the median you found

        System.out.println("Sorted");
        printArr(randIntArr); //check if the array was sorted correctly
        
        String[] randStringArr = Team0SortCompetition.randomStringArr(100, 5); //init a random string array

        System.out.println("Unsorted");
        Team0SortCompetition.printArr(randStringArr); //print out the unsorted array

        long time = System.nanoTime(); //start the timer
        int median = team0.challengeTwo(randStringArr,""); //run your challenge one code
        time = System.nanoTime() - time; //stop the timer
        System.out.println("Challenge Two Time Taken: " + time * 0.001 + " Seconds"); //print the time

        System.out.println("Sorted");
        Team0SortCompetition.printArr(randStringArr); //check if the array was sorted correctly
    }
}
