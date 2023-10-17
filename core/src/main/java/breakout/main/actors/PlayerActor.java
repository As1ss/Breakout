package breakout.main.actors;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.Actor;

public class PlayerActor extends Actor {
    private TextureRegion textureRegionPlayer;
    private int xSpeed;

    public PlayerActor(TextureRegion playerTexture) {
        this.textureRegionPlayer = playerTexture;
        this.xSpeed=1024;
    }

    @Override
    public void act(float delta) {
        float input = Gdx.input.getX();
        if (Gdx.input.isTouched()){
            if (input<Gdx.graphics.getWidth()/2f){
                this.setX(this.getX()-xSpeed*delta);
            }
            else{
                this.setX(this.getX()+xSpeed*delta);
            }
        }
        if (this.getX()+textureRegionPlayer.getRegionWidth()>Gdx.graphics.getWidth()){
            this.setX(Gdx.graphics.getWidth()-textureRegionPlayer.getRegionWidth());
        }
        if (this.getX()<0){
            this.setX(0);
        }

    }

    @Override
    public void draw(Batch batch, float parentAlpha) {
        Color col = getColor();
        batch.setColor(col.r,col.g,col.b,col.a *parentAlpha);
        batch.draw(textureRegionPlayer,this.getX(),this.getY(),textureRegionPlayer.getRegionWidth(),textureRegionPlayer.getRegionHeight());

    }
}
