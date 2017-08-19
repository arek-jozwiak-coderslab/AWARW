package pl.coderslab.logicerror;

/**
 * Jest celowy błąd w tej klasie
 * @author dell
 *
 */
public class GradeUtils {

	private double[][] grades;
	private double[] avg;
	private double generalAvg;

	public GradeUtils(double[][] grades) {
		this.grades = grades;
		this.avg = getAvg();
		this.generalAvg = getGeneralAvg();
	}

	static final String[] names = { "Polski", "Matematyka", "Angielski", "W-F" };

	/**
	 * Zwraca tablicę średnich z poszczególnych przedmiotów
	 * 
	 * @return double[]
	 */
	public double[] getAvg() {
		double avg[] = new double[grades.length];

		for (int i = 0; i < grades.length; i++) {
			avg[i] = grades[i][1] / grades[i][0];
		}
		return avg;
	}

	/**
	 * Drukuje informacje o średniej ze wszystkich przedmiotów
	 * 
	 * @return String
	 */
	public String printAvg() {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < names.length; i++) {
			sb.append("<p>Srednia z przedmiotu: ").append(names[i]).append(" to ").append(String.format("%4.2f" ,avg[i])).append("</p>");
		}
		return sb.toString();
	}

	/**
	 * Oblicza ogólną średnią
	 * 
	 * @return double
	 */
	public double getGeneralAvg() {
		double tmpAvg = 0;
		for (int i = 0; i < avg.length; i++) {
			tmpAvg += avg[i];
		}
		return tmpAvg / avg.length;
	}

	/**
	 * Drukuje informacje o ogólnej średniej
	 * 
	 * @return String
	 */
	public String printGeneralAvg() {
		return "Ogólna średnia to: " + String.format("%4.2f" , this.generalAvg);
	}

}