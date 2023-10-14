package breakout.main;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.files.FileHandle;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Button;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.badlogic.gdx.scenes.scene2d.utils.ChangeListener;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;

import breakout.main.actors.BackgroundActor;

/**
 * First screen of the application. Displayed after the application is created.
 */
public class StartScreen implements Screen {
    private Main game;
    private Stage stage;
    private Skin skin;
    private Table table;
    private BackgroundActor background;
    private Label startText;
    private Label titleGame;
    private Label highScores;

    public StartScreen(Main game) {
        this.game = game;

    }

    @Override
    public void show() {
        stage = new Stage();
        skin = new Skin(Gdx.files.internal("skin/arcade-ui.json"));
        table = new Table();
        background = new BackgroundActor();
        stage.addActor(background);

        titleGame = new Label("BREAKOUT", skin);
        titleGame.setFontScale(6);

        highScores = new Label("HIGH SCORES", skin);
        highScores.setFontScale(4);


        startText = new Label("START", skin);
        startText.setFontScale(4);

        table.add(titleGame);
        table.row().spaceTop(300f);
        table.add(startText);
        table.row().spaceTop(50f);
        table.add(highScores);
        table.row();


        stage.addActor(table);
        table.setFillParent(true);


        Gdx.input.setInputProcessor(stage);


    }

    @Override
    public void render(float delta) {

        Gdx.gl.glClearColor(0.15f, 0.15f, 0.2f, 1f);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        update(delta);

        stage.act();
        stage.draw();


    }

    public void update(float delta) {
        startText.addListener(new ClickListener() {
            @Override
            public void clicked(InputEvent event, float x, float y) {
                game.setScreen(new GameScreen(game));
            }
        });

    }

    @Override
    public void resize(int width, int height) {
        // Resize your screen here. The parameters represent the new window size.

    }

    @Override
    public void pause() {
        // Invoked when your application is paused.
    }

    @Override
    public void resume() {
        // Invoked when your application is resumed after pause.
    }

    @Override
    public void hide() {
       stage.dispose();
    }

    @Override
    public void dispose() {


    }
}
