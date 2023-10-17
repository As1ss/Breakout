package breakout.main.actors;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.Actor;

public class PlayerActor extends Actor {
    private TextureRegion textureRegionPlayer;

    public PlayerActor(TextureRegion playerTexture) {
        this.textureRegionPlayer = playerTexture;
    }

    @Override
    public void act(float delta) {
        super.act(delta);
    }

    @Override
    public void draw(Batch batch, float parentAlpha) {
        batch.draw(textureRegionPlayer,this.getX(),this.getY(),textureRegionPlayer.getRegionWidth(),textureRegionPlayer.getRegionHeight());

    }
}
