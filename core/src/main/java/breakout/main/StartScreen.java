package breakout.main;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;

/**
 * First screen of the application. Displayed after the application is created.
 */
public class StartScreen implements Screen {
    private Main game;

    public StartScreen(Main game) {
        this.game = game;

    }

    @Override
    public void show() {




    }

    @Override
    public void render(float delta) {

        Gdx.gl.glClearColor(0.15f, 0.15f, 0.2f, 1f);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);



        game.getBatch().begin();
        game.getBatch().draw(game.getBackground(),0,0,Gdx.graphics.getWidth(),Gdx.graphics.getHeight());
        game.getBigFont().draw(game.getBatch(), "BREAKOUT", 580f, 950f);
        game.getMiddleFont().draw(game.getBatch(),"START",850f,550f);
        game.getMiddleFont().draw(game.getBatch(),"HIGH SCORES",600f,250f);
        game.getBatch().end();

        if (Gdx.input.isTouched()) {
            game.setScreen(new GameScreen(game));

        }

    }

    public void update(float delta) {
        if (Gdx.input.isTouched()) {
            game.setScreen(new GameScreen(game));
            dispose();
        }

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
        // This method is called when another screen replaces this one.
    }

    @Override
    public void dispose() {
        // Destroy screen's assets here.
        game.getBatch().dispose();
        game.getBigFont().dispose();
    }
}
