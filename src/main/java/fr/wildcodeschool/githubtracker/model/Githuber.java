package fr.wildcodeschool.githubtracker.model;

public class Githuber {
    private String name;
    private String email;
    private String login;
    private int id;
    private String avatarUrl;

    public Githuber(String name, String email, String login, int id, String avatarUrl) {
        this.name = name;
        this.email = email;
        this.login = login;
        this.id = id;
        this.avatarUrl = avatarUrl;
    }

    public String getName() {  return this.name; }
    public String getEmail() { return this.email; }
    public String getLogin() { return this.login; }
    public int getId() { return this.id; }
    public String getAvatarUrl() { return this.avatarUrl; }
}
