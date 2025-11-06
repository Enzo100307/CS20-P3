package SkillBuilders;

public class SpanishNumbers {

	public static void displaySpanishNumber(int number) {
		// TODO Auto-generated method stub
		
		String spanishWord;
		switch (number) {
		
	case 1:
        spanishWord = "uno";
        break;
    case 2:
        spanishWord = "dos";
        break;
    case 3:
        spanishWord = "tres";
        break;
    case 4:
        spanishWord = "cuatro";
        break;
    case 5:
        spanishWord = "cinco";
        break;
    case 6:
        spanishWord = "seis";
        break;
    case 7:
        spanishWord = "siete";
        break;
    case 8:
        spanishWord = "ocho";
        break;
    case 9:
        spanishWord = "nueve";
        break;
    case 10:
        spanishWord = "diez";
        break;
    default:
        spanishWord = "Number out of range (1-10)";
        break;
}
System.out.println(number + " " + spanishWord);
}

public static void main(String[] args) {

for (int i = 1; i <= 10; i++) {
    displaySpanishNumber(i);
}

	}

}
