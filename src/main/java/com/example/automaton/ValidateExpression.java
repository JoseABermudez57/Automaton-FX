package com.example.automaton;

import java.util.*;


public class ValidateExpression {

    String state;

    public ValidationResult ValidateRegularExpression (String text){

        char[] entrys = text.toCharArray();
        List<String> states = new ArrayList<>();

        state = "q0";

        for (char entry: entrys) {
            states.add(state);
            switch (state) {
                case "q0" -> {
                    switch (entry) {
                        case 'G' -> state = "q1";
                        case 'H' -> state = "q3";
                    }
                }
                case "q1" -> {
                    if (entry >= 'X' && entry <= 'Z') {
                        state = "q2";
                    }
                }
                case "q2", "q4" -> {
                    if (entry == '-') {
                        state = "q5";
                    }
                }
                case "q3" -> {
                    if (entry >= 'A' && entry <= 'G') {
                        state = "q4";
                    }
                }
                case "q5" -> {
                    if (entry == '0') {
                        state = "q6";
                    } else if (entry >= '1' && entry <= '9') {
                        state = "q17";
                    }
                }
                case "q6" -> {
                    if (entry == '0') {
                        state = "q7";
                    } else if (entry >= '1' && entry <= '9') {
                        state = "q14";
                    }
                }
                case "q7" -> {
                    if (entry == '0') {
                        state = "q8";
                    } else if (entry >= '1' && entry <= '9') {
                        state = "q12";
                    }
                }
                case "q8" -> {
                    if (entry >= '1' && entry <= '9') {
                        state = "q9";
                    }
                }
                case "q9", "q13", "q16", "q20" -> {
                    if (entry == '-') {
                        state = "q10";
                    }
                }
                case "q10" -> {
                    if (entry >= 'A' && entry <= 'Z') {
                        state = "q11";
                    }
                }
                case "q12" -> {
                    if (entry >= '0' && entry <= '9') {
                        state = "q13";
                    }
                }
                case "q14" -> {
                    if (entry >= '0' && entry <= '9') {
                        state = "q15";
                    }
                }
                case "q15" -> {
                    if (entry >= '0' && entry <= '9') {
                        state = "q16";
                    }
                }
                case "q17" -> {
                    if (entry >= '0' && entry <= '9') {
                        state = "q18";
                    }
                }
                case "q18" -> {
                    if (entry >= '0' && entry <= '9') {
                        state = "q19";
                    }
                }
                case "q19" -> {
                    if (entry >= '0' && entry <= '9') {
                        state = "q20";
                    }
                }
            }
        }

        boolean isValid = state.equals("q11");
        return new ValidationResult(isValid, states);
    }
}
