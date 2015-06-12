package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class MyGdxGame extends ApplicationAdapter {
	SpriteBatch batch;
	Texture img;
	Texture img1;
	Texture img2;
	Texture img3;
	Texture img4;
	Texture img5;
	int x;
	int y;

	
	@Override
	public void create () {
		batch = new SpriteBatch();
		img = new Texture("badlogic.jpg");
		img1 = new Texture("circle.png");
		img2 = new Texture("lines.png");
		img3 = new Texture("rectangle.png");
		img4 = new Texture("square.png");
		img5 = new Texture("Triangle.gif");

		int x = 0;
		int y = 0;

	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(1, 1, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		batch.draw(img1, x, y);
		batch.draw(img2, 0, 0,200,150);
		batch.draw(img3, 350, 30,200,150);
		batch.draw(img4, 350, 200, 300, 200);
		batch.draw(img5, 50, 100);
		batch.end();
		if(Gdx.input.isKeyPressed(Input.Keys.D)){
			x+=2;
		}
	}
}
