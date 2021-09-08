package lgs.lviv.ua;

import java.util.Scanner;

/**
 * Class description goes here.
 *
 * @version 1.1 08 Sep 2021
 * @author Roman G-sky
 */

public class App_Days {

	public static void main(String[] args) throws WrongInputConsoleParametersException, InputMismatchException {

		Mons[] arraymis = Mons.values(); // array of month
		Seasons[] arraysiz = Seasons.values(); // array of seasons
		Scanner scan = new Scanner(System.in);

		while (true) {

			System.out.println("Натисніть 1 щоб ввести місяць : ");
			System.out.println("Натисніть 2 щоб ввести пору року : ");
			System.out.println("Натисніть 3 щоб ввести кількість днів : ");
			System.out.println("Натисніть 4 щоб ввести кількість днів і відобразити менші : ");
			System.out.println("Натисніть 5 щоб ввести кількість днів і відобразити більші : ");
			System.out.println("Натисніть 6 щоб ввести пору року : ");
			System.out.println("Натисніть 7 щоб ввести пору року : ");
			System.out.println("Натисніть 8 щоб вивести місяці з парною кількістю днів : ");
			System.out.println("Натисніть 9 щоб вивести місяці з не парною кількістю днів : ");
			System.out.println("Натисніть 10 щоб ввести місяць : ");

			switch (scan.next())

			{

			case "1": { // check if month is available
				System.out.println("Введіть місяць : ");
				scan = new Scanner(System.in);
				String monssc = scan.next().toLowerCase();

				boolean flag = false;

				for (Mons m : arraymis) {
					if (m.name().equals(monssc)) {
						System.out.println("Введений Вами місяць існуєº");
						flag = true;
					}
				}
				if (!flag) {
					throw new WrongInputConsoleParametersException("Введений Вами місяць на планеті Земля ше не існує");
				}
			}
				break;

			case "2": { // check if season is available
				System.out.println("Введіть пору року : ");
				scan = new Scanner(System.in);
				String seasonsc = scan.next().toUpperCase();

				boolean flag = false;

				for (Mons m : arraymis) {
					if (m.getSeason().name().equals(seasonsc)) {
						flag = true;
					}
				}
				if (flag) {
					System.out.println("Введена Вами пора року " + seasonsc + " має такі місяці : ");
					for (Mons m2 : arraymis) {
						if (m2.getSeason().name().toString().equalsIgnoreCase(seasonsc)) {
							System.out.println(m2);
						}
					}
				}

				if (!flag) {
					throw new WrongInputConsoleParametersException(
							"Введена Вами пора року на планеті Земля ше не існує");
				}
			}
				break;

			case "3": { // check how many month have similar quantity of days
				System.out.println("Введіть кількість днів в місяці : ");
				scan = new Scanner(System.in);
				int daysc = scan.nextInt();

				boolean flag = false;

				for (Mons m : arraymis) {
					if (m.getDay() == daysc) {
						flag = true;
					}
				}
				if (flag) {
					System.out.println("Введена кількість днів " + daysc + " присутня в таких місяцях: ");
					for (Mons m2 : arraymis) {
						if (m2.getDay() == daysc) {
							System.out.println(m2);
						}
					}
				}
				if (!flag) {
					throw new InputMismatchException("Місяця із " + daysc + " кількістю днів не існує");

				}
			}

				break;

			case "4": { // check how many month have less quantity of days
				System.out.println("Введіть кількість днів в місяці : ");
				scan = new Scanner(System.in);
				int daysc = scan.nextInt();

				boolean flag = false;

				for (Mons m : arraymis) {
					if (m.getDay() == daysc) {
						flag = true;
					}
				}
				if (flag) {
					System.out.println("Місяці із меншою кількістю днів : ");
					for (Mons m2 : arraymis) {
						if (m2.getDay() < daysc) {
							System.out.println(m2);
						}
					}
				}
				if (!flag) {
					throw new InputMismatchException("Місяця із " + daysc + " кількістю днів не існує");
				}
			}
				break;

			case "5": { // check how many month have more quantity of days
				System.out.println("Введіть кількість днів в місяці : ");
				scan = new Scanner(System.in);
				int daysc = scan.nextInt();

				boolean flag = false;

				for (Mons m : arraymis) {
					if (m.getDay() == daysc) {
						flag = true;
					}
				}
				if (flag) {
					System.out.println("Місяці із більшою кількістю днів : ");
					for (Mons m2 : arraymis) {
						if (m2.getDay() > daysc) {
							System.out.println(m2);
						}
					}
				}
				if (!flag) {
					throw new InputMismatchException("Місяця із більшою кількістю днів ніж " + daysc + " кількістю днів не існує");
				}
			}
				break;

			case "6": { // check next season
				System.out.println("Введіть пору року : ");
				scan = new Scanner(System.in);
				String seasonsc = scan.next().toUpperCase();

				boolean flag = false;

				for (Seasons s : arraysiz) {
					if (s.name().equals(seasonsc)) {
						flag = true;
					}
				}
				if (flag) {

					Seasons s2 = Seasons.valueOf(seasonsc);
					int i = s2.ordinal();

					if (i == (arraysiz.length - 1)) {
						i = 0;
						System.out.println("Наступна пора року : " + arraysiz[i]);
					} else {
						System.out.println("Наступна пора року : " + arraysiz[i + 1]);
					}
					if (!flag) {
						throw new WrongInputConsoleParametersException(
								"Введена Вами пора року на планеті Земля ше не існує");
					}
				}
			}
				break;

			case "7": { // check previous season
				System.out.println("Введіть пору року : ");
				scan = new Scanner(System.in);
				String seasonsc = scan.next().toUpperCase();

				boolean flag = false;

				for (Seasons s : arraysiz) {
					if (s.name().equals(seasonsc)) {
						flag = true;
					}
				}
				if (flag) {

					Seasons s2 = Seasons.valueOf(seasonsc);
					int i = s2.ordinal();

					if (i == 0) {
						i = (arraysiz.length - 1);
						System.out.println("Попередня пора року : " + arraysiz[i]);
					} else {
						System.out.println("Попередня пора року : " + arraysiz[i - 1]);
					}
					if (!flag) {
						throw new WrongInputConsoleParametersException(
								"Введений Вами пора року на планеті Земля ше не існує");
					}
				}
			}
				break;

			case "8": { // check is quantity days of month even number
				for (Mons m : arraymis) {
					if (m.getDay() % 2 == 0) {
						System.out.println("Парні місяці : " + m);
					}
				}
			}
				break;

			case "9": { // check is quantity days of month odd number
				for (Mons m : arraymis) {
					if (m.getDay() % 2 != 0) {
						System.out.println("Не парні місяці : 9" + m);
					}
				}
			}
				break;

			case "10": { // check is the month even or odd
				System.out.println("Введіть місяць : ");
				scan = new Scanner(System.in);
				String monssc = scan.next().toLowerCase();

				boolean flag = false;

				for (Mons m : arraymis) {
					if (m.name().equals(monssc)) {
						flag = true;
					}
				}
				if (flag) {

					Mons m2 = Mons.valueOf(monssc);

					if (m2.getDay() % 2 == 0) {
						System.out.println("Вказаний Вами місяць " + monssc + "парний");
					} else {
						System.out.println("Вказаний Вами місяць " + monssc + " не парний");
					}
				}
				if (!flag) {

					throw new WrongInputConsoleParametersException("Введений Вами місяць на планеті Земля ше не існує");
				}

				break;
			}
			}
		}
	}
}
