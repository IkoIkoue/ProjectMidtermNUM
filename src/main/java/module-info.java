module project.midterm.projectmidtermnum {
    requires javafx.controls;
    requires javafx.fxml;


    opens project.midterm.projectmidtermnum to javafx.fxml;
    exports project.midterm.projectmidtermnum;
}