module project.midterm.projectmidtermnum {
    requires javafx.controls;
    requires javafx.fxml;

    opens project.midterm.projectmidtermnum.controllers to javafx.fxml;

    exports project.midterm.projectmidtermnum;
}