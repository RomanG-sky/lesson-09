package lgs.lviv.ua;

import java.util.Scanner;

public enum Mons {

	january(Seasons.WINTER, 31), february(Seasons.WINTER, 28), march(Seasons.SPRING, 31), april(Seasons.SPRING, 30),
	may(Seasons.SPRING, 31), june(Seasons.SUMMER, 30), july(Seasons.SUMMER, 31), august(Seasons.SUMMER, 31),
	september(Seasons.AUTUMN, 30), october(Seasons.AUTUMN, 31), november(Seasons.AUTUMN, 30),
	december(Seasons.WINTER, 31);

	int day;
	Seasons season;

	Mons(Seasons season, int day) {
		this.season = season;
		this.day = day;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public Seasons getSeason() {
		return season;
	}

	public void setSeason(Seasons season) {
		this.season = season;

	}
	
}