class StringCompare {

	public static int compare(String a, String b) {
		if (a.length() == b.length()) {
			int equals = 0;
			for (int i = 0; i < a.length(); i++) {
				if (a.charAt(i) == b.charAt(i)) {
					equals++;
				}
			}
			return equals;
		}

		return -1;
	}
}
