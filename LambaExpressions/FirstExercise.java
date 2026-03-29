package LambaExpressions;

class FirstExercise {

    public static void main(String[] args) {
        Runnable myLamda = () -> System.out.println("Learning lamba!");

        myLamda.run();
    }
    
}