package project.midterm.projectmidtermnum.models;

import java.util.Objects;

public class MidtermLoginModel {

    public boolean login(String username, String password) {
        String user = "00user00";
        String pass = "Ewwness";
        return Objects.equals(username, user) && Objects.equals(password, pass);
    }

}
