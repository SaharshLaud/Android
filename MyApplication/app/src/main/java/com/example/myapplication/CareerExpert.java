package com.example.myapplication;
import java.util.ArrayList;
import java.util.List;
public class CareerExpert {
    List<String> getStreams(String course) {
        List<String> stream = new ArrayList<String>();
        if (course.equals("Biology")) {
            stream.add("Career options for Biology stream:");
            stream.add("M.B.B.S.");
            stream.add("B.Sc Biologist");
            stream.add("B.D.S");
            stream.add("Marine Biologist");
        } else if (course.equals("Science")){
            stream.add("Career options for Science stream:");
            stream.add("BE/B.Tech");
            stream.add("B.Sc.");
            stream.add("B.Arch");
        }
        else if (course.equals("Commerce")){
            stream.add("Career options for Commerce stream:");
            stream.add("B.Com");
            stream.add("B.A/L.L.B");
            stream.add("C.A./C.S.");
            stream.add("B.B.A");
        }
        else if (course.equals("Arts")){
            stream.add("Career options for Arts stream:");
            stream.add("B.A.");
            stream.add("B.F.A.");
            stream.add("B.H.M.");
        }
        return stream;
    }
}