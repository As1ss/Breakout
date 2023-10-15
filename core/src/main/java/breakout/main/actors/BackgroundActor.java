package breakout.main.actors;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.scenes.scene2d.Actor;

public class BackgroundActor extends Actor {
    private Texture texture;

    public BackgroundActor(Texture backgroundTexture) {
        this.texture = backgroundTexture;
    }

    @Override
    public void draw(Batch batch, float parentAlpha) {
        batch.draw(texture, getX(), getY(), Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
    }

    @Override
    public void act(float delta) {

    }
}
