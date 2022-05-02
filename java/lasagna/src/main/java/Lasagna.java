public class Lasagna {
		public int expectedMinutesInOven() {
			return 40;
		}

		public int remainingMinutesInOven(int elapsedTimeInOven) {
			return expectedMinutesInOven() - elapsedTimeInOven;
		}

		public int preparationTimeInMinutes(int numLayers) {
			return numLayers * 2;
		}

		public int totalTimeInMinutes(int numLayers, int elapsedTimeInOven) {
			return preparationTimeInMinutes(numLayers) + elapsedTimeInOven;
		}
}
