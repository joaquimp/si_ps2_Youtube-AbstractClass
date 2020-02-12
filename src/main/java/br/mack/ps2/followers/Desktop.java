package br.mack.ps2.followers;

import br.mack.ps2.Follower;
import br.mack.ps2.Youtube;

public class Desktop extends Follower {

    public Desktop(String name) {
        super(name);
    }

    @Override
    public void newVideo(Youtube youtuber, String title) {
        System.out.println( this.getName() + " recebeu uma notificação de novo vídeo do "
                + youtuber.getName() + " com o título \"" + title + "\"");
    }
}
