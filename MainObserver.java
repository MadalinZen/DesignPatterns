package DesignPatterns.Observer;

public class MainObserver {

    public static void main(String[] args) {

        HeadHunter hh = new HeadHunter();

        hh.registerObserver(new JobSeeker("Mike"));
        hh.registerObserver(new JobSeeker("Madalin"));
        hh.registerObserver(new JobSeeker("Jeff"));

        // each time a new job is added,all registered job seekers get notified

        hh.addJob("Facebook job");
        hh.addJob("Google job");
        hh.addJob("Apple job");
    }
}
