class MinOfFour {
	public static void main(String[] args) {
		int a = 10;
		int b = 26;
		int c = 16;
		int d = 3;
		if (a < b) {
			if (a < c) {
				System.out.println(a + " is minimum");
			} else if (a < d) {
				System.out.println(a + "is minimum");
			}

		} else if (b < c) {
			if (b < d) {
				System.out.println(b + "is minimum");
			}

			else if (c < d) {

				System.out.println(c + "is minimum");
			}
		} else {
			System.out.println(d + "is minimum");
		}
	}
}
