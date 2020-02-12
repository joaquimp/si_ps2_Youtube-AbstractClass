package br.mack.ps2;

import java.util.ArrayList;
import java.util.List;

public class Youtube {
    private String name;
    private List<Follower> followers;

    public Youtube(String name) {
        this.name = name;
        this.followers = new ArrayList();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addSubscriber(Follower follower) {
        this.followers.add(follower);
        System.out.println(name + " tem um novo seguidor - \"" + follower.getName() + "\"");
    }

    public void addVideo(String title) {
        System.out.println(name + " adicionou um novo vídeo com o título \"" + title + "\"");
        for(Follower flw: followers) {
            flw.newVideo(this,title);
        }
    }
}
