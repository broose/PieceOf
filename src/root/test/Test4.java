package root.test;

import org.kohsuke.github.GHContent;
import org.kohsuke.github.GHRepository;
import org.kohsuke.github.GitHub;

import java.io.IOException;

/**
 * Created by andrew on 10/29/15.
 */
public class Test4 {
    final static String userLogin = "maksimenko.natal@yandex.ru";
    final static String username = "maksimenko-natal";
    final static String password = "through all this shit";  // deleted
    final static String localFile = "/home/andrew/ForTests/fromGit.txt";
    static GHRepository repo;
    static GHContent content;

    public static void main(String[] args) throws IOException {
        GitHub github = GitHub.connectUsingPassword(userLogin, password);  // deleted
        repo = github.getRepository(username + "/new-repository-1");


        repo.createContent("smthingNew.jpg", "Got it", username + "/test-folder-1");




    }
}
