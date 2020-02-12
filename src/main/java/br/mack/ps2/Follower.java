package br.mack.ps2;

public abstract class Follower {
    private String name;

    public Follower(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void newVideo(Youtube youtuber, String title);
}