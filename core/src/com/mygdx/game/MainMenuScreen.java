package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.math.Rectangle;

/**
 * Created by bezvi on 19.01.2017.
 */

public class MainMenuScreen implements Screen{

    final Drop game;
    OrthographicCamera camera;

    public  MainMenuScreen(final Drop gam) {
     this.game = gam;

        camera = new OrthographicCamera();
        camera.setToOrtho(false, 800,480);

    }

    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(0, 0, 0.2f, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        camera.update();

        game.batch.setProjectionMatrix(camera.combined);
        game.batch.begin();
        game.font.draw(game.batch, "Catch the fruit!", 100,150);
        game.font.draw(game.batch, "Touch the screen to start!", 100,100);
        game.batch.end();


        if (Gdx.input.isTouched()){
            game.setScreen(new GameScreen(game));
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

    }
}
