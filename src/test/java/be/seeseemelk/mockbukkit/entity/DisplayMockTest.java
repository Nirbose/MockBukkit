package be.seeseemelk.mockbukkit.entity;

import be.seeseemelk.mockbukkit.MockBukkit;
import be.seeseemelk.mockbukkit.ServerMock;
import org.bukkit.Color;
import org.bukkit.entity.Display;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class DisplayMockTest
{

	private DisplayMock display;

	@BeforeEach
	void setUp()
	{
		ServerMock server = MockBukkit.mock();
		display = new DisplayMock(server, UUID.randomUUID());
	}

	@AfterEach
	void tearDown()
	{
		MockBukkit.unmock();
	}

	@Test
	void testGetInterpolationDuration()
	{
		assertEquals(0, display.getInterpolationDuration());
	}

	@Test
	void testSetInterpolationDuration()
	{
		display.setInterpolationDuration(10);
		assertEquals(10, display.getInterpolationDuration());
	}

	@Test
	void testGetViewRange()
	{
		assertEquals(0, display.getViewRange());
	}

	@Test
	void testSetViewRange()
	{
		display.setViewRange(10);
		assertEquals(10, display.getViewRange());
	}

	@Test
	void testGetShadowRadius()
	{
		assertEquals(0, display.getShadowRadius());
	}

	@Test
	void testSetShadowRadius()
	{
		display.setShadowRadius(10);
		assertEquals(10, display.getShadowRadius());
	}

	@Test
	void testShadowStrength()
	{
		assertEquals(0, display.getShadowStrength());
	}

	@Test
	void testSetShadowStrength()
	{
		display.setShadowStrength(10);
		assertEquals(10, display.getShadowStrength());
	}

	@Test
	void testGetDisplayWidth()
	{
		assertEquals(0, display.getDisplayWidth());
	}

	@Test
	void testSetDisplayWidth()
	{
		display.setDisplayWidth(10);
		assertEquals(10, display.getDisplayWidth());
	}

	@Test
	void testGetDisplayHeight()
	{
		assertEquals(0, display.getDisplayHeight());
	}

	@Test
	void testSetDisplayHeight()
	{
		display.setDisplayHeight(10);
		assertEquals(10, display.getDisplayHeight());
	}

	@Test
	void testGetInterpolationDelay()
	{
		assertEquals(0, display.getInterpolationDelay());
	}

	@Test
	void testSetInterpolationDelay()
	{
		display.setInterpolationDelay(10);
		assertEquals(10, display.getInterpolationDelay());
	}

	@Test
	void testGetBillboard()
	{
		assertEquals(Display.Billboard.CENTER, display.getBillboard());
	}

	@Test
	void testSetBillboard()
	{
		display.setBillboard(Display.Billboard.HORIZONTAL);
		assertEquals(Display.Billboard.HORIZONTAL, display.getBillboard());
	}

	@Test
	void testGlowColorOverride()
	{
		assertNull(display.getGlowColorOverride());
	}

	@Test
	void testSetGlowColorOverride()
	{
		Color color = Color.fromRGB(10);

		display.setGlowColorOverride(color);
		assertEquals(color, display.getGlowColorOverride());
	}

	@Test
	void testGetBrightness()
	{
		assertNull(display.getBrightness());
	}

	@Test
	void testSetBrightness()
	{
		Display.Brightness brightness = new Display.Brightness(10, 20);

		display.setBrightness(brightness);
		assertEquals(brightness, display.getBrightness());
	}

}
