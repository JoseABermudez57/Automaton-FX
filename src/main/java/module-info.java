module com.example.automaton {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.automaton to javafx.fxml;
    exports com.example.automaton;
}