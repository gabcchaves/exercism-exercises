class AnnalynsInfiltration {
    public static boolean canFastAttack(boolean knightIsAwake) {
				return !knightIsAwake ? true : false;
    }

    public static boolean canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake) {
				return knightIsAwake || archerIsAwake || prisonerIsAwake ? true : false;
    }

    public static boolean canSignalPrisoner(boolean archerIsAwake, boolean prisonerIsAwake) {
				return prisonerIsAwake && !archerIsAwake ? true : false;
    }

    public static boolean canFreePrisoner(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake, boolean petDogIsPresent) {
				// First way || Second way
				if ((petDogIsPresent && !archerIsAwake) || (!petDogIsPresent && !knightIsAwake && !archerIsAwake && prisonerIsAwake))
					return true;
				// Prisioner can't be freed
				return false;
		}
}
