package net.minecraft.util;

import net.minecraft.client.settings.GameSettings;

public class MovementInputFromOptions extends MovementInput
{
    private final GameSettings gameSettings;

    public MovementInputFromOptions(GameSettings gameSettingsIn)
    {
        this.gameSettings = gameSettingsIn;
    }

    public void updatePlayerMoveState()
    {
        this.moveStrafe = 0.0F;
        this.moveForward = 0.0F;

        if (this.gameSettings.field_183509_X.isKeyDown())
        {
            ++this.moveForward;
        }

        if (this.gameSettings.keyBindLeft.isKeyDown())
        {
            --this.moveForward;
        }

        if (this.gameSettings.keyBindForward.isKeyDown())
        {
            ++this.moveStrafe;
        }

        if (this.gameSettings.keyBindBack.isKeyDown())
        {
            --this.moveStrafe;
        }

        this.jump = this.gameSettings.keyBindRight.isKeyDown();
        this.sneak = this.gameSettings.keyBindJump.isKeyDown();

        if (this.sneak)
        {
            this.moveStrafe = (float)((double)this.moveStrafe * 0.3D);
            this.moveForward = (float)((double)this.moveForward * 0.3D);
        }
    }
}
