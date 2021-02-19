package org.lang;

public class StateDetails extends LanguageInfo {
	public void southIndia() {
		System.out.println("SouthIndia - Tamilnadu,Kerela,Karnataka,..");
	}
	public void northIndia() {
		System.out.println("NorthIndia- Delhi,Punjab,Maharastra,...");
	}
	public static void main(String[] args) {
		StateDetails sd = new StateDetails();
		sd.southIndia();
		sd.northIndia();
		sd.tamilLanguage();
		sd.englishLanguage();
		sd.hindiLanguage();
	}
}
