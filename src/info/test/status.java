package info.test;

public class status {
	String Name;
	String Job;
	int STR;
	int DEF;
	int MAG;
	int SPD;

	status(String Name, String Job, int STR, int DEF, int MAG, int SPD) {
		this.Name = Name;
		this.Job = Job;
		this.STR = STR;
		this.DEF = DEF;
		this.MAG = MAG;
		this.SPD = SPD;
	}

	status(String Name, int DEF, int MAG, int SPD) {
		this(Name, "戦士", 100, DEF, MAG, SPD);
	}

	status(String Name, int STR, int SPD) {
		this(Name, "魔法使い", STR, 10, 100, SPD);
	}

	status(String Name, String Job) {
		this(Name, Job, 70, 30, 20, 70);
	}

	status(String Name) {
		this(Name, "盗賊", 50, 30, 20, 100);
	}

	status() {
		this("ロト", "勇者", 80, 50, 60, 70);
	}

	void STRUP() {
		this.STR += 5;
	}

	void MAGUP() {
		this.MAG += 5;
	}

	void SPDUP() {
		this.SPD += 5;
	}
}
