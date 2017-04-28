package br.com.memorialacademico.model;

/**
 * Created by i857583 on 22/04/17.
 */
public class AdminCredentials {

    private String username;
    private String password;

    public AdminCredentials(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public AdminCredentials() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
