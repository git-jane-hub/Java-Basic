package string01;

public class RR02 {
	public static void main(String[] args) {
		String news = "zCNNA cache of internal Champlain Towers South documents obtained by CNNs Erin Burnett OutFront sheds new light on the urgent conversations about the required construction on the building in the months leading up to its collapse.In a series of presentations delivered in the fall and winter of 2020, residents were shown slides titled why we have to do all this now and told that the driveway on top of the buildings garage had very poor drainage (design flaw).There is no waterproofing layer over the garage in the driveway or any area except the pool deck and planters. This has exposed the garage to water intrusion for 40 years. Where there is waterproofing, it has failed. Water has gotten underneath and caused additional damage to the concrete, one presentation, from October of that year, reads.";
		news = news.toLowerCase();
		char [] alphabet = new char [26];
		for(int a = 0; a < alphabet.length; a++) {
			int count = 0;
			alphabet[a] = (char)(a + 97);
			for(int b = 0; b < news.length(); b++) {
				if(alphabet[a] == news.charAt(b)) {
					count++;
				}
			}
			System.out.println(alphabet[a] + "의 개수: " + count);
		}
	}
}
