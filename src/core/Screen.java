package core;

import java.util.Random;

public class Screen {
	private int width, height;
	int x, y;
	public int[] pixels;
	public final int MAP_SIZE = 64;
	public final int MAP_SIZE_MASK = MAP_SIZE - 1;

	public int[] tiles = new int[MAP_SIZE * MAP_SIZE];

	private Random rand = new Random();

	public Screen(int width, int height) {
		this.width = width;
		this.height = height;
		pixels = new int[width * height];

		for (int i = 0; i < 32 * 32; i++) {
			tiles[i] = rand.nextInt(0x9900CC);
		}
	}

	public void clear() {
		for (int i = 0; i < pixels.length; i++) {
			pixels[i] = 0;
		}
	}

	public void render() {
		for (int y = 0; y < height; y++) {
			if (y < 0 || y >= height)
				break;
			for (int x = 0; x < width; x++) {
				if (x < 0 || x >= width)
					break;
			}
		}
	}
}