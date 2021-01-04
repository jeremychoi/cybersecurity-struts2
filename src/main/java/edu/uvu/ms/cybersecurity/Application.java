package edu.uvu.ms.cybersecurity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    /**
     * Entry point method.
     *
     * @param args
     * 			Command line arguments
     */
    public static void main(final String[] args) {
        SpringApplication.run(Application.class, args);
    }

    private final User user;

    public UserCause(User user, String message) {
        super(hudson.slaves.Messages._SlaveComputer_DisconnectedBy(
                    user!=null ? user.getId() : Jenkins.ANONYMOUS.getName(), 
                    message != null ? " : " + message : ""
            ));
        this.user = user;
    }


    public User getUser() {
        return user;
    }
}
