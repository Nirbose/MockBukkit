package be.seeseemelk.mockbukkit.entity;

import be.seeseemelk.mockbukkit.ServerMock;
import be.seeseemelk.mockbukkit.UnimplementedOperationException;
import com.google.common.base.Preconditions;
import org.bukkit.Color;
import org.bukkit.entity.Display;
import org.bukkit.util.Transformation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joml.Matrix4f;

import java.util.UUID;

public class DisplayMock extends EntityMock implements Display
{

	private int interpolationDuration = 0;
	private float viewRange = 0;
	private float shadowRadius = 0;
	private float shadowStrength = 0;
	private float displayWidth = 0;
	private float displayHeight = 0;
	private int interpolationDelay = 0;
	private Billboard billboard = Billboard.CENTER;
	private Color glowColorOverride = null;
	private Brightness brightness = null;

	/**
	 * Constructs a new EntityMock on the provided {@link DisplayMock} with a specified {@link UUID}.
	 *
	 * @param server The server to create the entity on.
	 * @param uuid   The UUID of the entity.
	 */
	protected DisplayMock(@NotNull ServerMock server, @NotNull UUID uuid)
	{
		super(server, uuid);
	}

	@Override
	public @NotNull Transformation getTransformation()
	{
		throw new UnimplementedOperationException();
	}

	@Override
	public void setTransformation(@NotNull Transformation transformation)
	{
		throw new UnimplementedOperationException();
	}

	@Override
	public void setTransformationMatrix(@NotNull Matrix4f transformationMatrix)
	{
		throw new UnimplementedOperationException();
	}

	@Override
	public int getInterpolationDuration()
	{
		return this.interpolationDuration;
	}

	@Override
	public void setInterpolationDuration(int duration)
	{
		this.interpolationDuration = duration;
	}

	@Override
	public float getViewRange()
	{
		return this.viewRange;
	}

	@Override
	public void setViewRange(float range)
	{
		this.viewRange = range;
	}

	@Override
	public float getShadowRadius()
	{
		return this.shadowRadius;
	}

	@Override
	public void setShadowRadius(float radius)
	{
		this.shadowRadius = radius;
	}

	@Override
	public float getShadowStrength()
	{
		return this.shadowStrength;
	}

	@Override
	public void setShadowStrength(float strength)
	{
		this.shadowStrength = strength;
	}

	@Override
	public float getDisplayWidth()
	{
		return this.displayWidth;
	}

	@Override
	public void setDisplayWidth(float width)
	{
		this.displayWidth = width;
	}

	@Override
	public float getDisplayHeight()
	{
		return this.displayHeight;
	}

	@Override
	public void setDisplayHeight(float height)
	{
		this.displayHeight = height;
	}

	@Override
	public int getInterpolationDelay()
	{
		return this.interpolationDelay;
	}

	@Override
	public void setInterpolationDelay(int ticks)
	{
		this.interpolationDelay = ticks;
	}

	@Override
	public @NotNull Billboard getBillboard()
	{
		return this.billboard;
	}

	@Override
	public void setBillboard(@NotNull Billboard billboard)
	{
		Preconditions.checkNotNull(billboard, "billboard cannot be null");
		this.billboard = billboard;
	}

	@Override
	public @Nullable Color getGlowColorOverride()
	{
		return this.glowColorOverride;
	}

	@Override
	public void setGlowColorOverride(@Nullable Color color)
	{
		this.glowColorOverride = color;
	}

	@Override
	public @Nullable Brightness getBrightness()
	{
		return this.brightness;
	}

	@Override
	public void setBrightness(@Nullable Brightness brightness)
	{
		this.brightness = brightness;
	}

}
