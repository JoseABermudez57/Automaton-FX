package com.example.automaton;

import java.util.List;

public class ValidationResult {
    private boolean isValid;
    private List<String> cases;

    public ValidationResult(boolean isValid, List<String> cases) {
        this.isValid = isValid;
        this.cases = cases;
    }

    public boolean isValid() {
        return isValid;
    }

    public List<String> getCases() {
        return cases;
    }
}
