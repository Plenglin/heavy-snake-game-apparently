package io.github.plenglin.sandvich.food;

import com.badlogic.gdx.graphics.Texture;
import io.github.plenglin.sandvich.Main;
import io.github.plenglin.sandvich.assets.Assets;
import io.github.plenglin.util.IntVector;

/**
 * Did someone say...
 * <p>
 * <p>
 * <p>
 * CHOCOLATE!?
 */
public class Chocolate extends Food {

    public Chocolate(IntVector position) {
        super(position);
    }

    @Override
    public boolean allowOverheal() {
        return true;
    }

    @Override
    public Texture getTexture() {
        return Main.assets.get(Assets.chocolate);
    }

    @Override
    public int getPointValue() {
        return 150;
    }

    @Override
    public int getHealth() {
        return 50;
    }

    @Override
    public int getMoney() {
        return 0;
    }

}
