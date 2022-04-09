package java8;

import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
      getUniqueHashTags();
    }

    private static void getUniqueHashTags(){
        //todo. Select all unique hashtags from twits and collect

        List<String> twits = new ArrayList<>();
        twits.add("#java is a first programming language what I start to use!");
        twits.add("I like walk around the #lake in the morning.");
        twits.add("I caught a big #fish on the #lake in friday");
        twits.add("Yesterday, in the #coffeehouse and analyzed my solution for test task from previous #java interview.");
        twits.add("Today my son tell my that he want to be a QA test #engineer in #java as his father");
    }
}
