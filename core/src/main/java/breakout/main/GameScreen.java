package breakout.main;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.files.FileHandle;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;

import breakout.main.actors.BackgroundActor;
import breakout.main.actors.PlayerActor;

public class GameScreen implements Screen {

    final Main game;
    private Texture spriteSheet;
    private Texture backgroundTexture;
    private TextureRegion texturePlayer;
    private Skin skin;
    private Stage stage;
    private PlayerActor player;
    private BackgroundActor backgroundActor;
    private Label fpsMeter;

    public GameScreen(Main game){
        this.game = game;
        spriteSheet = new Texture("graphics/breakout_big.png");
        backgroundTexture = new Texture("graphics/background.png");



    }

    @Override
    public void show() {
        skin = new Skin(Gdx.files.internal("skin/arcade-ui.json"));
        stage = new Stage();
        texturePlayer = new TextureRegion(spriteSheet,188,98*4,384,88);
        player = new PlayerActor(texturePlayer);
        player.setPosition(Gdx.graphics.getWidth()/2,50f);
        backgroundActor = new BackgroundActor(backgroundTexture);

        stage.addActor(backgroundActor);
        stage.addActor(player);

        fpsMeter = new Label("FPS: 0",skin);
        fpsMeter.setFontScale(2);
        fpsMeter.setPosition(24f,Gdx.graphics.getHeight()-60f);
        fpsMeter.setColor(Color.GREEN);
        stage.addActor(fpsMeter);
    }

    @Override
    public void render(float delta) {

        Gdx.gl.glClearColor(0.15f, 0.15f, 0.2f, 1f);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);


        update(delta);
        stage.act();
        stage.draw();

    }

    public void update(float delta){
        fpsMeter.setText("FPS: "+ Gdx.graphics.getFramesPerSecond());
        if (Gdx.input.isTouched()){
            game.setScreen(new StartScreen(game));


        }

    }
    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {
        stage.dispose();
        spriteSheet.dispose();


    }

    @Override
    public void dispose() {
        game.getBatch().dispose();


    }
}
