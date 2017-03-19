package com.learn.labs.ColletionsExample;

import java.util.ArrayList;

/**
 * Created by santoshdandey on 3/7/17.
 */
public class MemberCollectionsExample {

    public static void main(String[] args) {
        Member santosh = new Member("Santosh", "10");
        Member miru = new Member("Miru","11");
        Member dandey = new Member("Dandey", "10");

        ArrayList<Member> memberArrayList = new ArrayList<>();
        memberArrayList.add(santosh);
        memberArrayList.add(miru);
        memberArrayList.add(dandey);

        memberArrayList.remove(dandey);

        System.out.println(memberArrayList.toString());

    }
}
