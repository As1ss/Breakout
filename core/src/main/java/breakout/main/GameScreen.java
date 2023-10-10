package breakout.main;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.utils.Logger;

public class GameScreen implements Screen {

    final Main game;

    public GameScreen(Main game){
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
        game.getFont().draw(game.getBatch(), "GAMESCREEN TAP TO GO FIRSTCREEN", Gdx.graphics.getWidth() / 2, Gdx.graphics.getHeight() / 2);
        game.getBatch().end();

        if (Gdx.input.isTouched()){
            System.out.println("HA SID PULSADA A");
            game.setScreen(new FirstScreen(game));

        }

    }

    public void update(float delta){
        if (Gdx.input.isTouched()){
            game.setScreen(new FirstScreen(game));
            dispose();
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

    }

    @Override
    public void dispose() {
        game.getBatch().dispose();
        game.getFont().dispose();

    }
}
