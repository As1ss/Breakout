package breakout.main;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;


/**
 * {@link com.badlogic.gdx.ApplicationListener} implementation shared by all platforms.
 */
public class Main extends Game {
    private SpriteBatch batch;
    private BitmapFont bigFont;
    private BitmapFont middleFont;
    private BitmapFont smallFont;
    private Sound brickHit1Sound;
    private Sound brickHit2Sound;
    private Sound confirmSound;
    private Sound highScoreSound;
    private Sound hurtSound;
    private Music musicTheme;
    private Sound noSelectSound;
    private Sound paddleHitSound;
    private Sound pauseSound;
    private Sound recoverSound;
    private Sound scoreSound;
    private Sound selectSound;
    private Sound victorySound;
    private Sound wallHitSound;
    private Texture background;




    @Override
    public void create() {
        this.setScreen(new StartScreen(this));
        batch = new SpriteBatch();

        Gdx.graphics.setVSync(true);






        chargeGraphics();
        chargeFonts();
        chargeSounds();

    }

    private void chargeGraphics() {
        background = new Texture("graphics/background.png");
    }

    private void chargeSounds() {
        brickHit1Sound = Gdx.audio.newSound(Gdx.files.internal("sounds/brick-hit-1.wav"));
        brickHit2Sound = Gdx.audio.newSound(Gdx.files.internal("sounds/brick-hit-2.wav"));
        confirmSound = Gdx.audio.newSound(Gdx.files.internal("sounds/confirm.wav"));
        highScoreSound = Gdx.audio.newSound(Gdx.files.internal("sounds/high_score.wav"));
        hurtSound = Gdx.audio.newSound(Gdx.files.internal("sounds/hurt.wav"));
        musicTheme = Gdx.audio.newMusic(Gdx.files.internal("sounds/music.wav"));
        noSelectSound = Gdx.audio.newSound(Gdx.files.internal("sounds/no-select.wav"));
        paddleHitSound = Gdx.audio.newSound(Gdx.files.internal("sounds/paddle_hit.wav"));
        pauseSound = Gdx.audio.newSound(Gdx.files.internal("sounds/pause.wav"));
        recoverSound = Gdx.audio.newSound(Gdx.files.internal("sounds/recover.wav"));
        scoreSound = Gdx.audio.newSound(Gdx.files.internal("sounds/score.wav"));
        selectSound = Gdx.audio.newSound(Gdx.files.internal("sounds/select.wav"));
        victorySound = Gdx.audio.newSound(Gdx.files.internal("sounds/victory.wav"));
        wallHitSound = Gdx.audio.newSound(Gdx.files.internal("sounds/wall_hit.wav"));
    }

    private void chargeFonts() {
        bigFont = new BitmapFont(Gdx.files.internal("font/font.fnt"));
        bigFont.getData().scale(6);

        middleFont = new BitmapFont(Gdx.files.internal("font/font.fnt"));
        middleFont.getData().scale(4);

        smallFont = new BitmapFont(Gdx.files.internal("font/font.fnt"));
        smallFont.getData().scale(2);
    }

    @Override
    public void render() {
        super.render();
    }


    @Override
    public void dispose() {
        batch.dispose();
        bigFont.dispose();
    }


    public SpriteBatch getBatch() {
        return batch;
    }

    public BitmapFont getBigFont() {
        return bigFont;
    }

    public BitmapFont getMiddleFont() {
        return middleFont;
    }

    public Texture getBackground() {
        return background;
    }

    public BitmapFont getSmallFont() {
        return smallFont;
    }

    public Sound getBrickHit1Sound() {
        return brickHit1Sound;
    }

    public Sound getBrickHit2Sound() {
        return brickHit2Sound;
    }

    public Sound getConfirmSound() {
        return confirmSound;
    }

    public Sound getHighScoreSound() {
        return highScoreSound;
    }

    public Sound getHurtSound() {
        return hurtSound;
    }

    public Music getMusicTheme() {
        return musicTheme;
    }

    public Sound getNoSelectSound() {
        return noSelectSound;
    }

    public Sound getPaddleHitSound() {
        return paddleHitSound;
    }

    public Sound getPauseSound() {
        return pauseSound;
    }

    public Sound getRecoverSound() {
        return recoverSound;
    }

    public Sound getScoreSound() {
        return scoreSound;
    }

    public Sound getSelectSound() {
        return selectSound;
    }

    public Sound getVictorySound() {
        return victorySound;
    }

    public Sound getWallHitSound() {
        return wallHitSound;
    }
}
