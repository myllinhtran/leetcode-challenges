package com.exercise.easy.solved;

import java.util.*;

public class UniqueEmailAddresses {

    public static void main(String[] args) {

        String[] emails = {
                "abc@mail.com",
                "a.bc+de@mail.com",
                "a.b.c@gmail.com",
                "abc@gmail.com"
        };

        int result = new UniqueEmailAddresses().numUniqueEmails(emails);
        System.out.println(result);
    }

    private int numUniqueEmails(String[] emails) {
        Set<String> found = new HashSet<>();
        for (String email : emails) {
            int i = email.indexOf("@");
            String local = email.substring(0, i);
            String rest = email.substring(i);
            if (local.contains("+")) {
                local = local.substring(0, local.indexOf("+"));
            }
            local = local.replaceAll("\\.", "");
            found.add(local + rest);
        }
        return found.size();
    }
}
